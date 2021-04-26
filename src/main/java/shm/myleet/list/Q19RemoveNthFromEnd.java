package shm.myleet.list;

import shm.myleet.common.ListNode;

// https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
class Q19RemoveNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    // 虚拟节点头
    ListNode virtualHead = new ListNode();
    virtualHead.next = head;

    ListNode fast = virtualHead, slow = virtualHead;
    int i = 0;
    while (i < n) {
      // 输入连表长度不满 n
      if (fast.next == null) {
        return virtualHead.next;
      }
      fast = fast.next;
      i++;
    }

    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    if (slow.next != null) {
      slow.next = slow.next.next;
    }

    return virtualHead.next;
  }

}
