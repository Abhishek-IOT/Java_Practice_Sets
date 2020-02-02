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

    public int storeData() {

        int size = scanner.nextInt();

    }

    public int sort() {
        return 0;
    }

    public int countTheElements() {
        return 0;
    }

    public int removeAnElement() {
        return 0;
    }
}
