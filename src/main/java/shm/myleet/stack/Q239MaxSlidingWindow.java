package shm.myleet.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Vector;
import java.util.Deque;

import lombok.extern.slf4j.Slf4j;

/**
 * 239. 滑动窗口最大值
 *
 * @see https://leetcode-cn.com/problems/sliding-window-maximum/
 */
@Slf4j
public class Q239MaxSlidingWindow {

  /**
   * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的
   * k 个数字。滑动窗口每次只向右移动一位。
   *
   * 返回滑动窗口中的最大值。
   *
   * @param nums
   * @param k
   * @return
   */
  public int[] maxSlidingWindow(int[] nums, int k) {
    SlidingWindow window = new SlidingWindow();
    List<Integer> result = new ArrayList<Integer>();

    // 初始化 SlidingWindow
    for (int i = 0; i < k; i++) {
      window.move(null, nums[i]);
    }
    result.add(window.max());

    // 移动 SlidingWindow
    for (int i = k; i < nums.length; i++) {
      int max = window.move(nums[i-k], nums[i]);
      result.add(max);
    }

    return result.stream().mapToInt(Integer::valueOf).toArray();
  }

  class SlidingWindow {
    // 满足条件的单调递减队列
    Deque<Integer> candidates = new LinkedList<Integer>();

    /**
     * 移出 outVal；移入 inVal
     *
     * @param outVal 如 null，不移除 outVal
     * @param inVal
     * @return window中最大值
     */
    int move(Integer outVal, Integer inVal) {
      // MUST use equal to compare Integer
      if (outVal != null && !candidates.isEmpty() && candidates.getFirst().equals(outVal)) {
        candidates.removeFirst();
      }

      // 移除末尾小于 inVal 的值，保持单调递减
      // 如等于保留
      while (!candidates.isEmpty() && candidates.getLast() < inVal) {
        candidates.removeLast();
      }

      candidates.addLast(inVal);

      log.info(candidates.toString());

      return candidates.getFirst();
    }

    int max() {
      return candidates.getFirst();
    }
  }

}
