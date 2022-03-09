package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args){
        int[] array = {3,1,6,5,2,8,4};
        int count = 0;
        int size= 0;
        int value;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        value = scan.nextInt();

        for (int i = 0; i < args.length; i++) {
            if (array[i] == value) {
                count++;
            }
        }
if (count == 0) {
    System.out.println("Такого числа нет в массиве");
    }
for (int i = 0; i <array.length; i++){
    if (array[i] == value) {
        array[i] = array[i++];
    } else {
        size++;
    }
}
int[] array2 = new int[size];
for (int i = 0, j = 0; i < array2.length;i++, j++) {
    if (array[i] == value) {
        array2[i] = array[j++];
    }
    array2[i] = array[j];
}
        System.out.println(Arrays.toString(array2));
    }

}

