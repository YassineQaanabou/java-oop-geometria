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

   void disegna(int height, int base)
    {
        for (int i = 0; i < height; i++)
        {
            System.out.println();
            for (int j = 0; j < base; j++)
            {

                if (i == 0 || i == height-1 ||
                        j== 0 || j == base-1)
                    System.out.print("o");
                else
                    System.out.print(" ");
            }
        }
    }
}
