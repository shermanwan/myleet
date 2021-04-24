package shm.myleet.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q35SearchInsertTests {

  Q35SearchInsert solution = new Q35SearchInsert();

  @Test
  public void test() {
    Assertions.assertEquals(2, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    Assertions.assertEquals(1, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    Assertions.assertEquals(4, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    Assertions.assertEquals(0, solution.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
  }

  @Test
  public void testBoundary() {
    int index = 1;
    Assertions.assertEquals(0, solution.searchInsert(new int[] {}, 1), "Q35.boundary." + index++);
    Assertions.assertEquals(0, solution.searchInsert(new int[] { 1 }, 1), "Q35.boundary." + index++);
    Assertions.assertEquals(0, solution.searchInsert(new int[] { 2 }, 1), "Q35.boundary." + index++);
    Assertions.assertEquals(1, solution.searchInsert(new int[] { 2 }, 3), "Q35.boundary." + index++);
    Assertions.assertEquals(0, solution.searchInsert(new int[] { 2, 3 }, 1), "Q35.boundary." + index++);
    Assertions.assertEquals(2, solution.searchInsert(new int[] { 2, 3 }, 4), "Q35.boundary." + index++);
  }

}
