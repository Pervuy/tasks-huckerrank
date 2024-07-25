package data_structures.java_1D_array;

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



public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> a = IntStream.range(0, n).mapToObj(i -> {
              try {
                return bufferedReader.readLine();
              } catch (IOException e) {
                throw new RuntimeException(e);
              }
            })
            .map(Integer::parseInt)
            .collect(toList());

    bufferedReader.close();

    a.forEach(System.out::println);
  }
}
