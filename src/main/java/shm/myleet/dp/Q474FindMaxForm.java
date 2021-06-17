package shm.myleet.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * 474. 一和零
 *
 * @see https://leetcode-cn.com/problems/ones-and-zeroes/
 */
@Slf4j
public class Q474FindMaxForm {

  /**
   * 给你一个二进制字符串数组 strs 和两个整数 m 和 n 。
   *
   * 请你找出并返回 strs 的最大子集的大小，该子集中 最多 有 m 个 0 和 n 个 1 。
   *
   * 如果 x 的所有元素也是 y 的元素，集合 x 是集合 y 的 子集 。
   *
   * @param strs
   * @param m
   * @param n
   * @return
   */
  public int findMaxForm(String[] strs, int m, int n) {

    // 0. strs 转换成 nums[2]，nums[0]=0的数量，nums[1]=1的数量，
    int[][] nums = new int[strs.length][2];
    for (int i = 0; i < strs.length; i++) {
      char[] strChars = strs[i].toCharArray();
      nums[i][0] = nums[i][1] = 0;
      for (char c : strChars) {
        if (c == '0') {
          nums[i][0]++;
        } else if (c == '1') {
          nums[i][1]++;
        }
      }
    }
    log("nums = {}", nums);

    // 1. 确定dp数组以及下标的含义
    // dp[i][x][y] 任选下标0-i的str，背包最大x个0，y个1，做多可以放的数量
    // 滚动数组就是 dp[x][y]
    int[][] dp = new int[m + 1][n + 1];

    // 2. 确定递推公式
    // dp[i][x][y] = max(dp[i-1][x][y], dp[i-1][x-nums[i][0]][y-nums[i][1]] + 1)
    // 滚动数组 dp[x][y] = max(dp[x][y], dp[x-nums[i][0]][y-nums[i][1]] + 1)

    // 3. dp数组如何初始化
    for (int x = 0; x < m + 1; x++) {
      for (int y = 0; y < n + 1; y++) {
        dp[x][y] = nums[0][0] <= x && nums[0][1] <= y ? 1 : 0;
      }
    }
    log("i({}), dp = {}", 0, dp);

    // 4. 确定遍历顺序
    for (int i = 1; i < nums.length; i++) {
      for (int x = m; x >= 0; x--) {
        for (int y = n; y >= 0; y--) {
          if (x - nums[i][0] >= 0 && y - nums[i][1] >= 0) {
            dp[x][y] = Math.max(dp[x][y], dp[x - nums[i][0]][y - nums[i][1]] + 1);
          }
        }
      }

      log("i({}), dp = {}", i, dp);
    }

    return dp[m][n];

  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
