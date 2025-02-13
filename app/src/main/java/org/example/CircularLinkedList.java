package org.example;
import java.util.Random;

public class CircularLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head = null;
    private Node<T> current = null;
    private final Random random = new Random(); // Random generator for dice roll

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node<T> temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
        current = head;
    }

    public T current() {
        return (current != null) ? current.data : null;
    }

    public void step() {
        if (current != null) {
            current = current.next;
        }
    }
    public void doubleDice() {
        int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1;
        for (int i = 0; i < roll; i++) {
            step();
        }
        System.out.println("Rolled: " + roll);
    }

    public void printList() {
        if (head == null) return;
        Node<T> temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }
}
