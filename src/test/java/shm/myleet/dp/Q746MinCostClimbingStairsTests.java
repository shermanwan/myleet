package shm.myleet.dp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q746MinCostClimbingStairsTests {

  Q746MinCostClimbingStairs solution = new Q746MinCostClimbingStairs();

  @Test
  public void demo1() {
    int[] input = { 10, 15, 20 };
    int expect = 15;
    int output = solution.minCostClimbingStairs(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void demo2() {
    int[] input = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
    int expect = 6;
    int output = solution.minCostClimbingStairs(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void wrong1() {
    int[] input = { 1, 1, 0, 0 };
    int expect = 1;
    int output = solution.minCostClimbingStairs(input);
    Assertions.assertEquals(expect, output);
  }

}
