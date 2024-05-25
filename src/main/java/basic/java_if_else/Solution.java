package basic.java_if_else;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;


public class Solution {
  public static void main(String[] args) throws IOException {
    /*Given an integer, n, perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird*/

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    bufferedReader.close();

    String mess = checkNumber(N);
    System.out.println(mess);

  }

  public static String checkNumber(int n) {
    if ((n % 2) !=0 || (n>=6 && n<=20)){
      return "Weird";
    }else {
      return "Not Weird";
    }
  }

}