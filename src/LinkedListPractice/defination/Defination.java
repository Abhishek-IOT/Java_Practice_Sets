package LinkedListPractice.defination;

import LinkedListPractice.ADT.LinkedListADT;

public class Defination implements LinkedListADT {
    Node head = null;
    int size;

    public Node getNode(int index) {
        Node response = null;
        for (int i = 0; i < size; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Defination{");
        for (int i = 0; i < size; i++) {
            int data = getNode(i).getData();
        }
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void print() {
        toString();
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
