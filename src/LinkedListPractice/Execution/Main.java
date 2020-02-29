package LinkedListPractice.Execution;

import LinkedListPractice.defination.Defination;

public class Main {
    public static void main(String[] args) {
        Defination defination = new Defination();
        defination.addFirst(22);
        defination.addFirst(24);
        defination.addFirst(1);
        defination.addFirst(2);
        defination.addFirst(3);
        System.out.println(defination.printReverse(3));
    }
}
