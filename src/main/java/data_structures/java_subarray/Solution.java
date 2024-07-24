package data_structures.java_subarray;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

  public static void main(String[] args) throws IOException {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();//кількість елементів в масиві
//    String line = scanner.nextLine();

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine());
    String line = bufferedReader.readLine();


    bufferedReader.close();

    String[] strings = line.split(" ");

    List<Integer> list = Arrays.stream(strings).map(Integer::parseInt).toList();

    List<List<String>> lists = IntStream.iterate(0, i -> i + 1)
            .limit(list.size() - 2)
            .mapToObj(
                    i -> IntStream.iterate(i + 1, j -> j + 1)
                            .limit(list.size() - i)
                            .mapToObj(j -> String.format("i=%d j=%d", i, j)).toList()
            // .forEach(j-> System.out.println("i="+i+" j="+j)
    ).toList();
    System.out.println(lists);

    //System.out.println(splitByLength(list));


  }
  public static List<List<Integer>> splitByLength(List<Integer> list) {

       return IntStream.iterate(0, i -> i + 1)
             .limit(list.size()-2)
             .mapToObj(
                     i->IntStream.iterate(i+1, j -> j + i-1)
                             .limit(list.size()-1)
                             .mapToObj(list::get).toList()).toList();


  }
}
