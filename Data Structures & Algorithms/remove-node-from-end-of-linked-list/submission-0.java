/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int size = list.size();
        int indexToRemove = size - n;

        if (indexToRemove == 0) {
            return head.next;
        }

       ListNode prev = list.get(indexToRemove - 1);
        prev.next = list.get(indexToRemove).next;

        return head;
    }
}