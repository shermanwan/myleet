package shm.myleet.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import shm.myleet.common.ListNode;

public class Q203RemoveElementsTests {

  Q203RemoveElements solution = new Q203RemoveElements();

  @Test
  public void basic1() {
    ListNode input = ListNode.valueOf(new int[] { 1, 2, 6, 3, 4, 5, 6 });
    ListNode result = solution.removeElements(input, 6);
    Assertions.assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, ListNode.toArray(result));
  }

  @Test
  public void basic2() {
    ListNode input = ListNode.valueOf(new int[] {});
    ListNode result = solution.removeElements(input, 1);
    Assertions.assertArrayEquals(new int[] {}, ListNode.toArray(result));
  }

  @Test
  public void basic3() {
    ListNode input = ListNode.valueOf(new int[] { 7, 7, 7, 7 });
    ListNode result = solution.removeElements(input, 7);
    Assertions.assertArrayEquals(new int[] {}, ListNode.toArray(result));
  }

}
