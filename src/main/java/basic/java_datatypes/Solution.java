package basic.java_datatypes;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int t = Integer.parseInt(scanner.nextLine());
    String [] results = new String[t];
    for (int i = 0; i < t; i++) {
      results[i] = scanner.nextLine();
    }

    checkNumbers(results);

  }

  private static void checkNumbers(String[] results) {

    for (String result : results) {
      StringBuilder sb = new StringBuilder();
      try {
        Long.parseLong(result);
        sb.append("* long");

        Integer.parseInt(result);
        sb.insert(0, "* int\n");

        Short.parseShort(result);
        sb.insert(0, "* short\n");

        Byte.parseByte(result);
        sb.insert(0, "* byte\n");

      } catch (NumberFormatException ignored) {

      }
      if (sb.isEmpty()) {
        sb.append(String.format("%s can't be fitted anywhere.", result));
      } else {
        sb.insert(0, String.format("%s can be fitted in:\n", result));
      }
      System.out.println(sb);
    }

  }
}
