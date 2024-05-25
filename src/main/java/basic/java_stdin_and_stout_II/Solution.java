package basic.java_stdin_and_stout_II;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.nextLine());
    double b = Double.parseDouble(scanner.nextLine());
    String c = scanner.nextLine();

    System.out.println("String: " + c);
    System.out.println("Double: " + b);
    System.out.println("Int: " + a);


  }
}
