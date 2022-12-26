
class Solution{
static Node exchangeNodes(Node head)
{
     
    // If list is of length less than 2
    if (head == null || head.next == null) {
        return head;
    }
    Node tail = head;
   
    // Find pointer to the last node
    while (tail.next != head) {
        tail = tail.next;
    }
    /* Exchange first and last nodes using
       head and p */
   
    // temporary variable to store
    // head data
    
    int temp = tail.data;
    tail.data = head.data;
    head.data = temp;
    return head;
}
static Node changevalues(Node head){
 // If list is of length less than 2
    if (head == null || head.next == null) {
        return head;
    }
    Node tail = head;
   
    // Find pointer to the last node
    while (tail.next.next != head) {
        tail = tail.next;
    }
   ListNode t= tail.next;
  tail.next= head;
  t.next= head.next;
 head.next=t;
  head=t;
  return head;


}
 }
