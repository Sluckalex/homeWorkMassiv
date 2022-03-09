package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class work33 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int j = in.nextInt();
        int[] Array = new int[j];
        double result = 0;
        int max = 0;
        for (int i = 0; i < Array.length; i++){
            // рандом
            Array[i] = (int) (Math.random() * 1000);
            // каждый элемент для просмотра
            System.out.println(Array[i]);
            // вычисляю среднее
            result = Array[i] + result;
        }
        // большее и меньшее
        System.out.println("Максимально значение в массиве " + Arrays.stream(Array).max());
        System.out.println("Минимальное значение в массиве " + Arrays.stream(Array).min());
        // среднее значение
        System.out.println("Среднее значение в массиве " + result / Array.length);

    }
}

