package com.company;

import java.util.Scanner;

public class IntList {

    Item head;
    int numObjects = 0;

    public IntList(Item x) {
        this.head = x;
    }

    public Item add(int j) {
        Item i = new Item();
        i.next = null;
        i.value = j;
        if (head.next == null) head.next = i;
        else {
            Item newNext = head.next;
            Item lastIt = head;
            do {
                newNext = lastIt.next;
            } while (newNext != null);
            lastIt.next = i;
        }
        return i;
    }

    public Item get(int value) {
        int k = value;
        if (head.value == k) return head;
        else {
            Item newNext = head.next;
            Item lastIn = head;
            do {
                lastIn = newNext;
                if (lastIn.value == k) return lastIn;
                }while (lastIn.next != null);
        }
        return null;
    }

    public static void main(String[] args){
        Item head = new Item();
        IntList newList = new IntList(head);
        Scanner input = new Scanner(System.in);
        System.out.println("Введите содержание начального объекта: ");
        int val = input.nextInt();
        head.value = val;
        head.next = null;
        System.out.println(head.value + " " + head.next);
        Item newitem = new Item();
        System.out.println("Введите содержание нового объекта: ");
        val = input.nextInt();
        newitem = newList.add(val);
        System.out.println(newitem.value + " " + newitem.next + " при этом nextitem head = " + head.next);
    }
}
