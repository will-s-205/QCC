package core;

import java.util.HashSet;

public class LinkedListCycle {

    public boolean hasCycleHashSet(ListNode head) {
        HashSet<ListNode> hset = new HashSet<>();

        while (head != null) {
            if (hset.contains(head)) {
                return true;
            }
            hset.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycleTwoPointers(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) { // fast.next != null is important
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}