package shm.myleet.backtrace;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Q17LetterCombinationsTests {

  Q17LetterCombinations solution = new Q17LetterCombinations();

  @Test
  public void demo1() {
    String[] expect = { "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf" };
    List<String> actual = solution.letterCombinations("23");
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo2() {
    String[] expect = {};
    List<String> actual = solution.letterCombinations("");
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

  @Test
  public void demo3() {
    String[] expect = { "a", "b", "c" };
    List<String> actual = solution.letterCombinations("2");
    Assertions.assertArrayEquals(expect, actual.toArray(new String[] {}));
  }

}
