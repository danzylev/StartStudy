package com.company.List;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Item head = new Item();
        LinkedList list = new LinkedList(head);
        int i = 0;
        for (i = 1; i < 5; i++) list.add(i);

        Object n;
        System.out.println("OK");
        for (i = 0; i < 4; i++){
            n = list.get(i);
            System.out.println(n);
        }
        list.remove(1);
        for (i = 0; i < 4; i++){
            n = list.get(i);
            System.out.println(n);
        }
    }
}

