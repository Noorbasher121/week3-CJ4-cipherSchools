public class Linked1List{
    static class Node{
        int data;
        Node next;
        Node(int v)
        {
       data=v;
       next=null;
        }
    }
    public static void LinkedList(Node head){
        if(head==null)
        return ;
        System.out.println(head.data);
        LinkedList(head.next);
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        LinkedList( head);
    }
}

