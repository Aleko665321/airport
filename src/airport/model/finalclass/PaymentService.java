package airport.model.finalclass;

import java.math.BigDecimal;

public class PaymentService {
    public final void payInvoice(BigDecimal amount) {
        System.out.println("Paid: " + amount);
    }
}