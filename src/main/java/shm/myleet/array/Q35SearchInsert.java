package shm.myleet.array;

/**
 * 35. 搜索插入位置
 *
 * @see https://leetcode-cn.com/problems/search-insert-position/
 */
class Q35SearchInsert {

  /**
   * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。 你可以假设数组中无重复元素。
   *
   * @param nums
   * @param target
   * @return
   */
  public int searchInsert(int[] nums, int target) {
    return searchInsertBetween(0, nums.length, nums, target);
  }

  // 递归搜索，leftIndex/rightIndex 保留原数组索引
  public int searchInsertBetween(int leftIndex, int rightIndex, int[] nums, int target) {
    if (leftIndex >= rightIndex) {
      // 子串为空，无值
      return rightIndex;
    } else {
      // 二分搜索
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
