/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.circularlinkedlist;

/**
 *
 * @author kamau
 */
public class CIrcularLinkedList {

    class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    //method insert
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    //method to display the list

    public void display() {
        Node current = head;
        if (head == null) {
            System.out.println("the list is empty");
        } else {
            do {
                System.out.println(current.data);
                current=current.next; 
            } while (current != head);
        }
    }

    public static void main(String[] args) {
        //creating a new sinlgyLinkedList
        CIrcularLinkedList newList = new CIrcularLinkedList();
        //Adding data to the list by calling the insert function 
        newList.insert(11);
         newList.insert(31);   
        newList.insert(67); 
        newList.insert(23); 
        newList.insert(5);
        
        newList.display();
    }
}
