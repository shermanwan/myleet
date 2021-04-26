package shm.myleet.list;

import shm.myleet.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
class Q19RemoveNthFromEnd {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    // 虚拟节点头
    ListNode virtualHead = new ListNode();
    virtualHead.next = head;

    ListNode fast = virtualHead, slow = virtualHead;
    int i = 0;
    // 快指针迁移 n 格
    while (i < n) {
      // 链表长度不满 n
      if (fast.next == null) {
        return virtualHead.next;
      }
      fast = fast.next;
      i++;
    }

    // 快慢指针同步移动，直到快指正到链表尾，此时慢指针指向倒数第 n 个节点
    while (fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }

    // 删除
    if (slow.next != null) {
      slow.next = slow.next.next;
    }

    return virtualHead.next;
  }

}
