package shm.myleet.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

// Definition for singly-linked list.
public class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {
  }

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode valueOf(int[] nums) {
    ListNode cur = null;
    for (int i = nums.length - 1; i >= 0; i--) {
      cur = new ListNode(nums[i], cur);
    }
    return cur;
  }

  public int[] toArray() {
    Vector<Integer> v = new Vector<Integer>();
    ListNode cur = this;
    while (cur != null) {
      v.add(cur.val);
      cur = cur.next;
    }
    return v.toArray(new int[]{});
  }
}
