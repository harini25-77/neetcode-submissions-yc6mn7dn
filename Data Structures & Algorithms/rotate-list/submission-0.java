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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(k==0) return head;
        int count=1;
        ListNode temp=head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        int r=k%count;
        r=count-r;
        temp.next=head;
        while(r>0){
            temp=temp.next;
            r--;
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}