
package com.dataLinkedlist;


/*
 * This is node class for data and next node
 */
class Node<E> {

    /*
     *  Data Stored in each Node of the Linked List
     */
    E data;

    /*
     * Pointer adding to the next node in the Linked List
     */
    Node<E> next;

    /*
     Node class constructor
     */
    Node(E data) {
        this.data = data;
    }
}

class LinkedLists<E> {

    // Points to the head of the Linked
    // List i.e the first element
    Node<E> head = null;
    int size = 0;

    // Addition of elements to the tail of the Linked List
    public void add(E element)
    {
        // Checks whether the head is created else creates a
        // new one
        if (head == null) {
            head = new Node<>(element);
            size++;
            return;
        }


        // Node to be added at tail of the Linked List
        Node<E> add = new Node<>(element);

        // Storing the instance of the
        // head pointer
        Node<E> temp = head;

        // The while loop for taking to the tail of the Linked list
        while (temp.next != null) {
            temp = temp.next;
        }

        // New Node is added at the tail of
        // the Linked List
        temp.next = add;

        // Size of the Linked List is incremented as
        // the elements are added
        size++;
    }

    /*
     Searches the Linked List for the given element
     */
    public int search(E element)
    {

        if (head == null) {
            return -1;
        }

        int index = 1;
        Node<E> temp = head;

        /*
        While loop is used to search the entire Linked List
         */

        while (temp != null) {

            /*
             Returns the index of that particular element,
             */

            if (temp.data == element) {
                return index;
            }

            // Gradually incrementing the index
            index++;
            temp = temp.next;
        }


        return -1;
    }
}

/*
 * This is our main class
 */

public class LinkedList {
    /*
    Main Method
     */

    public static void main(String[] args) {

        /*
         * Initializing the Linked List
         */
        LinkedLists<Integer> obj = new LinkedLists<>();

        // Adding elements to the Linked List
        obj.add(56);
        obj.add(30);
        obj.add(70);


        /*
         Element to be searched in the inked list
         */
        int element = 30;

        /*Searching the Linked List
        */
        int ans = obj.search(30);

        if (ans == -1) {
            System.out.println("Element not found");
        } else
            System.out.println("Element found at " + ans);
    }
}

