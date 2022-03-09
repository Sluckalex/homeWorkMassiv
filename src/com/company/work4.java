package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        int[] Array = new int[2];
        int[] Array2 = new int[2];

        double result = 0;
        double result2 = 0;
        for (int i = 1; i < Array.length; i++) {
            System.out.println(Array[i]);
            // рандом
            Array[i] = (int) (Math.random() * 1000);
            // каждый элемент для просмотра
            System.out.println(Array[i]);
            // вычисляю среднее
            result = Array[i] + result;
        }
        for (int j = 0; j < Array2.length; j++) {
            System.out.println(Array2[j]);
            // рандом
            Array2[j] = (int) (Math.random() * 1000);
            // каждый элемент для просмотра
            System.out.println(Array2[j]);
            // вычисляю среднее
            result2 = Array2[j] + result2;
        }
        // большее и меньшее
        System.out.println("Максимально значение в массиве " + Arrays.stream(Array).max());
        System.out.println("Минимальное значение в массиве " + Arrays.stream(Array).min());
        // среднее значение
        System.out.println("Среднее значение в массиве " + result / Array.length);

    }
}
