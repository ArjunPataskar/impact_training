import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class Presentinnodeornot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter node values: ");
        Node head = null, tail = null;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.print("Enter value to search: ");
        int target = sc.nextInt();
        boolean found = false;

        Node current = head;
        while (current != null) {
            if (current.data == target) {
                found = true;
                break;
            }
            current = current.next;
        }

        if (found)
            System.out.println("Node is present.");
        else
            System.out.println("Node is not present.");

        sc.close();
    }
}
