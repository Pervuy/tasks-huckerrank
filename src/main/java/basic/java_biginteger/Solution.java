package basic.java_biginteger;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    BigInteger a = new BigInteger(scanner.nextLine());
    BigInteger b = new BigInteger(scanner.nextLine());

    System.out.println(a.add(b));
    System.out.println(a.multiply(b));
  }
}
