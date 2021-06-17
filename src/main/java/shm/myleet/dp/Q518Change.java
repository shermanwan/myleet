package shm.myleet.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * 518. 零钱兑换 II
 *
 * @see https://leetcode-cn.com/problems/coin-change-2/
 */
@Slf4j
public class Q518Change {

  /**
   * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
   *
   * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
   *
   * 假设每一种面额的硬币有无限个。
   *
   * 题目数据保证结果符合 32 位带符号整数。
   *
   * @param amount
   * @param coins
   * @return
   */
  public int change(int amount, int[] coins) {
    // 1. 确定dp数组以及下标的含义
    // dp[i][j] 背包(总金额)j，使用编号[0-i]的coin凑成j的最大组合数
    // 简化为滚动数组，dp[j] 背包(总金额)j，coin凑成j的最大组合数
    // 定义数组放 [0, amount], size 要大一号
    int dp[] = new int[amount + 1];

    // 2. 确定递推公式
    // 来自两方面
    // 不装第i个物品，dp[i][j] = dp[i-1][j]
    // 装第i个物品, dp[i][j] = dp[i][j-coins[i]]
    // 注意以上右侧没有使用 dp[i-1], 而是 dp[i-1];
    // 实质是考虑了 coin 可以被加入多次，这样使用从左到右遍历, 涵盖了多次加入 coin
    // dp[i][j] = dp[i-1][j] + (dp[i][j-coins[i]])
    // 使用滚动数组，简化为
    // dp[j] = dp[j] + dp[j-coins[i]]

    // 3. dp数组如何初始化
    // 只放coins[0], 能否凑成j
    for (int j = 0; j < dp.length; j++) {
      dp[j] = j % coins[0] == 0 ? 1 : 0;
    }
    log("i({}), dp = {}", 0, dp);

    // 4. 确定遍历顺序
    for (int i = 1; i < coins.length; i++) {
      // 滚动数组计算组合数量必须从前往后
      for (int j = 0; j < dp.length; j++) {
        if (j - coins[i] >= 0) {
          dp[j] += dp[j - coins[i]];
        }

      }
      log("i({}), dp = {}", i, dp);
    }

    return dp[dp.length - 1];
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
