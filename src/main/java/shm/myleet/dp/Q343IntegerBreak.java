package shm.myleet.dp;

import lombok.extern.slf4j.Slf4j;

/**
 * 343. 整数拆分
 *
 * @see https://leetcode-cn.com/problems/integer-break/
 */
@Slf4j
public class Q343IntegerBreak {

  /**
   * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
   *
   * @param n
   * @return
   */
  public int integerBreak(int n) {
    // dp[i] 整数i拆分的最大乘积
    int dp[] = new int[n + 1];

    // dp[i] 两段拆分 max(j * (i-j)); 多段拆分必然是 dp[i] = max(j * dp[i-j])
    // 初始化
    dp[1] = 1 * 0;
    dp[2] = 1 * 1;

    for (int i = 3; i <= n; i++) {
      int tmp = 0;
      for (int j = 1; j + 1 <= i; j++) {
        tmp = Math.max(tmp, j * Math.max(i - j, dp[i - j]));
      }
      dp[i] = tmp;
    }

    log("{}", dp);
    return dp[n];
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
