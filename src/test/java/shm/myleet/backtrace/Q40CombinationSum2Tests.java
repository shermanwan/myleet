package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import shm.myleet.common.AssertExt;

public class Q40CombinationSum2Tests {

  Q40CombinationSum2 solution = new Q40CombinationSum2();

  @Test
  public void demo1() {
    int[] input = { 10, 1, 2, 7, 6, 1, 5 };
    List<List<Integer>> actual = solution.combinationSum2(input, 8);
    int[][] expect = { { 1, 7 }, { 1, 2, 5 }, { 2, 6 }, { 1, 1, 6 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

}
