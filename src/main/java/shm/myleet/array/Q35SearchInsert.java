package shm.myleet.array;

// https://leetcode-cn.com/problems/search-insert-position/
class Q35SearchInsert {
  public int searchInsert(int[] nums, int target) {
    return searchInsertBetween(0, nums.length, nums, target);
  }

  public int searchInsertBetween(int leftIndex, int rightIndex, int[] nums, int target) {
    if (leftIndex >= rightIndex) {
      // 子串为空，无值
      return rightIndex;
    } else {
      int middleIndex = (leftIndex + rightIndex) / 2;
      if (nums[middleIndex] == target) {
        return middleIndex;
      } else if (nums[middleIndex] < target) {
        return searchInsertBetween(middleIndex + 1, rightIndex, nums, target);
      } else { // if (nums[middleIndex] > target) {
        return searchInsertBetween(leftIndex, middleIndex, nums, target);
      }
    }
  }
}
