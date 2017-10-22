package com.company;

public class Item {
    int value;
    Item next;

    public void Item(int value){
        this.value = value;
        next = null;
    }

    public void Item() {
        value = 0;
        next = null;
    }

}
