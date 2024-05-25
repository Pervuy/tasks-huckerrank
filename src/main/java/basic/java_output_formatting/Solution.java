package basic.java_output_formatting;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s1 = scanner.nextLine();
    String s2 = scanner.nextLine();
    String s3 = scanner.nextLine();
    String[] strings1 = s1.split(" ");
    String[] strings2 = s2.split(" ");
    String[] strings3 = s3.split(" ");
    System.out.println("================================");
    System.out.printf("%-15s%03d%n",strings1[0],Integer.parseInt(strings1[1]));
    System.out.printf("%-15s%03d%n",strings2[0],Integer.parseInt(strings2[1]));
    System.out.printf("%-15s%03d%n",strings3[0],Integer.parseInt(strings3[1]));
    System.out.println("================================");
//    ================================
//    java           100
//    cpp            065
//    python         050
  }
}
