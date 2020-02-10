package GCFL.Question1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int[] arr = new int[l];
        int sum = 1;
        int p = 0;
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                sum = sum * arr[j];
            }
            p = sum / arr[i];
            System.out.print(p + " ");
            sum = 1;
        }

    }
}