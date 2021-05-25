package shm.myleet.backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

/**
 * 90. 子集 II
 *
 * @see https://leetcode-cn.com/problems/subsets-ii/
 */
@Slf4j
public class Q90SubsetsWithDup {

  List<List<Integer>> result = new ArrayList<List<Integer>>();
  int[] input;

  /**
   * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
   *
   * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。 
   *
   * @param nums
   * @return
   */
  public List<List<Integer>> subsetsWithDup(int[] nums) {
    Arrays.sort(nums);
    this.input = nums;

    Stack<Integer> path = new Stack<>();
    backtracking(path, 0);
    return result;
  }

  void backtracking(Stack<Integer> path, int startIndex) {
    result.add(new ArrayList<>(path));
    if (startIndex == input.length) {
      return;
    }

    for (int i = startIndex; i < input.length; i++) {
      if (i > startIndex) {
        if (input[i] == input[i - 1]) {
          continue;
        }
      }
      path.push(input[i]);
      backtracking(path, i + 1);
      path.pop();
    }
  }

}
