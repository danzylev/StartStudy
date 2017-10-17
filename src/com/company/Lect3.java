package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Lect3 {

    public static void main(String[] args){
        System.out.println("Занятие №3. Массивы.");
        learnArrays1();
        learnArrays2();
        learnArrays3();
        learnArrays4();
        learnArrays5();
    }

    public static void learnArrays1(){
        /*
        1) Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20
        */
        System.out.println("Массивы 1:");
        int[] newArray = new int[10];                               //можно было просто вручную задать все значения и длину
        int n = 2;
        for (int i = 0; i < newArray.length; i++){
            newArray[i] = n;
            n = n + 2;
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
        for (int i = 0; i < newArray.length; i++){
                newArray[i] = n;
                n = n + 2;
            }
        System.out.println(Arrays.toString(newArray));              //выводим массив в строку
        for (int i = 49; i >= 0; i--) System.out.print(newArray[i] + " ");   //выводим массив в столбец циклом, аналогично можно было и в строку
        System.out.println();
    }
    public static void learnArrays3(){
        /*
        3) Создайте массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран. Подсчитайте сколько
        в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        */
        System.out.println("Массивы 3:");
        int[] newArray = new int[15];
        for (int i = 0; i < newArray.length; i++)
            newArray[i] = (int) (Math.random() * 10);
        System.out.println(Arrays.toString(newArray));
        int n = 0;
        for (int i = 0; i <=14; i++) {
            if (newArray[i] % 2 == 0) n++;
        }
        System.out.println("В данном массиве " + n + " четных чисел."); //0 мы считаем четным. можно отдельно модулем проверки исключить.
    }
    public static void learnArrays4(){
        /*
        4) Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        */
        System.out.println("Массивы 4:");
        int[] newArray = new int[8];
            for (int i = 0; i < newArray.length; i++)
                newArray[i] = (int) (Math.random() * 10) + 1;
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < 7; i = i + 2) newArray[i] = 0; //мы индексы считаем от 0 до 7, а для пользователя отображаем с 1-го
        System.out.println(Arrays.toString(newArray));
    }
    public static void learnArrays5(){
        /*
        5) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух
        отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из
        массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        */
        System.out.println("Массивы 5:");
        int[] n1 = new int[5];
        int[] n2 = new int[5];
        for (int i = 0; i < n1.length; i++) {
            n1[i] = (int) (Math.random() * 5) + 1;
            n2[i] = (int) (Math.random() * 5) + 1;
        }
        System.out.println(Arrays.toString(n1));
        System.out.println(Arrays.toString(n2));
        int s1 = 0;
        int s2 = 0;
        for (int i = 0; i < n1.length; i++){
            s1 += n1[i];
            s2 += n2[i];
            }
        if (s1 == s2) System.out.println("Средние арифметические массивов равны!");
        else if (s1 > s2) System.out.println("Среднее арифметическое первого массива больше!");
        else System.out.println("Среднее арифметическое первого массива меньше!");

    }
}
