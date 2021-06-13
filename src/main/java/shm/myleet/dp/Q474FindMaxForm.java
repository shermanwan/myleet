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
    int[][] nums = new int[strs.length][];

    // 1. 确定dp数组以及下标的含义
    // dp]i][x][y] 任选下标0-i的str，背包最大x个0，y个1，做多可以放的数量
    // 滚动数组就是 dp[x][y]

    // 2. 确定递推公式
    // dp[i][x][y] = max(dp[i-1][x][y], dp[i-1][x-nums[i][0]][y-nums[i][1]] + 1)
    // 滚动数组 dp[x][y] = max(dp[x][y], dp[x-nums[i][0]][y-nums[i][1]] + 1)

    // 3. dp数组如何初始化
    // i=0 时, dp[m][n]

  }

}
