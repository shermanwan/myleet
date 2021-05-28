package shm.myleet.backtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

/**
 * 51. N 皇后
 *
 * @see https://leetcode-cn.com/problems/n-queens/
 */
@Slf4j
public class Q51SolveNQueens {

  int input;
  List<List<String>> result = new ArrayList<List<String>>();

  /**
   * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
   *
   * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
   *
   * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
   *
   * @param n
   * @return
   */
  public List<List<String>> solveNQueens(int n) {
    input = n;
    // path index = row; path value = col
    Stack<Integer> path = new Stack<>();
    backtracking(path);

    return result;
  }

  void backtracking(Stack<Integer> path) {
    if (path.size() == input) {
      result.add(toResult(path));
      return;
    }

    for (int col = 0; col < input; col++) {
      if (!conflict(path, path.size(), col)) {
        path.push(col);
        backtracking(path);
        path.pop();
      }
    }
  }

  // (rowIndex, colIndex) 是否攻击 path 中的点
  boolean conflict(Stack<Integer> path, int newRow, int newCol) {
    // 只要判断竖方向和斜方向，横方向不会攻击
    for (int row = 0; row < path.size(); row++) {
      int col = path.get(row);
      if (col == newCol) {
        return true;
      }

      if (Math.abs(row - newRow) == Math.abs(col - newCol)) {
        return true;
      }
    }

    return false;
  }

  List<String> toResult(Stack<Integer> path) {
    List<String> rowStrs = new ArrayList<>();
    for (int row = 0; row < path.size(); row++) {
      StringBuilder sb = new StringBuilder();
      int qCol = path.get(row);
      for (int col = 0; col < input; col++) {
        if (qCol == col) {
          sb.append('Q');
        } else {
          sb.append('.');
        }
      }
      rowStrs.add(sb.toString());
    }

    return rowStrs;
  }

}
