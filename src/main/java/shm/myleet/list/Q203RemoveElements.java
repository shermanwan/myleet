package shm.myleet.list;

import shm.myleet.common.ListNode;

class Q203RemoveElements {

  public ListNode removeElements(ListNode head, int val) {
    // 虚拟节点头
    ListNode virtualHead = new ListNode();
    virtualHead.next = head;

    ListNode cur = virtualHead;
    while (cur != null) {
      ListNode curNext = cur.next;
      if (curNext != null && curNext.val == val) {
        cur.next = curNext.next;
        // 删除了下一个就不需要跳到下一个了
      } else {
        // 不删除就要跳下一个
        cur = cur.next;
      }

    }

    return virtualHead.next;
  }

}
