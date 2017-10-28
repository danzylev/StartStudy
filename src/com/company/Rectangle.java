package com.company;

public class Rectangle extends Shape{
    //будем задавать по двум точкам: левая нижняя и правая верхняя
    int x1, y1, x2, y2;
    public Rectangle(int x1,int y1,int x2,int y2){
        super(x1, y1, x2, y2);
    }
    @Override
    public double space (Shape i){
        //для проямоугольника
        int h = i.y2 - i.y1;
        int l = i.x2 - i.x1;
        return h*l;
    }
    @Override
    public double perim (Shape i){
        int h = i.y2 - i.y1;
        int l = i.x2 - i.x1;
        return 2*h+2*l;
    }
}
