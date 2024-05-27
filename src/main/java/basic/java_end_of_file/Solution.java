package basic.java_end_of_file;

import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    int numberLIne = 0;
    while (scanner.hasNext()){
      numberLIne++;
      sb.append(numberLIne).append(" ").append(scanner.nextLine()).append("\n");
    }
    System.out.println(sb);
  }
}
