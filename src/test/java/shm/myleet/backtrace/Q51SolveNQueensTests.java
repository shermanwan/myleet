package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;

import shm.myleet.common.AssertExt;

public class Q51SolveNQueensTests {

  Q51SolveNQueens solution = new Q51SolveNQueens();

  @Test
  public void demo1() {
    List<List<String>> actual = solution.solveNQueens(4);
    String[][] expect = {{".Q..","...Q","Q...","..Q."},{"..Q.","Q...","...Q",".Q.."}};
    AssertExt.assertArraysEqual(expect, AssertExt.valueOfStringLists(actual));
  }

}
