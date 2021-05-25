package shm.myleet.backtrace;

import lombok.extern.slf4j.Slf4j;
import java.util.*;

/**
 * 93. 复原 IP 地址
 *
 * @see https://leetcode-cn.com/problems/restore-ip-addresses/
 */
@Slf4j

public class Q93RestoreIpAddresses {

  List<String> result = new ArrayList<>();
  String input;

  /**
   * 给定一个只包含数字的字符串，用以表示一个 IP 地址，返回所有可能从 s 获得的 有效 IP 地址 。你可以按任何顺序返回答案。
   *
   * 有效 IP 地址 正好由四个整数（每个整数位于 0 到 255 之间组成，且不能含有前导 0），整数之间用 '.' 分隔。
   *
   */
  public List<String> restoreIpAddresses(String s) {
    this.input = s;
    Stack<String> path = new Stack<>();

    backtracking(path, 0);
    return result;
  }

  void backtracking(Stack<String> path, int startIndex) {
    log("backtracking {} {}", path, startIndex);
    if (path.size() == 3) {
      // 剩下的是否是 valid 地址
      String lastSection = input.substring(startIndex);
      if (isValidSection(lastSection)) {
        StringBuilder sb = new StringBuilder();
        for (String section : path) {
          sb.append(section);
          sb.append('.');
        }
        sb.append(lastSection);
        result.add(sb.toString());
      }

      return;
    }

    for (int i = 0; i < 3 && i + startIndex < input.length(); i++) {
      // 前闭后开区间 [startIndex, startIndex+i+1)
      String section = input.substring(startIndex, startIndex + i + 1);
      if (isValidSection(section)) {
        path.push(section);
        backtracking(path, startIndex + i + 1);
        path.pop();
      }
    }
  }

  private boolean isValidSection(String section) {
    if (section.length() == 0 || section.length() > 3) {
      return false;
    }
    if (section.startsWith("0")) {
      return "0".equals(section);
    }
    int ip = Integer.parseInt(section);
    return ip >= 0 && ip <= 255;
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
