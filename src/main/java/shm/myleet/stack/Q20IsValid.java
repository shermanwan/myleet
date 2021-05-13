package shm.myleet.stack;

import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

/**
 * 20. 有效的括号
 *
 * @see https://leetcode-cn.com/problems/valid-parentheses/
 */
@Slf4j
public class Q20IsValid {

  /**
   * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 有效字符串需满足：
   * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。
   *
   * @param s
   * @return
   */
  public boolean isValid(String s) {

    Stack<Character> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char right = s.charAt(i);
      if (!stack.empty() && match(stack.peek().charValue(), right)) {
        // 栈顶匹配，出栈；下一个新字符
        stack.pop();
      } else {
        // 空栈 or 不匹配，新字符入栈
        stack.push(right);
      }
    }

    return stack.empty();
  }

  private boolean match(char left, char right) {
    return left == '(' && right == ')' || left == '[' && right == ']' || left == '{' && right == '}';
  }

}
