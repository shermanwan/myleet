package shm.myleet.dp;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q416CanPartitionTests {

  Q416CanPartition solution = new Q416CanPartition();

  @Test
  public void demo1() {
    int[] input = { 1, 5, 11, 5 };
    boolean expect = true;

    boolean output = solution.canPartition(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void demo2() {
    int[] input = { 1, 2, 3, 5 };
    boolean expect = false;

    boolean output = solution.canPartition(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void revise1() {
    int[] input = { 1, 5, 3 };
    boolean expect = false;

    boolean output = solution.canPartition(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void revise2() {
    int[] input = { 3, 3, 3, 4, 5 };
    boolean expect = true;

    boolean output = solution.canPartition(input);
    Assertions.assertEquals(expect, output);
  }

  @Test
  public void revise3() {
    int[] input = { 2, 2, 1, 1 };
    boolean expect = true;

    boolean output = solution.canPartition(input);
    Assertions.assertEquals(expect, output);
  }

}
