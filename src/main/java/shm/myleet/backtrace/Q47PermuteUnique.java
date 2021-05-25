package shm.myleet.backtrace;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 47. 全排列 II
 *
 * @see https://leetcode-cn.com/problems/permutations-ii/
 */
@Slf4j
public class Q47PermuteUnique {

  List<List<Integer>> result = new ArrayList<List<Integer>>();
  int[] input;

  /**
   * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
   *
   * @param nums
   * @return
   */
  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    this.input = nums;

    Stack<Integer> path = new Stack<>();
    boolean[] used = new boolean[nums.length];
    backtracking(path, used);
    return result;
  }

  void backtracking(Stack<Integer> path, boolean[] used) {
    if (path.size() == input.length) {
      result.add(new ArrayList<>(path));
      return;
    }

    for(int i=0; i<input.length; i++){
      if(used[i])
      backtracking(path, used);
    }
  }

}
