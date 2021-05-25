package shm.myleet.backtrace;

import org.junit.Test;

import shm.myleet.common.AssertExt;

import java.util.List;

public class Q47PermuteUniqueTests {

  Q47PermuteUnique solution = new Q47PermuteUnique();

  @Test
  public void demo1() {
    int[] input = { 1, 1, 2 };
    List<List<Integer>> actual = solution.permuteUnique(input);
    int[][] expect = { { 1, 1, 2 }, { 1, 2, 1 }, { 2, 1, 1 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

  @Test
  public void demo2() {
    int[] input = { 1, 2, 3 };
    List<List<Integer>> actual = solution.permuteUnique(input);
    int[][] expect = { { 1, 2, 3 }, { 1, 3, 2 }, { 2, 1, 3 }, { 2, 3, 1 }, { 3, 1, 2 }, { 3, 2, 1 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

}
