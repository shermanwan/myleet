package shm.myleet.backtrace;

import lombok.extern.slf4j.Slf4j;
import java.util.*;

/**
 * 77. 组合
 *
 * @see https://leetcode-cn.com/problems/combinations/
 */
@Slf4j
public class Q77Combine {

  class Tracker {
    public List<List<Integer>> result;
    public int n;
    public int k;
  }

  /**
   * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
   *
   * @param n
   * @param k
   * @return
   */
  public List<List<Integer>> combine(int n, int k) {
    Tracker tracker = new Tracker();
    tracker.result = new ArrayList<>();
    tracker.n = n;
    tracker.k = k;

    Stack<Integer> path = new Stack<>();

    backtracking(path, 1, tracker);
    return tracker.result;
  }

  void backtracking(Stack<Integer> path, int startIndex, Tracker tracker) {
    if (path.size() == tracker.k) {
      List<Integer> leaf = new ArrayList<>();
      leaf.addAll(path);
      log(leaf.toString());
      tracker.result.add(leaf);
      return;
    }

    // [1-n]
    for (int i = startIndex; i <= tracker.n; i++) {
      path.push(i);
      backtracking(path, i + 1, tracker); // 递归
      path.pop();
    }
  }

  private void log(String format, Object... args) {
    // log.info(format, args);
  }

}
