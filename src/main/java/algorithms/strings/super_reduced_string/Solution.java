package algorithms.strings.super_reduced_string;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

  /*
   * Complete the 'superReducedString' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String superReducedString(String s) {
    // Write your code here

    StringBuilder sb = new StringBuilder(s);
    for(int i = 1; i < sb.length(); i++) {
      if(sb.charAt(i-1) == sb.charAt(i)) {
        sb.replace(i-1, i+1, "");
        i=0;
      }
    }
    s = sb.toString();

    return s.isEmpty() ? "Empty String" : s;

  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String s = bufferedReader.readLine();

    String result = Result.superReducedString(s);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}