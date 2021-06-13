package shm.myleet.dp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q474FindMaxFormTests {

  Q474FindMaxForm solution = new Q474FindMaxForm();

  @Test
  public void demo1() {
    String[] input = { "10", "0001", "111001", "1", "0" };
    int expect = 4;

    int output = solution.findMaxForm(input, 5, 3);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void demo2() {
    String[] input = { "10", "0", "1" };
    int expect = 2;

    int output = solution.findMaxForm(input, 1, 1);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void revise1() {
    String[] input = { "10", "0001", "111001", "1", "0" };
    int expect = 3;

    int output = solution.findMaxForm(input, 3, 4);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void revise2() {
    String[] input = { "11111", "100", "1101", "1101", "11000" };
    int expect = 3;

    int output = solution.findMaxForm(input, 5, 7);
    Assertions.assertEquals(expect, output);
  }

}
