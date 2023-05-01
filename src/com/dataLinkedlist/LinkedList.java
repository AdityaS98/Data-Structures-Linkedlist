package com.dataLinkedlist;

/*
 * This is node class for data and next node
 */
class Node4 {

    int data;
    Node4 next;

    /*
     * To define constructor for data and next node
     */
    public Node4(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}

/*
 * This class to create methods for pushing and displaying element of linked list
 */
class LinkedListNew4 {

    public int size;

    /*
     * To add node and data to linked list
     */
    public Node4 addNode(int data, Node4 head) {

        Node4 newNode = new Node4(data);

        if (head == null) {
            head = newNode;

        } else {
            Node4 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size++;
        return head;
    }

    public Node4 addInMid(int data, Node4 head) {

        /*
         * Create a new node
         */
        Node4 newNode = new Node4(data);

        // Checks if the list is empty
        if (head == null) {
            // If list is empty, both head and tail would point to new node
            head = newNode;
        } else {
            Node4 temp, current;
            // Store the mid position of the list
            int count = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            // Node temp will point to head
            temp = head;
            current = null;

            // Traverse through the list till the middle of the list is reached
            for (int i = 0; i < count; i++) {
                // Node current will point to temp
                current = temp;
                // Node temp will point to node next to it.
                temp = temp.next;
            }

            // current will point to new node
            current.next = newNode;
            // new node will point to temp
            newNode.next = temp;
        }
        size++;

        return head;
    }

    /*
     * To display element of linked list
     */
    public void printLinkedList(Node4 head) {
        if (head == null) {
            System.out.print("LinkedList is empty");
        } else {
            Node4 temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

/*
 * This is main class of program
 */
public class LinkedList{

    /**
     * This is main method and starting point of program
     * @param args
     */

    public static void main(String[] args) {

        /*
         * To create object for class
         */
        LinkedListNew4 list4 = new LinkedListNew4();

        Node4 head = list4.addNode(56, null);

        list4.addNode(70, head);

        list4.printLinkedList(head);

        list4.addInMid(30, head);

        list4.printLinkedList(head);
    }
}