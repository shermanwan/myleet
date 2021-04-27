package shm.myleet.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q151ReverseWordsTests {

  Q151ReverseWords solution = new Q151ReverseWords();

  @Test
  public void basic1() {
    Assertions.assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
  }

  @Test
  public void basic2() {
    Assertions.assertEquals("world! hello", solution.reverseWords("  hello world!  "));
  }

  @Test
  public void basic3() {
    Assertions.assertEquals("example good a", solution.reverseWords("a good   example"));
  }

  @Test
  public void basic4() {
    Assertions.assertEquals("bob like even not does Alice", solution.reverseWords("Alice does not even like bob"));
  }

}
