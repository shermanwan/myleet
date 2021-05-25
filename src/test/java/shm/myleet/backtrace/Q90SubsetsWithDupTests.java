package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;

import shm.myleet.common.AssertExt;

public class Q90SubsetsWithDupTests {

  Q90SubsetsWithDup solution = new Q90SubsetsWithDup();

  @Test
  public void demo1() {
    int[] input = { 1, 2, 2 };
    List<List<Integer>> actual = solution.subsetsWithDup(input);
    int[][] expect = { {}, { 1 }, { 1, 2 }, { 1, 2, 2 }, { 2 }, { 2, 2 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

  @Test
  public void demo2() {
    int[] input = { 0 };
    List<List<Integer>> actual = solution.subsetsWithDup(input);
    int[][] expect = { {}, { 0 } };
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

}
