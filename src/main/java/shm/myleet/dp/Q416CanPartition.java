package shm.myleet.dp;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

/**
 * 416. 分割等和子集
 *
 * @see https://leetcode-cn.com/problems/partition-equal-subset-sum/
 */
@Slf4j
public class Q416CanPartition {

  /**
   * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
   *
   * @param nums
   * @return
   */
  public boolean canPartition(int[] nums) {
    // 转化为求背包容量为 sum(nums)/2, 最大能装多少
    // 如最大装的值 = 容量，则成功分割
    int sum = Arrays.stream(nums).sum();
    if (sum % 2 != 0) {
      return false;
    }
    int capacity = Arrays.stream(nums).sum() / 2;

    // 1. 确定dp数组以及下标的含义
    // dp[i][j] 背包容量j，装载编号[0-i]物品的最大装载量
    // 简化为滚动数组，dp[j] 背包容量j，物品编号滚动下的最大装载量
    // 定义数组放 [0, capacity], size 要大一号
    int dp[] = new int[capacity + 1];

    // 2. 确定递推公式
    // 来自两方面
    // 不装第i个物品，dp[i][j] = dp[i-1][j]
    // 装第i个物品, dp[i][j] = dp[i-1][j-nums[i]] + nums[i]
    // dp[i][j] = max(dp[i-1][j], dp[i-1][j-nums[i]] + nums[i])
    // 使用滚动数组，dp[i]的任意i使用同一个数组，只需要记录当前背包容量j
    // 前提是计算 dp[i] 使用的必须是 dp[i-1] 的数组
    // dp[j] = max(dp[j], dp[j-nums[i]] + nums[i])

    // 3. dp数组如何初始化
    // 只放物品0, 背包 0-capacity的最大装载量
    for (int j = 0; j < dp.length; j++) {
      dp[j] = nums[0] <= j ? nums[0] : 0;
    }
    log("i({}), dp = {}", 0, dp);

    // 4. 确定遍历顺序
    for (int i = 1; i < nums.length; i++) {
      // 滚动数组必须从后往前
      // 如先计算前值，计算 dp[i] 使用的已经是加入物品i后的结果，而非 dp[i-1]
      for (int j = dp.length - 1; j >= 0; j--) {
        if (j - nums[i] >= 0) {
          dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
        }

      }
      log("i({}), dp = {}", i, dp);

      // 放入物品最大可以到 capacity，无需继续计算
      if (dp[dp.length - 1] == capacity) {
        return true;
      }
    }

    return false;

    // 5. 举例推导dp数组
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
