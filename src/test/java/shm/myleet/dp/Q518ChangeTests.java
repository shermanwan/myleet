package shm.myleet.dp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q518ChangeTests {

  Q518Change solution = new Q518Change();

  @Test
  public void demo1() {
    int[] input = { 1, 2, 5 };
    int expect = 4;

    int output = solution.change(5, input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void demo2() {
    int[] input = { 10 };
    int expect = 1;

    int output = solution.change(10, input);
    Assertions.assertEquals(expect, output);
  }

}
