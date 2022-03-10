package com.company;

import java.util.Arrays;

public class work4 {
    public static void main(String[] args) {
        int[] Array = {1, 5, 7, 0, 6};
        String ArrayString = Arrays.toString(Array);
        System.out.println(ArrayString);
        int[] Array2 = {0, 10, 3, 8, -1};
        String Array2String = Arrays.toString(Array2);
        System.out.println(Array2String);

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += Array[i];
            average2 += Array2[i];
        }
        average1/=5;
        average2/=5;

        if(average1 > average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") больше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else if(average1 < average2){
            System.out.println("Среднее арифметическое первого массива ("+average1+") меньше среднего арифметического "+
                    "второго массива ("+average2+")");
        } else {
            System.out.println("Средние арифметические массивов равны ("+average1+")");
        }
    }
}

