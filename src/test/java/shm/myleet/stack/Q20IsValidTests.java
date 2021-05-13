package shm.myleet.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q20IsValidTests {

  Q20IsValid solution = new Q20IsValid();

  @Test
  public void basic1() {
    Assertions.assertEquals(true, solution.isValid("()"));
    Assertions.assertEquals(true, solution.isValid("()[]{}"));
    Assertions.assertEquals(false, solution.isValid("(]"));
    Assertions.assertEquals(false, solution.isValid("([)]"));
    Assertions.assertEquals(true, solution.isValid("{[]}"));
  }

  @Test
  public void boundary() {
    Assertions.assertEquals(true, solution.isValid(""));
    Assertions.assertEquals(false, solution.isValid("("));
  }

}
