package shm.myleet.array;

/**
 * 209. 长度最小的子数组
 * @see https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class Q209MinSubArrayLen {

  /**
   * 给定一个含有 n 个正整数的数组和一个正整数 target 。 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl,
   * numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
   *
   * @param target
   * @param nums
   * @return
   */
  public int minSubArrayLen(int target, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int leftIndex = 0, rightIndex = 0, sum = 0;
    // 从0开始找满足条件的初始窗口
    while (sum < target) {
      if (rightIndex < nums.length) {
        sum += nums[rightIndex];
        rightIndex++;
      } else {
        return 0;
      }
    }

    while (true) {
      // 窗口左侧缩减，看是否能满足条件
      while (sum - nums[leftIndex] >= target) {
        sum -= nums[leftIndex];
        leftIndex++;
      }

      if (rightIndex >= nums.length) {
        break;
      } else {
        // 窗口整体右移
        sum -= nums[leftIndex];
        sum += nums[rightIndex];
        leftIndex++;
        rightIndex++;
      }
    }

    return rightIndex - leftIndex;
  }

}
