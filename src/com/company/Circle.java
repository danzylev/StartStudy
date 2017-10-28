package com.company;

public class Circle extends Shape{
    int x1, y1, x2, y2;

    public Circle( int a, int b, int c, int d){
        super(a, b, c, d);
    }
    @Override
    public double space(Shape a){
        double rad = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double sqrt;
        sqrt = rad * rad * 22 / 7;
        return sqrt;
    }
    @Override
    public double perim(Shape a){
        double rad = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double length;
        length = 2 * rad * 22 / 7;
        return length;
    }
    public static void main(String[] args){
        Shape a = new Rectangle(1,1,5,5);
        double x = a.perim(a);
        System.out.println(x);
    }
}
