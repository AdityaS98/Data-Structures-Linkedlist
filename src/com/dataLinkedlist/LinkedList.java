package com.dataLinkedlist;


/*
 * This is node class for data and next node
 */
class LinkedListNew {
    Node head;

    /*
     * Node Class
     */
    class Node {
        int data;
        Node next;
    /* Declaring Constructor
     */
        Node(int x)
        {
            data = x;
            next = null;
        }
    }
    /* Method to delete the elements
    */
    public void deleteStart() {
        if (head == null) {
            System.out.println("List is empty, not possible to delete");
            return;
        }

        System.out.println("Deleted: " + head.data);
        /*move head to next node
         */
        head = head.next;
    }
    /*Method to insert the node
     */
    public Node insert(int data) {

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
/*Method to display the changes
 */
    public void display() {
        Node node = head;
        // as linked list will end when Node reaches Null
        while (node != null) {
            System.out.print(node.data + "->");
            node = node.next;
        }
        System.out.println("");
    }
}
//Main class of our program
public class LinkedList {
// Main method of the program
    public static void main(String[] args) {

        LinkedListNew list5 = new LinkedListNew();

        list5.insert(56);
        list5.insert(30);
        list5.insert(70);

        list5.display();

        list5.deleteStart();
        list5.display();
    }
}
