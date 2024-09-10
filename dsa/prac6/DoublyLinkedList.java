import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current != null) {
            if (current.prev != null) {
                current.prev.next = current.next;
            }
            if (current.next != null) {
                current.next.prev = current.prev;
            }
            if (current == tail) {
                tail = current.prev;
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Traverse List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertValue = scanner.nextInt();
                    list.insert(insertValue);
                    System.out.println("Node inserted.");
                    break;
                
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteValue = scanner.nextInt();
                    list.delete(deleteValue);
                    System.out.println("Node deleted if it existed.");
                    break;
                
                case 3:
                    System.out.println("Current Doubly Linked List:");
                    list.traverse();
                    break;
                
                case 4:
                    System.out.println("Exiting...");
                    break;
                
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
