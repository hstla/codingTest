package solution;

public class Solution {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode solution = null;
        while(head != null) {
            ListNode temp = head;
            head = head.next;
            temp.next = solution;
            solution = temp;
        }
        return solution;
    }

    public static void main(String[] args) {
        Solution T = new Solution();
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);

        ListNode ln = T.reverseList(head);

        System.out.println(ln.val);
        System.out.println(ln.next.val);
        System.out.println(ln.next.next.val);
        System.out.println(ln.next.next.next.val);
        System.out.println(ln.next.next.next.next.val);
        System.out.println(ln.next.next.next.next.next.val);
    }
}
