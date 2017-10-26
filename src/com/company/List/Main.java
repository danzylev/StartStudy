package com.company.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Item head = new Item();
        IntList list = new IntList(head);
        int i = 0;
        for (i = 1; i < 5; i++) list.add(i);

        int n;
        System.out.println("OK");
        for (i = 1; i < 5; i++){
            n = list.get(i);
            System.out.println(n);
        }
    }
}

