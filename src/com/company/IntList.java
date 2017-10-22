package com.company;

import java.util.Scanner;

public class IntList {

    Item head;

    public IntList(Item x) {
        head = x;
    }

    public void add(int j) {
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
    }

    public Item get(int value) {
        int k = value;
        Item lastIt;
        if (head.value == k) return head;
        else {
            Item newNext = head.next;
            lastIt = head;
            do {
                if (lastIt.value == k) return lastIt;
                lastIt = newNext;
                } while (lastIt.next != null);
        }
        return lastIt;
    }
    public void remove(int value){
        int k = value;
        Item lastIt;
        if (head.value == k) head = head.next;
        Item newNext = head.next;
        lastIt = newNext;
        if (newNext.value == k) {
            head = newNext.next;
        } else {
            do {
                if (newNext.value == k) lastIt.next = newNext.next;
                lastIt = newNext;
            } while (lastIt.next != null);
        }

    }

    public static void main(String[] args){
        Item head = new Item();
        IntList newList = new IntList(head);

        Scanner input = new Scanner(System.in);
        System.out.println("Введите содержание начального объекта: ");
        int val = input.nextInt();
        head.value = val;
        head.next = null;
        System.out.println("Значение заголовка " + head.value + " " + head.next);
        Item newItem = new Item();
        input = new Scanner(System.in);
        System.out.println("Введите содержание нового объекта: ");
        val = input.nextInt();
        newItem.value = val;
        newItem.next = null;
        newList.add(val);
        System.out.println(newItem.value + " " + newItem.next + " при этом next head = " + head.next);
        Item l = new Item();
        l = newList.get(val);
        System.out.println(l.value);

    }
}
