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
        learnArrays6();
        learnArrays7();
        learnArrays8();
        learnArrays9();
        learnArrays10();
        learnArrays11();

        learnArrays13();
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
            n1[i] = (int) (Math.random() * 6);
            n2[i] = (int) (Math.random() * 6);
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
    public static void learnArrays6(){
        /*
        6) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку.
        Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        */
        System.out.println("Массивы 6:");
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random()*90) + 10;
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        if (Arrays.equals(arr, arr2)) System.out.println("Массив является строго возрастающим");
        else System.out.println("Массив не является строго возрастающим");
    }
    public static void learnArrays7(){
        /*
        7) Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй
        члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
        */
        System.out.println("Массивы 7");
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < arr.length; i++) arr[i] = arr[i-2] + arr[i-1];
        System.out.println("Первые 20 чисел Фибоначчи равны: " + Arrays.toString(arr));
    }
    public static void learnArrays8(){
        /*
        8) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом
        массиве максимальным и сообщите индекс его последнего вхождения в массив.
        */
        System.out.println("Массивы 8");
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 31) - 15;
        System.out.println(Arrays.toString(arr));
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr2);
        int max = arr2[arr2.length-1];
        System.out.println("Максимальный элемент массива равен " + max + " и он стоит под индексом " + Arrays.binarySearch(arr, max));
    }
    public static void learnArrays9(){
        /*
        9) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
        Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
        к элементу из второго массива с i-ым индексом.
        Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
        */
        System.out.println("Массивы 9");
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        int n = 0; //задаем счетчик целых чисел
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 9 + 1);
            arr2[i] = (int) (Math.random() * 9 + 1);
            if (arr1[i] % arr2[i] == 0) n++;
        }
        double[] arr3 = new double[10];
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr3.length; i++) arr3[i] = (double) arr1[i] / arr2[i];
        System.out.println(Arrays.toString(arr3));
        System.out.println("В данном массиве " + n + " целых значений.");
    }
    public static void learnArrays10(){
        /*
        10) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
        Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        */
        System.out.println("Массивы 10");
        int[] arr = new int[11];
        int[] c = {0,0,0,0,0,0,0,0,0,0,0}; //в этом массиве будут считаться повторения каждого элемента
        for (int i = 0; i < arr.length; i++) arr[i] = (int) (Math.random() * 3) - 1;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            for (int n = 0; n < arr.length; n++)
                if (arr[i] == arr[n]) c[i] ++;
        }
        //создадим массив, который можем попортить для сортировки
        int[] b = Arrays.copyOf(c, c.length);
        Arrays.sort(b);
        if (b[10] != b[9]) {        //если в отсортированном массиве популярности два лидера разные по frequency
            int freq = b[10];
            int index;
            index = Arrays.binarySearch(c, freq);
            System.out.println("Элемент массива " + Arrays.toString(arr) + " под индексом " + index + " встречается чаще всего.");
        }
    }
    public static void learnArrays11(){
        /*
        11) Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
        указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа
        должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой,
        либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна
        требовать повторного ввода до тех пор, пока не будет указано корректное значение.
         */
        System.out.println("Массивы 11");
        int n;
        do {
            Scanner lar = new Scanner(System.in);
            System.out.print("Введите число (длину массива): ");
            n = lar.nextInt();
            if (n % 2 != 0) System.out.println("Введите четное число");
        } while (n % 2 != 0);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random()*11) - 5;
        System.out.println(Arrays.toString(arr));
        int sum1 = 0; //в эти переменные будем заносить суммы модулей
        int sum2 = 0;
        for (int i = 0; i < (n - 1); i++) sum1 = sum1 + Math.abs(arr[i]);
        for (int i = n / 2; i < n; i++) sum2 = sum2 + Math.abs(arr[i]);
        if (sum1 > sum2) System.out.println("Сумма модулей левой половины массива больше, чем правой");
        else if (sum1 < sum2) System.out.println("Сумма модулей правой половины массива больше, чем левой");
        else System.out.println("Суммы можулей левой и правой половин равны");
    }
    public static void learnArrays12(){
        /*
        12) Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы
        отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок следования элементов
        должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а
        потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
        Вывести полученный массив на экран.
         */
        int[] arr = new int[12];
        int n1 = 0;
        while (true) {
            for (int i = 0; i < (arr.length)/2; i++) {
                arr[i] = (int) (Math.random()*21) - 10;
                if (arr[i] == 0) i--;
            }
            for (int i = arr.length / 2 - 1; i < (arr.length - 1); i++) {
                arr[i] = (int) (Math.random()*21) - 10;
                if (arr[i] == 0) i--;
            }

            //проверяем количество отрицательных и положительных
            //пока не доделал. будет очень сложный для компьютера алгоритм

            else break;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void learnArrays13(){
        /*
        13) Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
        Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
         */
        System.out.println("Массивы 13");
        int n;
        do {
            Scanner lar = new Scanner(System.in);
            System.out.print("Введите число (длину массива): ");
            n = lar.nextInt();
            if (n <=3) System.out.println("Введите число больше 3");
        } while (n <= 3);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random()*(n+1)) + n;
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[n];
        int k = 0; //создаем счетчик четных чисел и индекс массива четных чисел
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[k] = arr[i];
                k++;
            }
        }
        int[] arr3 = Arrays.copyOf(arr2, k); //удаляем лишние 0
        System.out.println("Массив из четных чисел вышеуказанного массива: " + Arrays.toString(arr3));
    }
}
