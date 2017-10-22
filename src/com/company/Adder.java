package com.company;

public class Adder {
    int i;
    int step;
    public Adder (int step){

        this.step = step;
        i = 0;
    }

    public void add(){
        this.i += step;
    }
    public int getValue(){
        return i;
    }
    public int getStep() { return step;}

    public static void main(String[] args){
        Adder a = new Adder(10);
        a.add();
        a.add();

        System.out.println("Выводим на экран объект класса Adder = " + a.getValue() + " с заявленным шагом " + a.getStep());

    }
}
