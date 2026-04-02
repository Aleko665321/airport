package airport.model.finalclass;

import java.math.BigDecimal;

public final class Constants {
    public static final BigDecimal TAX_RATE;

    static { // static block
        TAX_RATE = new BigDecimal("0.18");
        System.out.println("Constants class loaded, TAX_RATE set!");
    }

    private Constants() {}
}