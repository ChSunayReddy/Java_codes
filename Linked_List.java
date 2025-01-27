class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_List {
    private Node head;
    public void insert_beg(int d){
        Node p=new Node(d);
        if(head==null){
            head=p;
        }
        else{
            p.next=head;
        }
    }
    public void insert_end(int d){
        Node p=new Node(d);
        if(head==null){
            head=p;
        }
        else{
            Node q=head;
            while(q.next!=null){
                q=q.next;
            }
            q.next=p;
        }
    }
    public void insert_pos(int d,int pos){
        if(pos<0 || pos>size()){
            System.out.println("Invalid position");
            return;
        }
        if(pos==0) insert_beg(d);
        else{
            Node q=head;
            for (int i=0;i<pos-1;i++){
                q=q.next;
            }
            Node p=new Node(d);
            p.next=q.next;
            q.next=p;
        }
    }
        // Delete methods
        public void delete_beg() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }
            head = head.next; // Move head to the next node
        }
    
        public void delete_end() {
            if (head == null) {
                System.out.println("List is empty, nothing to delete.");
                return;
            }
            if (head.next == null) {
                head = null; // If there's only one node, set head to null
                return;
            }
            Node q = head;
            while (q.next.next != null) {
                q = q.next; // Traverse to the second last node
            }
            q.next = null; // Remove the last node
        }
    
        public void delete_pos(int pos) {
            if (pos < 0 || pos >= size()) {
                System.out.println("Invalid position");
                return;
            }
            if (pos == 0) {
                delete_beg();
            } else {
                Node q = head;
                for (int i = 0; i < pos - 1; i++) {
                    q = q.next;
                }
                q.next = q.next.next; // Bypass the node to delete it
            }
        }
    
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        
        // Insert elements at the beginning
        list.insert_beg(10);
        list.insert_beg(20);
        
        // Insert elements at the end
        list.insert_end(30);
        list.insert_end(40);
        
        // Insert element at a specific position
        list.insert_pos(25, 1); // Insert 25 at position 1
        
        // Display the linked list
        System.out.println("Linked List:");
        list.display();
        
        // Check the size of the linked list
        System.out.println("Size of the linked list: " + list.size());
         // Deleting elements
         list.delete_beg();
         System.out.println("Linked List after deleting from beginning:");
         list.display();
         
         list.delete_end();
         System.out.println("Linked List after deleting from end:");
         list.display();
         
         list.delete_pos(1); // Delete the node at position 1
         System.out.println("Linked List after deleting from position 1:");
         list.display();
         
         // Check the size of the linked list
         System.out.println("Size of the linked list: " + list.size());
    }
}
