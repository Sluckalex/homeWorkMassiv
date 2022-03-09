package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class work1 {
    public static void main(String[] args) {
        int[] array = {0, 1, 4, 7, -1};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int n = Arrays.binarySearch(array, key);
        System.out.println(array[n] == key);
    }
}
