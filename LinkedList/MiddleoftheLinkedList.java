package LinkedList;


public class MiddleoftheLinkedList {


    class ListNode {
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

    public static void main(String[] args) {

    }

//    public ListNode middleNode(ListNode head) {
//        ListNode fast = head;
//        ListNode slow = head;
//
//        while (fast.next != null && slow.next.next != null) {
//            fast = fast.next.next;
//            slow = slow.next;
//        }
//        return slow;
//    }
}
