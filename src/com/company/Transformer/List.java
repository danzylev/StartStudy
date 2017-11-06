package com.company.Transformer;

public class List {

    Item head;

    public List(Item x) {
        head = x;
    }
    public List(){
    }

    public void add(int j) {
        //добавляем в конец списка
        Item i = new Item();
        i.next = null;
        i.value = j;
        //теперь осталось куда-то запихнуть
        if (head.next == null) head.next = i;
        else {
            Item newNext = head.next;
            Item lastIt = head;
            while (newNext != null) {
                lastIt = lastIt.next;
                newNext = lastIt.next;
            }
            lastIt.next = i;
        }
    }

    public int get(int value) {
        //ищем элемент по его значению
        int k = value;
        Item lastIt;
        if (head.value == k) return head.value;
        else {
            Item newNext = head.next;
            lastIt = head;
            do {
                if (lastIt.value == k) return lastIt.value;
                lastIt = newNext;
                newNext = lastIt.next;
            } while (lastIt.next != null);
        }
        return lastIt.value;
    }

    public void remove(int value) {
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
}
