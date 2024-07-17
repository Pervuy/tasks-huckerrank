package basic.java_substring_comparisons;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int n = Integer.parseInt(bufferedReader.readLine());

        bufferedReader.close();

        List<String> chunks = splitByLength(s, n);
        System.out.println(chunks.get(0));
        System.out.println(chunks.get(chunks.size()-1));

    }
    public static List<String> splitByLength(String str, int length) {

        return IntStream.iterate(0, i -> i + 1)//створює потік індексів із кроком 1
                .limit(str.length()-(length-1))
                .mapToObj(i -> str.substring(i, Math.min(i + length, str.length())))
                .collect(Collectors.toList())
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
