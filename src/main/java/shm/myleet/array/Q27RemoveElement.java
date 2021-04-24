package shm.myleet.array;

// https://leetcode-cn.com/problems/remove-element/
public class Q27RemoveElement {

  public int removeElement(int[] nums, int val) {
    int fastIndex = 0, slowIndex = 0;
    while (fastIndex < nums.length) {
      if (nums[fastIndex] != val) {
        nums[slowIndex++] = nums[fastIndex];
      }
      fastIndex++;
    }
    return slowIndex;
  }

}
