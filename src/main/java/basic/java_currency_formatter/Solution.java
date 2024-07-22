package basic.java_currency_formatter;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Solution {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    System.out.println("US: " + getFormattedPayment(Locale.US, payment));
    System.out.println("India: " + getFormattedPayment(new Locale("en", "IN"), payment));
    System.out.println("China: " + getFormattedPayment(Locale.CHINA, payment));
    System.out.println("France: " + getFormattedPayment(Locale.FRANCE, payment));
  }

  public static String getFormattedPayment(Locale locale, Double payment){

    return NumberFormat.getCurrencyInstance(locale).format(payment);
  }
}
