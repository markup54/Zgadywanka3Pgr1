package com.klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Javie");
        int wylosowana = (int) (Math.random() * 100 + 1);
        //System.out.println("Wylosowano "+wylosowana);
        //zgaduj tak długo aż zgadniesz

        Scanner klawiatura = new Scanner(System.in);
        int wczytana;
        boolean czyWygrana = false;
        while(!czyWygrana)
        {
            System.out.println("podaj liczbę");
            wczytana = klawiatura.nextInt();
            if (wczytana == wylosowana) {
                System.out.println("gratulacje liczba znaleziona");
                czyWygrana = true;
                break;
            }
            if (wczytana < wylosowana) {
                System.out.println("Wpisz więcej");
            } else {
                System.out.println("Wpisz mniej");
            }
        }

    }
}
