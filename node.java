class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) 
        {
            head = newNode;
            return;
        }
        
        Node temp = head;

        while (temp.next != null) 
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void printList()