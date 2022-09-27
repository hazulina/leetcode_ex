public class Task_19_RemoveNNodeOfList {
    ListNode slow;
    ListNode fast;
    ListNode current;

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if ((head == null) || head.next == null && n == 1) {  //if null or 1 element
            return null;
        }
        current = head;
        fast = head;
        for (int i = 1; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = current;
            current = current.next;
            fast = fast.next;
        }
        if (n == 1) {              // remove last one
            slow.next = null;
            current = null;
            fast = null;
            return head;
        }
        if (head.equals(current) && slow == null) { // remove first one
            head = current.next;
            current = head;
            return head;
        }
        slow.next = current.next; // other cases
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
