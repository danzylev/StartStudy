package com.company;

public class Accumulator {
    int value;
    Operation oper;
    public Accumulator (int a, Operation o){
        this.value = a;
        this.oper = o;
    }
    public void accumulate(int i){
        value = oper.doOperation(value, i);
    }
    public int getValue(){
        return value;
    }

    public static void main(String[] args){
        Operation a = new Multiply();
        Accumulator acc = new Accumulator(5, a);
        acc.accumulate(5);
        System.out.println(acc.getValue());

    }

}
