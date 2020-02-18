package GCFL.Question2;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = scanner.nextInt();
        System.out.println("enter number of columns");
        int columns = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1) {
                    System.out.print("1");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
