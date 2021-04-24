package shm.myleet.array;

public class Q209MinSubArrayLen {

  public int minSubArrayLen(int target, int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int left = 0, right = 0, sum = 0;
    while (sum < target) {
      if (right < nums.length) {
        sum += nums[right];
        right++;
      } else {
        return 0;
      }
    }

    while (true) {
      while (sum - nums[left] >= target) {
        sum -= nums[left];
        left++;
        System.out.println(String.format("1. left=%d,right=%d,sum=%d", left, right, sum));
      }

      if (right >= nums.length) {
        break;
      } else {
        sum -= nums[left];
        sum += nums[right];
        left++;
        right++;
        System.out.println(String.format("2. left=%d,right=%d,sum=%d", left, right, sum));
      }
    }

    return right - left;
  }

}
