package com.company.List;

public class LinkedList {
    public Item head;
    public int length;

    public LinkedList(){
    }

    public LinkedList(Object value){
        this.head = new Item(value);
    }

    public void add(Object value, int index){
        if (this.length == 0){
            this.head = new Item(value);
            this.length++;
        }
        else
        if ((index < 0) || (index > this.length))
            System.out.println("Index is not exist");
        else {
            if (index == 0) {
                this.head = new Item(value, this.head);
                this.length++;
            }
            else {
                Item x = this.head;
                for (int i = 0; i < index - 1; ++i){
                    x = x.next;
                }
                x.next = new Item(value, x.next);
                this.length++;
            }
        }
    }

    public void add(Object value){
        this.add(value, this.length);
    }

    public Object get(int index){
        Item x;
        if ((index >= this.length) || (index < 0)){
            System.out.println("Index is not exist");
            return null;
        }
        x = this.head;
        for (int i = 0; i < index; ++i){
            x = x.next;
        }
        return x.value;
    }

    public Object remove(int index){
        Item x1, x2;
        if (this.length == 0){
            System.out.println("List is empty");
            return null;
        }
        if ((index >= this.length ) || (index < 0)){
            System.out.println("Index is not exist");
            return null;
        }
        if (index == 0){
            x1 = this.head;
            this.head = this.head.next;
            this.length--;
            return x1.value;
        }
        if (index == this.length - 1){
            x1 = this.head;
            for (int i = 0; i < this.length -1; ++i){
                x1 = x1.next;
            }
            x2 = x1.next;
            x1.next = null;
            this.length--;
            return x2.value;
        }
        x1 = this.head;
        for (int i = 0; i < index - 1; ++i){
            x1 = x1.next;
        }
        x2 = x1.next;
        x1.next = x1.next.next;
        this.length--;
        return x2.value;
    }

    public void print(){
        Item x1;
        if (this.length == 0 )
            System.out.println("List is empty");
        else {
            x1 = this.head;
            for (int i = 0; i < this.length; ++i){
                System.out.println(x1.value);
                x1 = x1.next;
            }
        }
    }
}