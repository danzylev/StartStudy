package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Lect3 {

    public static void main(String[] args){
        System.out.println("Занятие №3. Массивы.");
        learnArrays1();
        learnArrays2();

    }

    public static void learnArrays1(){
        /*
        1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
        */
        System.out.println("Массивы 1:");
        int[] newArray = new int[10];                               //можно было просто вручную задать все значения и длину
        int n = 0;
        for (int i = 2; i <= 20; i++)
            if (i % 2 == 0) {
            newArray[n] = i;
            n++;
            }
        System.out.println(Arrays.toString(newArray));              //выводим массив в строку
        for (n = 0; n < 10; n++) System.out.println(newArray[n]);   //выводим массив в столбец циклом, аналогично можно было и в строку
    }
    public static void learnArrays2(){
        /*
        2) Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку, а затем этот же массив
        выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
         */
        System.out.println("Массивы 2:");
        int[] newArray = new int[50];                               //можно было просто вручную задать все значения и длину
        int n = 0;
        for (int i = 1; i <= 99; i++)
            if (i % 2 != 0) {
                newArray[n] = i;
                n++;
            }
        System.out.println(Arrays.toString(newArray));              //выводим массив в строку
        for (n = 49; n >= 0; n--) System.out.print(newArray[n] + " ");   //выводим массив в столбец циклом, аналогично можно было и в строку
    }
}
