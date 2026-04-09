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
        if(lists.length==0){
            return null;
        }
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode node:lists){
            if(node!=null){
                pq.add(node);
            }
        }
        ListNode temp=new ListNode(0);
        ListNode t=temp;
        while(!pq.isEmpty()) {
            ListNode smallest=pq.poll();
            t.next=smallest;
            t=t.next;
            if(smallest.next!=null){
                pq.add(smallest.next);
            }
        }
        return temp.next;
    }
}
