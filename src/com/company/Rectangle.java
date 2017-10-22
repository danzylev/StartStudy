package com.company;

public class Rectangle {
    //будем задавать по двум точкам: левая нижняя и правая верхняя
    int x1, y1, x2, y2;
    public Rectangle(int a, int b, int c, int d) {
        if (a >= 0 & b >= 0 & c >= 0 & d >= 0) {
            x1 = a;
            y1 = b;
            x2 = c;
            y2 = d;
        } else System.out.println("Задайте координаты > 0");
    }
    public int spaceRect (Rectangle i){
        int h = i.y2 - i.y1;
        int l = i.x2 - i.x1;
        return h*l;
    }
    public int perimetr (Rectangle i){
        int h = i.y2 - i.y1;
        int l = i.x2 - i.x1;
        return 2*h+2*l;
    }
}
