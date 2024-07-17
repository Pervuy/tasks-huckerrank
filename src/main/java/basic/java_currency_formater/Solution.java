package basic.java_currency_formater;

import java.io.*;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException, ParseException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Double payment = Double.parseDouble(bufferedReader.readLine());

        bufferedReader.close();


        NumberFormat nfUS = NumberFormat.getCurrencyInstance(Locale.US);
        Locale localeINDIA = new Locale("en", "IN");
        NumberFormat nfINDIA = NumberFormat.getCurrencyInstance(localeINDIA);
        NumberFormat nfCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("US: " + nfUS.format(payment));
        System.out.println("India: " + nfINDIA.format(payment));
        System.out.println("China: " + nfCHINA.format(payment));;
        System.out.println("France: " + nfFRANCE.format(payment));

    }
}