package shm.myleet.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import shm.myleet.common.ListNode;

public class Q203RemoveElementsTests {

  Q203RemoveElements solution = new Q203RemoveElements();

  @Test
  public void basic() {
    ListNode input = ListNode.valueOf(new int[] { 1,2,6,3,4,5,6 });
    int[] result = solution.removeElements(input, 6);
    Assertions.assertEquals(2, );
    Assertions.assertEquals(1, solution.removeElements(4, new int[] { 1, 4, 4 }));
    Assertions.assertEquals(0, solution.removeElements(11, new int[] { 1, 1, 1, 1, 1, 1, 1, 1 }));
  }



}
