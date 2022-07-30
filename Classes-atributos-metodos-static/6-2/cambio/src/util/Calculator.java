package util;

public class Calculator {
    public static final double iof = 0.06;

    public static double currencyConverter(double dolar, double quantity){
        return (dolar * quantity) + ((dolar * quantity) * iof);
    }

}
