package com.dataLinkedlist;

class Node {

    int data;
    Node next;
    public Node(int data) {
        super();
        this.data = data;
        this.next = null;
    }
}
class LinkedListNewUpdated{

    /*
     * To add element at end of list
     */

    public Node addNode(int data, Node head){

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

public class StructureLinkedList {
    /*
     * This is the main function of our program
     */
    public static void main(String[] args) {
        /*
         * To create object of class
         */
        StructureLinkedList obj = new StructureLinkedList();

        obj.addNode(30,head);
       obj.addNode(70, head);

      obj.printLinkedList(head);
    }
}