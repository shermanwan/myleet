package shm.myleet.array;

public class Q209MinSubArrayLen {

  public int minSubArrayLen(int target, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int left = 0, right = 0, sum = 0;
    // 从0开始找满足条件的窗口
    while (sum < target) {
      if (right < nums.length) {
        sum += nums[right];
        right++;
      } else {
        return 0;
      }
    }

    while (true) {
      // 窗口左侧缩减，看是否能满足条件
      while (sum - nums[left] >= target) {
        sum -= nums[left];
        left++;
      }

      // 窗口整体右移
      if (right >= nums.length) {
        break;
      } else {
        sum -= nums[left];
        sum += nums[right];
        left++;
        right++;
      }
    }

    return right - left;
  }

}
