package LinkedListPractice.defination;

import LinkedListPractice.ADT.LinkedListADT;

public class Defination implements LinkedListADT {
    Node head = null;
    int size;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Defination{");
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void print() {

    }


    private static class Node {
        Node next = null;
        int data = 0;

        public Node(int data) {
            this.data = data;
        }

        public Node(Node next, int data) {
            this.next = next;
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public int getData() {
            return data;
        }
    }
}
