package data_structures.java_subarray;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine());
    String line = bufferedReader.readLine();


    bufferedReader.close();

    String[] strings = line.split(" ");

    List<Integer> list = Arrays.stream(strings).map(Integer::parseInt).collect(Collectors.toList());

    System.out.println(sizeNegativeSubarray(list));

  }
  public static int sizeNegativeSubarray(List<Integer> list) {

       return IntStream.range(0, list.size()).boxed()
               .flatMap(i -> IntStream.range(i + 1, list.size() + 1)
                       .mapToObj(j -> IntStream.range(i, j)
                               .mapToObj(list::get)
                               .toList())).filter(subarray -> subarray.stream().mapToInt(Integer::intValue).sum() < 0)
               .collect(Collectors.toList()).size();

  }
}
