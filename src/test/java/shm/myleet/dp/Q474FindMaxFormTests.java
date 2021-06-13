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

}
