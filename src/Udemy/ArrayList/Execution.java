package Udemy.ArrayList;

import java.util.Scanner;

public class Execution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean yo = true;
        System.out.println("Enter the array");

        arrayList arr = new arrayList();
        int c = 0;
        System.out.println("Welcome to Abhishek List\n" +
                "Press 1 for adding the data\n" +
                "Press 2 for deleting the data\n" +
                "Press 3 for viewing all the data\n" +
                "Press 4 for modifying the data\n" +
                "Press 5 for searching the data\n" +
                "Press 6 for exiting from the menu");

        while (yo == true) {
            if (c == 0) {
                System.out.println("round=" + (++c));
            } else {
                System.out.println("next round=" + (++c));
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected for adding the data\n" +
                            "Give the data to be added");
                    String data = scanner.next();
                    arr.addData(data);
                    arr.viewAllData();
                    break;
                case 2:
                    System.out.println("You have enter to remove the data\n" +
                            "Please tell the location from where index has to be removed");
                    int index = scanner.nextInt();
                    arr.removeData(index);
                    break;
                case 3:
                    System.out.println("You have entered for viewing all the data");
                    arr.viewAllData();
                    break;
                case 4:
                    System.out.println("You have entered for modifying the data\n" +
                            "Press  enter the data to be modified and at which index to be mdified");

                    int r = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the data to be modified");
                    String info = scanner.next();
                    arr.modifyData(info, r);
                    break;
                case 5:
                    System.out.println("You have entered to search the data");
                    String information = scanner.next();
                    arr.searchingData(information);
                    break;
                case 6:
                    System.out.println("YOu have entered for exiting from the menu thank you");
                    yo = false;
                    break;
                default:
                    System.out.println("Invalid choice found");
            }
        }
    }
}