import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class SinglyFinal{
    static Node head=null;

    public static void insertAtBeginning(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        System.out.println(data+" inserted.");
    }

    public static void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(head==null) head=newnode;
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
        System.out.println(data+" inserted.");
    }

    public static void insertAtKthnode(int data, int k){
        if(k<1){
            System.out.println("Invalid position.");
            return;
        }
        if(k==1){
            insertAtBeginning(data);
            return;
        }
        Node newnode=new Node(data);
        int count=1;
        Node temp=head;
        while(temp!=null && count<k-1){
            count++;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Index out of bounds.");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println(data+" inserted at position "+k);
    }

    public static void insertBeforeValue(int data, int target){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        if(head.data==target){
            insertAtBeginning(data);
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        while(temp.next!=null && temp.next.data!=target){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Target not found.");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println(data+" inserted before "+target);
    }
    
    public static void insertAfterValue(int data, int target){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        Node newnode=new Node(data);
        Node temp=head;
        while(temp!=null && temp.data!=target){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Target not found.");
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        System.out.println(data+" inserted after "+target);
    }

    public static void deleteFromBeginning(){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        System.out.println(head.data+" deleted.");
        head=head.next;
    }

    public static void deleteFromEnd(){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        if(head.next==null){
            System.out.println(head.data+" deleted.");
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println(temp.next.data+" deleted.");
        temp.next=null;
    }

    public static void deleteFromKthnode(int k){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        if(k<1){
            System.out.println("Invalid position.");
            return;
        }
        if(k==1){
            deleteFromBeginning();
            return;
        }
        int count=1;
        Node temp=head;
        Node prev=null;
        while(temp!=null && count<k){
            count++;
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Index out of bounds.");
            return;
        }
        System.out.println(temp.data+" deleted from position "+k);
        prev.next=temp.next;
    }

    public static void deleteValue(int target){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        if(head.data==target){
            deleteFromBeginning();
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp!=null && temp.data!=target){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Target not found.");
            return;
        }
        System.out.println(target+" deleted.");
        prev.next=temp.next;
    }

    public static void display(){
        if(head==null){
            System.out.println("List empty.");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice, value, pos, targetval;
        while(true){
            System.out.println("---Singly Linked List Operations---");
            System.out.println("1) Insert at beginning");
            System.out.println("2) Insert at end");
            System.out.println("3) Insert at kth node");
            System.out.println("4) Insert before value");
            System.out.println("5) Insert after value");
            System.out.println("6) Delete from beginning");
            System.out.println("7) Delete from end");
            System.out.println("8) Delete from kth node");
            System.out.println("9) Delete value from list");
            System.out.println("10) Display");
            System.out.println("11) Exit");
            System.out.println("Select your operation: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter value to insert at beginning: ");
                    value=sc.nextInt();
                    insertAtBeginning(value);
                    break;

                case 2:
                    System.out.println("Enter value to insert at end: ");
                    value=sc.nextInt();
                    insertAtEnd(value);
                    break;

                case 3:
                    System.out.println("Enter value to insert: ");
                    value=sc.nextInt();
                    System.out.println("Enter position: ");
                    pos=sc.nextInt();
                    insertAtKthnode(value, pos);
                    break;
                
                case 4:
                    System.out.println("Enter value to insert: ");
                    value=sc.nextInt();
                    System.out.println("Enter value to insert before: ");
                    targetval=sc.nextInt();
                    insertBeforeValue(value, targetval);
                    break;

                case 5:
                    System.out.println("Enter value to insert: ");
                    value=sc.nextInt();
                    System.out.println("Enter value to insert after: ");
                    targetval=sc.nextInt();
                    insertAfterValue(value, targetval);
                    break;
                
                case 6:
                    deleteFromBeginning();
                    break;

                case 7:
                    deleteFromEnd();
                    break;
                
                case 8:
                    System.out.println("Enter position to delete from: ");
                    pos=sc.nextInt();
                    deleteFromKthnode(pos);
                    break;

                case 9:
                    System.out.println("Enter value to delete: ");
                    targetval=sc.nextInt();
                    deleteValue(targetval);
                    break;

                case 10:
                    display();
                    break;

                case 11:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                
                default:
                    System.out.println("Invalid choice...");
            }
        }
    }
}