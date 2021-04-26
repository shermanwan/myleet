package shm.myleet.list;

import shm.myleet.common.ListNode;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/ 给你一个链表的头节点 head
 * 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 */
class Q203RemoveElements {

  public ListNode removeElements(ListNode head, int val) {
    // 虚拟节点头
    ListNode virtualHead = new ListNode();
    virtualHead.next = head;

    ListNode cur = virtualHead;
    while (cur != null) {
      ListNode curNext = cur.next;
      // 判断 cur 的下一个节点是否满足要求
      if (curNext != null && curNext.val == val) {
        cur.next = curNext.next;
        // 删除了下一个，下下个直接变下一个，cur 就不需要移动了
      } else {
        // 移动 cur 到下一个
        cur = cur.next;
      }
    }

    return virtualHead.next;
  }

}
