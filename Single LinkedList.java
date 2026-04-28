// Node class represents each element in the linked list
class Node {
    int data;      // Variable to store data
    Node next;     // Reference to next node

    // Constructor to initialize node
    Node(int data) {
        this.data = data;   // Assign value to data
        this.next = null;   // Initially next is null
    }
}

// LinkedList class contains all operations
class LinkedList {
    Node head;   // Head points to first node

    // Insert element at beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create new node
        newNode.next = head;            // New node points to current head
        head = newNode;                 // Move head to new node
    }

    // Insert element at end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);  // Create new node

        if (head == null) {             // If list is empty
            head = newNode;             // New node becomes head
            return;
        }

        Node temp = head;               // Start from head

        while (temp.next != null) {     // Traverse till last node
            temp = temp.next;
        }

        temp.next = newNode;            // Link last node to new node
    }

    // Insert element at specific position
    void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);  // Create new node

        if (pos == 1) {                 // If position is 1
            newNode.next = head;        // Point to current head
            head = newNode;             // Update head
            return;
        }

        Node temp = head;               // Start from head

        // Traverse to (pos-1) node
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {             // If position is invalid
            System.out.println("Position not valid");
            return;
        }

        newNode.next = temp.next;       // Link new node to next node
        temp.next = newNode;            // Link previous node to new node
    }

    // Delete node from beginning
    void deleteFromBeginning() {
        if (head == null) {             // If list is empty
            System.out.println("List is empty");
            return;
        }

        head = head.next;               // Move head to next node
    }

    // Delete node from end
    void deleteFromEnd() {
        if (head == null) {             // If list is empty
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {        // If only one node
            head = null;                // Delete it
            return;
        }

        Node temp = head;               // Start from head

        // Traverse to second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;               // Remove last node
    }

    // Delete node by value
    void deleteByValue(int key) {
        if (head == null) return;       // If list is empty

        if (head.data == key) {         // If first node matches
            head = head.next;           // Delete first node
            return;
        }

        Node temp = head;               // Start from head

        // Find node before the target node
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next == null) {        // If value not found
            System.out.println("Value not found");
            return;
        }

        temp.next = temp.next.next;     // Skip the node (delete it)
    }

    // Search for an element
    void search(int key) {
        Node temp = head;               // Start from head
        int pos = 1;                   // Position counter

        while (temp != null) {         // Traverse list
            if (temp.data == key) {    // If element found
                System.out.println("Found at position: " + pos);
                return;
            }
            temp = temp.next;          // Move to next node
            pos++;                     // Increment position
        }

        System.out.println("Not found"); // If element not found
    }

    // Display linked list
    void display() {
        Node temp = head;              // Start from head

        while (temp != null) {         // Traverse list
            System.out.print(temp.data + " -> "); // Print data
            temp = temp.next;          // Move to next node
        }

        System.out.println("null");    // End of list
    }
}

// Main class to run program
public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList(); // Create linked list

        // Insert operations
        list.insertAtBeginning(10); // List: 10
        list.insertAtBeginning(5);  // List: 5 -> 10
        list.insertAtEnd(20);       // List: 5 -> 10 -> 20
        list.insertAtEnd(30);       // List: 5 -> 10 -> 20 -> 30
        list.insertAtPosition(15, 3); // Insert 15 at position 3

        System.out.println("After Insertions:");
        list.display(); // Display list

        // Delete operations
        list.deleteFromBeginning(); // Delete first node
        list.deleteFromEnd();       // Delete last node
        list.deleteByValue(15);     // Delete node with value 15

        System.out.println("After Deletions:");
        list.display(); // Display updated list

        // Search operations
        list.search(20);  // Search for 20
        list.search(100); // Search for 100 (not present)
    }
}
