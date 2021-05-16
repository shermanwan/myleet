package shm.myleet.stack;

import java.util.Stack;

import lombok.extern.slf4j.Slf4j;

/**
 * 150. 逆波兰表达式求值
 *
 * @see https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
@Slf4j
public class Q150EvalRPN {

  /**
   * 根据 逆波兰表示法，求表达式的值。
   *
   * 有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。 
   *
   * 说明： 整数除法只保留整数部分。 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
   *
   * @param tokens
   * @return
   */
  public int evalRPN(String[] tokens) {
    Stack<Integer> stack = new Stack<>();

    for (String token : tokens) {
      if (isOperator(token)) {
        // token is operator, pop 2 digit, calc then push result to stack
        if (stack.size() < 2) {
          throw new RuntimeException("missing digit");
        }

        int right = stack.pop();
        log("pop " + right);
        int left = stack.pop();
        log("pop " + left);
        int result = executeOperator(token, left, right);

        log("push " + result);
        stack.push(result);
      } else {
        // token is digit, push to stack
        log("push " + token);
        stack.push(Integer.valueOf(token));
      }
    }

    if (stack.size() != 1) {
      throw new RuntimeException("incomplete expression");
    }
    return stack.pop();
  }

  private boolean isOperator(String token) {
    char c = token.charAt(0);
    return token.length() == 1 && ('+' == c || '-' == c || '*' == c || '/' == c);
  }

  private int executeOperator(String token, int left, int right) {
    switch (token.charAt(0)) {
    case '+':
      return left + right;
    case '-':
      return left - right;
    case '*':
      return left * right;
    case '/':
      return left / right;
    }
    throw new RuntimeException("invalid operator " + token);
  }

  private void log(String format, Object... args) {
    log.info(format, args);
  }

}
