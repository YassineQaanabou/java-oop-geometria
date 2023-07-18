package org.lessons.java.geometria;

public class Rettangolo {
    int base;
    int height;
    Rettangolo(int base, int height) {
        this.base=base;
        this.height=height;
    }

    int getPerimeter() {

        return (base + height) * 2;
    }

    int getSurface(){

        return base*height;
    }

}
