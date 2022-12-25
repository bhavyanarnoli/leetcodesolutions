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
    public ListNode middleNode(ListNode head) {
        ListNode singlehope= head;
        ListNode doublehope= head;
        while(doublehope.next!=null && doublehope.next.next!= null){
            singlehope=singlehope.next;
            doublehope= doublehope.next.next;
        }
        if(doublehope.next!=null){
            return singlehope.next;
        }
        else{
            return singlehope;
        }
        
    }
}
