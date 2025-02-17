class LinkedList {
    Node head;  // head of list

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;   // store next node
            current.next = prev;   // reverse current node's pointer
            prev = current;        // move prev and current one step forward
            current = next;
        }
        head = prev;  // change head to the last node
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Print the original list
        System.out.print("Original List: ");
        list.printList();

        // Reverse the list
        list.reverse();

        // Print the reversed list
        System.out.print("Reversed List: ");
        list.printList();
    }
}
