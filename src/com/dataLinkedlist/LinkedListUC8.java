
package com.dataLinkedlist;

class Node<E> {


    E data;


    Node<E> next;


    Node(E data) {
        this.data = data;
    }
}

class LinkedList<E> {


    Node<E> head = null;
    int size = 0;


    public void add(E element) {

        if (head == null) {
            head = new Node<>(element);
            size++;
            return;
        }

        Node<E> add = new Node<>(element);

        Node<E> temp = head;


        while (temp.next != null) {
            temp = temp.next;
        }


        temp.next = add;


        size++;
    }


    public int search(E element) {

        if (head == null) {
            return -1;
        }

        int index = 1;
        Node<E> temp = head;


        while (temp != null) {
    if (temp.data == element) {
                return index;
            }

            index++;
            temp = temp.next;
        }

        return -1;
    }

    public void insertPosition(int pos, int data) {
        Node obj = new Node(data);
        obj.data = data;
        obj.next = null;

        // Invalid position
        if (pos < 1 || pos > size + 1)
            System.out.println("Invalid");


        else if (pos == 1) {
            obj.next = head;
            head = obj;
            size++;
        }

        else {
            obj temp = head;

            while (--pos > 1) {
                temp = temp.next;
            }
            obj.next = temp.next;
            temp.next = obj;
            size++;
        }
    }

    public void display() {
        System.out.print("Linked List is as follows : ");

        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

}

public class LinkedLists {

    public static void main(String[] args) {

        /*
         * Initializing the Linked List
         */
        LinkedLists<Integer> ref = new LinkedLists<>();

        /*
         * Adding elements to the Linked List
         */
        ref.add(56);
        ref.add(30);
        ref.add(70);


        /*
         * Element to be searched
         */
        int element = 30;
        int position = ref.search(element)+1;


        ref.insertPosition(position,40);


        ref.display();
    }
}