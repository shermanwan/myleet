package shm.myleet.backtrace;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 40. 组合总和 II
 *
 * @see https://leetcode-cn.com/problems/combination-sum-ii/
 */
@Slf4j
public class Q40CombinationSum2 {

  List<List<Integer>> result = new ArrayList<>();
  int[] candidates;
  int target;

  /**
   * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
   *
   * candidates 中的每个数字在每个组合中只能使用一次。
   *
   * 说明：
   *
   * 所有数字（包括目标数）都是正整数。
   *
   * 解集不能包含重复的组合。 
   *
   *
   * @param candidates
   * @param target
   * @return
   */
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    this.candidates = candidates;
    this.target = target;

    Stack<Integer> path = new Stack<>();
    backtracking(path, 0, 0);
    return result;
  }

  /**
   *
   * @param path
   * @param sum
   * @param startIndex 递归中后移保证 candidates 中的每个数字在每个组合中只能使用一次。
   */
  void backtracking(Stack<Integer> path, int sum, int startIndex) {
    if (sum == target) {
      List<Integer> leaf = new ArrayList<>();
      leaf.addAll(path);
      log(leaf.toString());
      result.add(leaf);
      return;
    } else if (sum > target) {
      return;
    }

    for (int i = startIndex; i < candidates.length; i++) {
      // 树层去重
      if (i >= startIndex + 1 && candidates[i - 1] == candidates[i]) {
        continue;
      }
      path.push(candidates[i]);
      backtracking(path, sum + candidates[i], i + 1); // 递归
      path.pop();
    }
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
