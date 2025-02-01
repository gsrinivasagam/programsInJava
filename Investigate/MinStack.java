package Investigate;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {

    public static void main(String[] args) {
        MinStack min = new MinStack();
        min.push(5);
        min.push(6);
        min.push(8);
        min.push(2);
        min.push(7);
        min.push(9);
        min.push(1);
        min.pop();
        System.out.println(min.top());
        System.out.println(min.getMin());

    }

    private Node head;

    public void push(int x) {
        if (head == null) head = new Node(x, x, null);
        else head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }


    }
}
