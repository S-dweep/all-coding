// search in a singly linked list
// Time complexity: O(n)
// Space complexity: O(1)
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class singly_search{
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
    public static int search(Node head, int k){
        Node temp = head;
        while(temp != null){
            if(temp.data==k) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node head=converttoLL(arr);
        int k=sc.nextInt();
        System.out.println(search(head,k));
    }
}