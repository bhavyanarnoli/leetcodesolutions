
class Node {
    static int value;
    Node next;

    Node  (int val){
        this.value= val;
        this.next= null;
    }



}
public class Main {
    public static void main(String[] args) {
      Node t= new Node(1);
      t=add(t,2);
      t= add(t,3);
      t= add(t,4);
      t= add(t,5);
      printvalues(t);
    }
    public static Node add(Node s, int val){
        Node head= s;
        Node n= new Node(val);
        while(s.next!=null){
            s= s.next;
        }
        s.next=n;
        return head;
    }
    public Node reverse(Node s, int val){
        Node t=s;
        Node p=s;
        if(t.next==null){
            return t;
        }
        while(t.next!=null){
            p=s;
            s=t;
            s.next=p;
            t= t.next;
        }
        t.next=s;
        return t;
    }
    public static void printvalues(Node t){
        while(t!=null){
            System.out.println(t.value);
            t= t.next;
        }
    }
}

