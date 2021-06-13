package shm.myleet.dp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q343IntegerBreakTests {

  Q343IntegerBreak solution = new Q343IntegerBreak();

  @Test
  public void demo1() {
    int input = 2;
    int expect = 1;

    int output = solution.integerBreak(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void demo2() {
    int input = 10;
    int expect = 36;

    int output = solution.integerBreak(input);
    Assertions.assertEquals(expect, output);
  }

}
