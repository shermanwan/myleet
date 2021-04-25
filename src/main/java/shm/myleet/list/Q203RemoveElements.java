package shm.myleet.list;

import shm.myleet.common.ListNode;

class Q203RemoveElements {

  public ListNode removeElements(ListNode head, int val) {
    ListNode virtualHead = new ListNode();
    virtualHead.next = head;

    ListNode cur = virtualHead;
    while (cur != null) {
      ListNode curNext = cur.next;
      if (curNext != null && curNext.val == val) {
        cur.next = curNext.next;
      }
      cur = cur.next;
    }

    return virtualHead.next;
  }

}
