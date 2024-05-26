package basic.java_loops_II;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int q = Integer.parseInt(scanner.nextLine());
    String [] results = new String[q];
    for (int i = 0; i < q; i++) {
      String line = scanner.nextLine();
      String[] strings = line.split(" ");
      int a = Integer.parseInt(strings[0]);
      int b = Integer.parseInt(strings[1]);
      int n = Integer.parseInt(strings[2]);

      StringBuilder sb = new StringBuilder();
      int temp = a;
      for (int j = 0; j < n; j++) {
        temp = temp + (int) Math.pow(2, j) * b;
        if (j != 0){
          sb.append(" ");
        }
        sb.append(temp);
      }
      results [i] = sb.toString();
    }
    for (String result:results) {
      System.out.println(result);
    }
  }
}