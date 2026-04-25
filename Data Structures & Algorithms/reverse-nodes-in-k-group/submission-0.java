/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
     ListNode node=head;
     int cnt=0;
     while(cnt<k){
        if(node==null){
            return head;
        }
        node=node.next;
        cnt++;
     }   
     ListNode prev=null;
     ListNode curr=head;
     ListNode next=null;
     for(int i=0;i<k;i++){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }
     if(next!=null){
        head.next=reverseKGroup(next,k);
     }
     return prev;
    }
}
