// linked list introduction
class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
        this.next = null;
    }
}
class singly_intro{
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
    public static int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,7};
        Node head=converttoLL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println(length(head));
    }
}