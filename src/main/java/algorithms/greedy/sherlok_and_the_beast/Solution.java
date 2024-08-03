package algorithms.greedy.sherlok_and_the_beast;

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
   * Complete the 'decentNumber' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void decentNumber(int n) {

    // отримуємо всі можливі варіанти кількості п'ятірок та трійок
    // п'ятірки соруємо від максимального
    // тому що щоб отримати максимальне число в першу чергу повинно йти максимальна кількість п'ятірок, а потім трійки
    List<Integer> collect3 = IntStream.iterate(5, i -> i <= n, i -> i + 5).boxed().collect(toList());
    List<Integer> collect5 = IntStream.iterate(3, i -> i <= n, i -> i + 3).boxed().sorted(Collections.reverseOrder()).collect(toList());

    // черговість перевірки саме така,  тому що максимальне число буде складатись із п'ятірок
    // або п'ятірки повинні йти перші, а потім уже трійки і
    // при цьому максимальна кількість повинна бути п'ятірок і мінімальна трійок
    // або будуть тільки трійки і це буде найменше із можливих
    //
    if (collect5.contains(n)){
      // якщо введене число уже є в колекції collect5, тоді воно й буде максимальним
      System.out.println(String.valueOf(5).repeat(n));
    } else {
      // далі перевіряємо чи сума елементів із collect5 та collect3 дорівнює введеному числу
      // якщо дорівнює тоді формуємо число і закірчуємо перевірку
      for (int count5:collect5) {
        for (int count3:collect3) {
          if (count5+count3 == n){
            System.out.println(String.valueOf(5).repeat(count5)+String.valueOf(3).repeat(count3));
            return;
          }
        }
      }
      // якщо перші два варіанти не знайшли тоді перевіряємо collect3
      if (collect3.contains(n)){
        System.out.println(String.valueOf(3).repeat(n));
      }else {
        System.out.println(-1);
      }
    }
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.decentNumber(n);
      } catch (IOException ex) {
        throw new RuntimeException(ex);
      }
    });

    bufferedReader.close();
  }
}