package basic.java_big_number.bigdecimal;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.function.Function;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine());

        List<String> strings = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            strings.add(scanner.nextLine());
        }

        strings.stream()
                .sorted(Comparator.comparing(a -> new BigDecimal(String.valueOf(a))).reversed())
                .forEach(System.out::println);

    }
}
