package com.dataLinkedlist;


/*
 * This is node class for data and next node
 */
class Node {

    /*
     * Node Class
     */
    int data;
    Node next;

    /*
     * parameterized constructor
     */
    public Node(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}

/*
 * Class to define linked list operations
 */
class LinkedListNew {

    /*
     *To add node to linked list
     */
    public Node addNode(int data, Node head) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;

        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    /*
     * To delete last node of linked list
     */
    public void popLast(Node head) {
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        if (head.next == null) {
            head = null;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next = null;

    }

    /*
     * To display linked list
     */
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
 * This is main class of program
 */
public class LinkedList {

    /**
     * This is main method and starting point of program
     *
     * @param args
     */

    public static void main(String[] args) {

        LinkedListNew obj = new LinkedListNew();

        Node head = obj.addNode(56, null);
        obj.addNode(30, head);
        obj.addNode(70, head);

        obj.popLast(head);

        obj.printLinkedList(head);
    }
}

