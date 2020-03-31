import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale INDIA = new Locale("en", "IN");

        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIndia = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat nfChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nfFrance.format(payment);
        String us = nfUS.format(payment);
        String india = nfIndia.format(payment);
        String china = nfChina.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
