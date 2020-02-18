package LinkedListPractice.defination;

import LinkedListPractice.ADT.LinkedListADT;

public class Defination implements LinkedListADT {
    Node head = null;
    int size;

    public void addFirst(int data) {
        head = new Node(head, data);
        size++;
    }

    public Node getNode(int index) {
        Node response = null;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("[");
        Node currentNode = head;
        for (int i = 0; i < size && currentNode != null; i++) {
            int data = currentNode.getData();
            sb.append(data);
            sb.append(i < size - 1 ? ", " : "");
            currentNode = currentNode.getNext();
        }
        sb.append("]");
        return sb.toString();
    }


    public void printReverse() {

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

        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
