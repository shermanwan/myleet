package shm.myleet.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q209MinSubArrayLenTests {

  Q209MinSubArrayLen solution = new Q209MinSubArrayLen();

  @Test
  public void basic() {
    Assertions.assertEquals(2, solution.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }));
    Assertions.assertEquals(1, solution.minSubArrayLen(4, new int[] { 1, 4, 4 }));
    Assertions.assertEquals(0, solution.minSubArrayLen(11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
  }

  @Test
  public void boundary() {
    Assertions.assertEquals(0, solution.minSubArrayLen(0, new int[] {}));
    Assertions.assertEquals(1, solution.minSubArrayLen(4, new int[] { 4 }));
    Assertions.assertEquals(0, solution.minSubArrayLen(4, new int[] { 2 }));
    Assertions.assertEquals(1, solution.minSubArrayLen(3, new int[] { 1, 1, 1, 9 }));
  }

  @Test
  public void official() {
    Assertions.assertEquals(6,
        solution.minSubArrayLen(80, new int[] { 10, 5, 13, 4, 8, 4, 5, 11, 14, 9, 16, 10, 20, 8 }));
  }

}
