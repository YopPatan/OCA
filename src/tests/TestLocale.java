package tests;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class TestLocale {
    public static void main(String[] args) {
        System.out.println("LOCALE");
        
        Locale usa = Locale.US;
        NumberFormat numFormat = NumberFormat.getCurrencyInstance(usa);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, usa);
        
        String numero1 = numFormat.format(3.223);
        String fecha1 = dateFormat.format(new Date());
        
        System.out.println("numero1: " + numero1);
        System.out.println("numero1: " + fecha1);
    }
}