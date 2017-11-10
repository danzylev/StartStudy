package com.company.collections.iShop;


import java.util.ArrayList;
import java.util.List;

public class Main extends ArrayList {
    @Override
    public Object get(int index) {
        try {
            return super.get(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR!!!");
            return 0;
        }
    }

    public static void main (String[] args){
        List list = new ArrayList(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        System.out.println(list.toString() + list.size());
        try {
            System.out.println(list.get(9).toString());
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!!!" + e.toString());
        }


        }
    }
