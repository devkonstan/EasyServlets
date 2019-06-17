package Exchange;

import java.util.stream.Stream;

public enum CurrencyConv {
    PLN_USD("PLN", "USD", 0.26091F),
    USD_PLN("USD", "PLN", 3.83271F),
    PLN_EUR("PLN", "EUR", 0.23356F),
    EUR_PLN("EUR", "PLN", 4.28159F),
    EUR_USD("EUR", "USD", 1.11712F),
    USD_EUR("USD", "EUR", 0.89516F);

    private String in;
    private String out;
    private float value;

    CurrencyConv(String in, String out, float value) {
        this.in = in;
        this.out = out;
        this.value = value;
    }

    public static float convertCurrency(String in, String out, float value) {
        return Stream.of(values())
                .filter((CurrencyConv currencyConv) -> {
                    return currencyConv.in.equals(in) && currencyConv.out.equals(out);
                })
                .map((CurrencyConv currencyConv) -> {
                    return value * currencyConv.value;
                })
                .findAny()
                .orElse(value);
    }

//        for (Exchange.CurrencyConv currencyConv : values()) {
//            if (currencyConv.in.equals(in) && currencyConv.out.equals(out)) {
//                return value * currencyConv.value;
//            }
//        }
//        return value;
//    }

}
