package shm.myleet.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * 746. 使用最小花费爬楼梯
 *
 * @see https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
@Slf4j
public class Q746MinCostClimbingStairs {

  /**
   * 数组的每个下标作为一个阶梯，第 i 个阶梯对应着一个非负数的体力花费值 cost[i]（下标从 0 开始）。
   *
   * 每当你爬上一个阶梯你都要花费对应的体力值，一旦支付了相应的体力值，你就可以选择向上爬一个阶梯或者爬两个阶梯。
   *
   * 请你找出达到楼层顶部的最低花费。在开始时，你可以选择从下标为 0 或 1 的元素作为初始阶梯。
   *
   * @param cost
   * @return
   */
  public int minCostClimbingStairs(int[] cost) {
    // dp[i] 爬上第 i 个阶梯的最低花费
    int dp[] = new int[cost.length];

    // 从i-1爬一个或者从i-2爬两个，都是支付cost[i]: dp[i] = min(dp[i-1], dp[i-2]) + cost[i]
    // 初始一次或两次爬上 dp[0]=cost[0], dp[1]=cost[1]
    dp[0] = cost[0];
    dp[1] = cost[1];

    // 模拟 { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }
    // dp = [1, 100, 2, 3, 3, 103, 4, 5, 104, 6]
    for (int i = 2; i < cost.length; i++) {
      dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
    }

    log("{}", dp);
    return Math.min(dp[cost.length - 1], dp[cost.length - 2]);
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
