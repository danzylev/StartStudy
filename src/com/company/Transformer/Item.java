package com.company.Transformer;

public class Item {
    int value;
    Item next;

    public void Item(int value){
        this.value = value;
        this.next = null;
    }

    public void Item() {
        this.value = 0;
        this.next = null;
    }

}
