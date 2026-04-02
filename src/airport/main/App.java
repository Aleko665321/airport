package airport.main;

import airport.exceptions.InvalidFlightException;
import airport.model.*;
import airport.model.Interfaces.Bookable;
import airport.model.Interfaces.Flyable;
import airport.service.BookingService;
import airport.util.Box;
import airport.util.Pair;
import airport.enums.FlightStatus;
import java.util.function.*;
import airport.lambda.*;
import java.util.stream.Collectors;
import airport.record.BookingRecord;
import airport.resource.AirportResource;
import java.lang.reflect.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class App {

    public static void main(String[] args){

        Ticket ticket = new Ticket("12A", new BigDecimal("199.99"));
        Passenger passenger = new Passenger("Aleko", ticket);

        Pilot pilot = new Pilot("John", 10);
        FlightAttendant attendant = new FlightAttendant("Anna", "English");

        FlightStatus status = FlightStatus.ON_TIME;
        System.out.println(status);
        System.out.println(status.getCode());

        CrewMember[] crew = {pilot, attendant};
        Passenger[] passengers = {passenger};

        Flight flight = null;

        try {
            flight = new Flight(
                    1,
                    "Paris",
                    LocalDateTime.now().plusDays(1),
                    passengers,
                    crew
            );
        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }

        Flyable f = pilot;
        f.fly();

        if (flight != null) {

            Bookable b = flight;
            b.book();

            Gate gate = new Gate("G1", flight);
            Gate[] gates = {gate};

            Terminal terminal = new Terminal("T1", gates);
            Terminal[] terminals = {terminal};

            Airline airline = new Airline(
                    "Air Georgia",
                    new Terminal[]{terminal},
                    new BigDecimal("50000000"),
                    20,
                    "Georgia"
            );

            Airport airport = new Airport("Tbilisi Airport", terminals, airline);

            airport.addFlight(flight);
            airport.addPassenger(passenger);

            airport.demoCollectionMethods();
            airport.iterateCollections();

            BookingService.bookSeat(passenger, ticket);

            System.out.println("Total bookings: " + BookingService.getBookingCount());
            System.out.println("Airport name: " + airport.getName());

            Box<Passenger> passengerBox = new Box<>();
            passengerBox.set(passenger);
            System.out.println(passengerBox.get());

            Pair<Integer, Flight> flightPair = new Pair<>(flight.getId(), flight);
            System.out.println(flightPair.getKey() + " -> " + flightPair.getValue());

            Predicate<Passenger> isAdult = p -> p.getName().length() > 3;
            Function<Flight, String> flightInfo = fl -> fl.toString();
            Consumer<Passenger> printPassenger = p -> System.out.println(p);
            Supplier<Double> randomPrice = () -> Math.random() * 1000;
            UnaryOperator<Integer> square = x -> x * x;

            System.out.println(isAdult.test(passenger));
            System.out.println(flightInfo.apply(flight));
            printPassenger.accept(passenger);
            System.out.println(randomPrice.get());
            System.out.println(square.apply(5));

            FlightOperation op = fl -> System.out.println("Operating flight: " + fl);
            op.execute(flight);

            PassengerFilter filter = p -> p.getName().startsWith("A");
            System.out.println(filter.test(passenger));

            PriceCalculator calculator = price -> price * 1.2;
            System.out.println(calculator.calculate(100));

            System.out.println("---- STREAMS ----");

            airport.getFlights().stream().forEach(System.out::println);

            airport.getFlights().stream()
                    .filter(fl -> fl.getId() > 0)
                    .forEach(System.out::println);

            airport.getFlights().stream()
                    .map(Object::toString)
                    .forEach(System.out::println);

            long count = airport.getFlights().stream().count();
            System.out.println("Flight count: " + count);

            airport.getFlights().stream()
                    .findFirst()
                    .ifPresent(System.out::println);

            boolean any = airport.getPassengers().stream()
                    .anyMatch(p -> p.getName().startsWith("A"));
            System.out.println("Any passenger starts with A: " + any);

            airport.getFlights().stream()
                    .map(Flight::getId)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);

            BookingRecord record = new BookingRecord(
                    flight.getId(),
                    passenger.getName(),
                    "Paris"
            );
            System.out.println(record);
        }

        try (AirportResource resource = new AirportResource()) {
            resource.open();
        }

        try {
            System.out.println("---- REFLECTION ----");

            Class<?> clazz = Flight.class;

            for (Field field : clazz.getDeclaredFields()) {
                System.out.println("Field: " + field.getName());
            }

            for (Method m : clazz.getDeclaredMethods()) {
                System.out.println("Method: " + m.getName());
            }

            for (Constructor<?> c : clazz.getConstructors()) {
                System.out.println("Constructor: " + c);
            }

            Constructor<?> constructor = clazz.getConstructor(
                    int.class,
                    String.class,
                    java.time.LocalDateTime.class,
                    Passenger[].class,
                    CrewMember[].class
            );

            Object obj = constructor.newInstance(
                    2,
                    "Berlin",
                    LocalDateTime.now().plusDays(2),
                    passengers,
                    crew
            );

            Method method = clazz.getMethod("printFlightInfo");
            method.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
