package basic.java_if_else;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {


  @Test
  void checkNumber3() {
    String mes = Solution.checkNumber(3);
    assertEquals("Weird",mes);
  }
  @Test
  void checkNumber24() {
    String mes = Solution.checkNumber(24);
    assertEquals("Not Weird",mes);
  }
  @Test
  void checkNumber1() {
    String mes = Solution.checkNumber(1);
    assertEquals("Weird",mes);
  }
  @Test
  void checkNumber6() {
    String mes = Solution.checkNumber(6);
    assertEquals("Weird",mes);
  }
}