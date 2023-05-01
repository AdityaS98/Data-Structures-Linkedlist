package com.dataLinkedlist;

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    /*
     * Represent the head and tail of the singly linked list
     */
    public Node head = null;

    /*
     * addAtStart() will add a new node to the beginning of the list
     */
    public void addAtStart(int data) {
        /*
         * Create a new node
         */
        Node newNode = new Node(data);

        /*
         * Checks if the list is empty
         */
        if(head == null) {
            /*
             * If list is empty, both head and tail will point to new node
             */
            head = newNode;

        }
        else {
            /*
             * Node temp will point to head
             */
            Node temp = head;
            /*
             * newNode will become new head of the list
             */
            head = newNode;
            /*
             * Node temp(previous head) will be added after new head
             */
            head.next = temp;
        }
    }

    /*
     * display() will display all the nodes present in the list
     */
    public void display() {
        /*
         * Node current will point to head
         */
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Adding nodes to the start of the list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.print("LinkedList is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }
}

/*
 * This is main class of our program
 */
public class StructureLinkedList {
    /*
     * This is the main function of our program
     */
    public static void main(String[] args) {
        /*
         * To create object of class
         */
        StructureLinkedList obj = new StructureLinkedList();

        //Adding 70 to the list
        obj.addAtStart(70);
        obj.display();

        //Adding 30 to the list
        obj.addAtStart(30);
        obj.display();

        //Adding 56 to the list
        obj.addAtStart(56);
        obj.display();
    }

}
