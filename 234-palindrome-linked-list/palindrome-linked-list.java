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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        //turtle and hare approach to find mid element
        ListNode tur=head;
        ListNode hare=head;
        while(hare!=null && hare.next!=null){
            tur=tur.next;
            hare=hare.next.next;
        }
        //reverse secondhalf
        ListNode prev=null;
        while(tur!=null){
            ListNode next=tur.next;
            tur.next=prev;
            prev=tur;
            tur=next;
        }
        //Compare
        ListNode f=head;
        ListNode s=prev;
        while(s!=null){
            if(f.val!=s.val) return false;
            f=f.next;
            s=s.next;
        }
        return true;
    }
}