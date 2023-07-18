package org.lessons.java.geometria;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci l'altezza del rettangolo");
        int heightInput= scan.nextInt();

        System.out.println("inserisci la base del rettangolo");
        int baseInput= scan.nextInt();

        Rettangolo rettangolo= new Rettangolo(baseInput, heightInput);

        System.out.println("il perimetro del reattangolo è " + rettangolo.getPerimeter());
        System.out.println("l'area del reattangolo è " + rettangolo.getSurface());
        rettangolo.disegna(heightInput,baseInput);

        scan.close();
    }
}
