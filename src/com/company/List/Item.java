package com.company.List;

public class Item {
    public Object value;
    public Item next;

    public Item(){}

    public Item(Object value){
        this.value = value;
    }

    public Item(Object value, Item item){
        this.value = value;
        this.next = item;
    }
}

