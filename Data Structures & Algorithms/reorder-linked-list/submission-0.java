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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        int c = 0;
ArrayList<ListNode>li=new ArrayList<>();
        while (temp != null) {
            li.add(temp);
            c += 1;
            temp = temp.next;
        }
int left=0;
int right=li.size()-1;
while(left<right){
    li.get(left).next=li.get(right);
    left++;
    if(left>=right){
        break;
    }
    li.get(right).next=li.get(left);
    right--;
}
li.get(left).next=null;

      
    }
}