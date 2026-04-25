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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->a.val-b.val);

    for(ListNode l:lists){
        if(l!=null){
            pq.add(l);
        }
    }
    ListNode curr=new ListNode(0);
    ListNode temp=curr;
    while(!pq.isEmpty()){
     ListNode currN=pq.poll();
     temp.next=currN;
     temp=temp.next;
    if(currN.next!=null)
    {
        pq.add(currN.next);
    }
    }
    return curr.next;
    }
}
