
class Node {
    int value;
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
      reverse(t);
      System.out.println();
      printvalues(t);

    }
    public static Node add(Node s, int val){

        Node n= new Node(val);
        n.next=s;
        s= n;
        return s;
    }
    public static Node reverse(Node s){
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
        Node s=t;
        while(s!=null){
            System.out.println(s.value);
            s= s.next;
        }
    }
}

