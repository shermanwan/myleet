package shm.myleet.backtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

/**
 * 17. 电话号码的字母组合
 *
 * @see https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
@Slf4j
public class Q17LetterCombinations {

  String[] letterMap = { "", // 0
      "", // 1
      "abc", // 2
      "def", // 3
      "ghi", // 4
      "jkl", // 5
      "mno", // 6
      "pqrs", // 7
      "tuv", // 8
      "wxyz", // 9
  };

  List<String> result = new ArrayList<>();

  public List<String> letterCombinations(String digits) {
    Stack<Character> path = new Stack<>();
    backtracking(path, 0, digits);
    return result;

  }

  /**
   *
   * 树的宽度：每个数字可能选项 = letterMap[i].size
   *
   * 树的深度: digits size
   *
   * @param path
   * @param digitIndex
   */
  void backtracking(Stack<Character> path, int digitIndex, String digits) {
    if (path.size() == digits.length()) {
      StringBuilder sb = new StringBuilder();
      for (Character c : path) {
        sb.append(c);
      }
      String leaf = sb.toString();
      if (!leaf.isEmpty()) {
        result.add(leaf);
      }
      return;
    }

    String letters = letterMap[digits.charAt(digitIndex) - '0'];
    // 横向遍历
    for (int i = 0; i < letters.length(); i++) {
      path.push(letters.charAt(i));
      // 纵向递归遍历
      backtracking(path, digitIndex + 1, digits); // 递归
      path.pop();
    }
  }

}
