package com.company;

public class Circle {
    int x1, y1, x2, y2;
    public Circle( int a, int b, int c, int d){
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
    }
    public double sqrt(Circle a){
        double rad = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double sqrt;
        sqrt = rad * rad * 22 / 7;
        return sqrt;
    }
    public double length(Circle a){
        double rad = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double length;
        length = 2 * rad * 22 / 7;
        return length;
    }
    public static void Main(String[] args){
        Circle a = new Circle(0, 0, 2, 0);
        double l;
        l = a.length(a);
        System.out.println(a);

    }
}
