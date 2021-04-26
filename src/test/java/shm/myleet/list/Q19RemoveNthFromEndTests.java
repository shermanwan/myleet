package shm.myleet.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import shm.myleet.common.ListNode;

public class Q19RemoveNthFromEndTests {

  Q19RemoveNthFromEnd solution = new Q19RemoveNthFromEnd();

  @Test
  public void basic1() {
    ListNode input = ListNode.valueOf(new int[] { 1, 2, 3, 4, 5 });
    ListNode result = solution.removeNthFromEnd(input, 2);
    Assertions.assertArrayEquals(new int[] { 1, 2, 3, 5 }, ListNode.toArray(result));
  }

  @Test
  public void basic2() {
    ListNode input = ListNode.valueOf(new int[] { 1 });
    ListNode result = solution.removeNthFromEnd(input, 1);
    Assertions.assertArrayEquals(new int[] {}, ListNode.toArray(result));
  }

  @Test
  public void basic3() {
    ListNode input = ListNode.valueOf(new int[] { 1, 2 });
    ListNode result = solution.removeNthFromEnd(input, 1);
    Assertions.assertArrayEquals(new int[] { 1 }, ListNode.toArray(result));
  }

}
