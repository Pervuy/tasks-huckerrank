package strings.java_string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    String A = sc.next();

    StringBuilder sb = new StringBuilder();
    String reversA = sb.append(A).reverse().toString();

    if(A.equals(reversA)){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }

  }
}
