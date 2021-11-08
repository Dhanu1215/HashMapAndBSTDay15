package com.blp.hashtables;

public class HashTable {

    public static void main(String[] args) {
        HashTable map = new HashTable();
        map.put(0,"To");
        map.put(1,"be");
        map.put(2,"or");
        map.put(3,"not");
        map.put(4,"To");
        map.put(5,"be");
        map.display();
    }

    //Represent the head and tail of the singly linked list
    public MyMapNode head = null;
    public MyMapNode tail = null;
    public MyMapNode position;

    public void put( Integer position, String data) {
        //Create a new node
        MyMapNode newNode = new MyMapNode(position,data);
        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }

    }
    public void findFrequency(Integer position,String data) {
        MyMapNode newNode = new MyMapNode(position, data);
    }

    public void display() {
        //Node current will point to head
        MyMapNode current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
