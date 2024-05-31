package basic.static_initializer_bloc;

import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner scanner = new Scanner(System.in);
    int b = Integer.parseInt(scanner.nextLine());
    int h = Integer.parseInt(scanner.nextLine());

    if (b <=0 || h <= 0){
      System.out.println(new Exception("Breadth and height must be positive"));
    }else {
      System.out.println(b*h);
    }


  }
}
