// delete operations
// delete first node
// delete last node
// delete kth node
// delete given element from list
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class singly1{
    public static Node converttoLL(int arr[]){
        Node head = new Node(arr[0]);
        Node current = head;
        for(int i=1;i<arr.length;i++){
            Node node = new Node(arr[i]);
            current.next = node;
            current = node;
        }
        return head;
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+" -> ");
            head=head.next;
        }
        System.out.println("NULL");
    }
    public static Node deletefirst(Node head){
        if(head==null) return head;
        head=head.next;
        return head;
    }
    public static Node deletelast(Node head){
        if(head==null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteKnode(Node head, int k){
        if(head==null) return head;
        if(k==1){
            head=deletefirst(head);
            return head;
        }
        int count=0;
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        } return head;
    }
    public static Node deleteElm(Node head, int elm){
        if(head==null) return head;
        if(head.data==elm){
            head=deletefirst(head);
            return head;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null){
            if(temp.data==elm){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        } return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node head=converttoLL(arr);
        display(head);
        int elm=sc.nextInt();
        head=deleteElm(head,elm);
        display(head);
    }
}