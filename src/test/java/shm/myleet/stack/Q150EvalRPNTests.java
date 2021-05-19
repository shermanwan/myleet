package shm.myleet.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q150EvalRPNTests {

  Q150EvalRPN solution = new Q150EvalRPN();

  @Test
  public void basic1() {
    Assertions.assertEquals(9, solution.evalRPN(new String[] { "2", "1", "+", "3", "*" }));
  }

  @Test
  public void basic2() {
    Assertions.assertEquals(6, solution.evalRPN(new String[] { "4", "13", "5", "/", "+" }));
  }

  @Test
  public void basic3() {
    Assertions.assertEquals(22,
        solution.evalRPN(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" }));
  }

  @Test
  public void boundary1() {
    Assertions.assertEquals(9, solution.evalRPN(new String[] { "2", "+" }));
  }

  @Test
  public void boundary2() {
    Assertions.assertEquals(9, solution.evalRPN(new String[] { "2", "1", "+", "1" }));
  }

  @Test
  public void boundary3() {
    Assertions.assertEquals(9, solution.evalRPN(new String[] { "+" }));
  }

}
