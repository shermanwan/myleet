package shm.myleet.hash;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q1TwoSumTests {

  Q1TwoSum solution = new Q1TwoSum();

  @Test
  public void basic() {
    Assertions.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 2, 7, 11, 15 }, 9));
    Assertions.assertArrayEquals(new int[] { 1, 2 }, solution.twoSum(new int[] { 3, 2, 4 }, 6));
    Assertions.assertArrayEquals(new int[] { 0, 1 }, solution.twoSum(new int[] { 3, 3 }, 6));
  }

  @Test
  public void boundary() {
    Assertions.assertArrayEquals(new int[] {}, solution.twoSum(new int[] {}, 1));
    Assertions.assertArrayEquals(new int[] {}, solution.twoSum(new int[] { 1 }, 1));
  }

}
