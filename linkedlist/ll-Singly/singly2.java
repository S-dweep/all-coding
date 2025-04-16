// insert operations
// insert first node
// insert last node
// insert kth node
// insert given element from list
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data=data;
        this.next=next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class singly2{
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
    public static Node insertfirst(Node head, int val){
        return new Node(val, head);
    }
    public static Node insertlast(Node head, int val){
        if(head==null) return new Node(val);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(val);
        return head;
    }
    public static Node insertKnode(Node head, int val, int k){
        if(head==null) return new Node(val);
        if(k==1) return new Node(val, head);
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==k-1){
                temp.next=new Node(val, temp.next);
                //Node newnode=new Node(val);
                //newnode.next=temp.next;
                //temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node insertbeforeElm(Node head, int val, int elm){
        if(head==null) return null;
        if(head.data==elm) return new Node(val, head);
        Node temp=head;
        while(temp.next!=null){
            if(temp.next.data==elm){
                temp.next=new Node(val, temp.next);
                //Node newnode=new Node(val);
                //newnode.next=temp.next;
                //temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return head;
    }
    public static Node insertafterElm(Node head, int val, int elm){
        if(head==null) return null;
        if(head.data==elm){
            head.next=new Node(val, head.next);
            return head;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.data==elm){
                temp.next=new Node(val, temp.next);
                //Node newnode=new Node(val);
                //newnode.next=temp.next;
                //temp.next=newnode;
                break;
            }
            temp=temp.next;
        }
        return head;
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
        int val=sc.nextInt();
        int elm=sc.nextInt();
        head=insertafterElm(head,val,elm);
        display(head);
    }
}