package ARRAY.DEFINATION;

import ARRAY.ADT.arrayAdt;

import java.util.Scanner;

public class Defination implements arrayAdt {

    Scanner scanner = new Scanner(System.in);

    public boolean arrayCreated(int size) {

        size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        if (arr.length == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int retrieveIndex() {
        return 0;
    }

    public void storeData(int size) {

        size = scanner.nextInt();
        size = scanner.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public int sort() {
        return 0;
    }

    public int countTheElements(int size) {
        return size;
    }

    public int removeAnElement(int size, int removeElement) {
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (arr[i] == removeElement)
                arr[i] = 0;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        return removeElement;
    }
}
