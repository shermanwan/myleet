package shm.myleet.hash;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * 1. 两数之和
 *
 * @see https://leetcode-cn.com/problems/two-sum/
 */
@Slf4j
public class Q1TwoSum {

  /**
   * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
   * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。 你可以按任意顺序返回答案。
   *
   * @param nums
   * @param target
   * @return
   */
  public int[] twoSum(int[] nums, int target) {
    // 存放已扫描过的 <num, index>, 可以避免二次扫描
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {

      // log.debug("search {} in {}", (target - nums[i]), map.toString());

      if (map.containsKey(nums[i])) {
        return new int[] { map.get(nums[i]), i };
      } else {
        map.put(target - nums[i], i);

      }
    }

    return new int[] {};
  }

}
