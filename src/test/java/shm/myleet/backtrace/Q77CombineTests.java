package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;

import shm.myleet.common.AssertExt;

public class Q77CombineTests {

  Q77Combine solution = new Q77Combine();

  @Test
  public void basic1() {
    int[][] expect = { { 1, 2 }, { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 3, 4 } };
    List<List<Integer>> actual = solution.combine(4, 2);
    AssertExt.assertArraysEqual(expect, AssertExt.valueOf(actual));
  }

}
