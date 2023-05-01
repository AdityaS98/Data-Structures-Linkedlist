package com.dataLinkedlist;

class Node {

    int data;
    Node next;

    /*
     * To define constructor for data and next node
     */
    public Node(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}

/*
 * This class is used  to create methods for pushing and displaying element of linked list
 */
class LinkedListNewUpdated {

    /*
     * To add node and data to linked list and displaying it
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
     * To display element of linked list
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
        LinkedListNewUpdated list1 = new LinkedListNewUpdated();

        Node head = list1.addNode(56, null);
        list1.addNode(30, head);
        list1.addNode(70, head);

        list1.printLinkedList(head);
    }
}