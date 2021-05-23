package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;

import shm.myleet.common.AssertExt;

public class Q40CombinationSum2Tests {

  Q40CombinationSum2 solution = new Q40CombinationSum2();

  @Test
  public void demo1() {
    int[] input = { 10, 1, 2, 7, 6, 1, 5 };
    List<List<Integer>> actual = solution.combinationSum2(input, 8);
    int[][] expect = { { 1, 1, 6 }, { 1, 2, 5 }, { 1, 7 }, { 2, 6 }, };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

  @Test
  public void demo2() {
    int[] input = { 2, 5, 2, 1, 2 };
    List<List<Integer>> actual = solution.combinationSum2(input, 5);
    int[][] expect = { { 1, 2, 2 }, { 5 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

  @Test
  public void boundary1() {
    int[] input = { 1, 3 };
    List<List<Integer>> actual = solution.combinationSum2(input, 5);
    int[][] expect = {};
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

  @Test
  public void boundary2() {
    int[] input = {};
    List<List<Integer>> actual = solution.combinationSum2(input, 5);
    int[][] expect = {};
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

}
