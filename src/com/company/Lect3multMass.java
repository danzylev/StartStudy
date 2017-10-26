package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lect3multMass {

    public static void main(String[] args) {
        System.out.println("Занятие №3. Многомерные массивы.");
        learnArrays2_1();
        learnArrays2_2();
        learnArrays2_3();
        learnArrays2_4();
    }

    public static void learnArrays2_1() {
        /*
        1) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.
        */
        System.out.println("Многомерные массивы 1:");
        int[][] newArr = new int[5][8];
        for (int i = 0; i < 5; i++) {        //заполняем по столбцам
            for (int k = 0; k < 8; k++)
                newArr[i][k] = (int) (Math.random() * 90) + 10;
        }
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 5; k++) System.out.print(newArr[k][i] + " ");
            System.out.println();
        }
    }

    public static void learnArrays2_2() {
        /*2) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
        Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива
        (его индекс не имеет значения).
         */
        System.out.println("Многомерные массивы 2:");
        int arr[][] = new int[5][8];
        //заполняем по строкам
        for (int i = 0; i < 5; i++)
            for (int k = 0; k < 8; k++) {
                arr[i][k] = (int) (Math.random() * 199) - 99;
            }
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 8; k++) {
                System.out.print(arr[i][k] + " ");
            }
            System.out.println();
        }
        int max = arr[0][0]; //сохраняем значение самого первого элемента и с ним будем сравнивать
        for (int i = 0; i < 5; i++)
            for (int k = 0; k < 8; k++){
            if (arr[i][k] > max) max = arr[i][k];
            }
        System.out.println("Максимальное значение массива: " + max);
    }
    public static void learnArrays2_3(){
        /*
        3) Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5].
        Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов.
        Если таких строк несколько, то вывести индекс первой встретившейся из них.
         */
        int arr[][] = new int[7][4];
        for (int i = 0; i < 7; i++)
            for (int k = 0; k < 4; k++){
            arr[i][k] = (int) (Math.random()*11) - 5;
            }
        int abs[] = {1,1,1,1,1,1,1};
        for (int i = 0; i < 7; i++)
            for (int k = 0; k < 4; k++)
                abs[i] = abs[i] * Math.abs(arr[i][k]);
        System.out.println(Arrays.toString(abs));
        int max = abs[0];
        for (int i = 0; i < 7; i++)
            if (abs[i] >= max) max = abs[i];
        for (int i = 0; i < 7; i++)
            if (abs[i] == max) {
                System.out.println("Индекс строки с максимальным произведением модулей равен = " + i);
                break;
        }
    }
    public static void learnArrays2_4() {
        /*
        4) Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9].
        Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её
        наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной
        строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку,
        а можно отсортировать по убыванию каждую строку). Вывести преобразованный массив на экран.
         */
        int[][] arr = new int[6][7];
        for (int i = 0; i < 6; i++)
            for (int k = 0; k < 7; k++)
                arr[i][k] = (int) (Math.random() * 10);
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 7; k++)
                System.out.print(arr[i][k] + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++)
            for (int k = 1; k < 7; k++)
                if (arr[i][k] > arr[i][0]) {
            int a = arr[i][0];
            arr[i][0] = arr[i][k];
            arr[i][k] = a;
                }
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 7; k++)
                System.out.print(arr[i][k] + " ");
            System.out.println();
        }
    }
    public static void learnArrays2_5(){
        /*
        5) Для проверки остаточных знаний учеников после летних каникул, учитель младших классов решил начинать каждый
        урок с того, чтобы задавать каждому ученику пример из таблицы умножения, но в классе 15 человек, а примеры среди
        них не должны повторяться. В помощь учителю напишите программу, которая будет выводить на экран 15 случайных примеров
        из таблицы умножения (от 2*2 до 9*9, потому что задания по умножению на 1 и на 10 — слишком просты).
        При этом среди 15 примеров не должно быть повторяющихся (примеры 2*3 и 3*2 и им подобные пары считать повторяющимися).
         */
 /*       int arr[][] = new int[8][8];
        int tab[][] = new int[15][2];
        for (int i = 0; i < 8; i++)
            for (int k = 0; k < 8; k++) {
                arr[i][k] = k+1;
                //tab[i][k] =
            }


        for (int i = 0; i < 8; i++)
            for (int k = 0; k < 8; k++)
        System.out.println(arr[i][k]);
    }
    */
}




/*
    public static void crypt(String text, String key){
        byte[] textBytes = text.getBytes();
        byte[] keyBytes = key.getBytes();
        int k = keyBytes.length;
        for (int i = 0; i < textBytes.length; i++){
            int i2 = 0;
            for (i2 = 0; i2 < k; i2++)
            textBytes[i] ^= keyBytes[i];
            if (i2 == (k-1)) i2 = i2 - k;
            return new String(textBytes);
        }
        System.out.println(textBytes);

     }
     */
