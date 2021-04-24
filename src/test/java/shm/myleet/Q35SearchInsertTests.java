package shm.myleet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q35SearchInsertTests {

  Q35SearchInsert solution = new Q35SearchInsert();

  @Test
  public void test() {
    Assertions.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5), 2);
    Assertions.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2), 1);
    Assertions.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7), 4);
    Assertions.assertEquals(solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0), 0);
  }

}
