package Pertemuan1;

import java.util.Scanner;

public class Segitiga {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double alas, tinggi, luas;
            
            System.out.print("Masukkan alas segitiga: ");
            alas = input.nextDouble();
            
            System.out.print("Masukkan tinggi segitiga: ");
            tinggi = input.nextDouble();
            
            luas = 0.5 * alas * tinggi;
            
            System.out.println("============================");
            System.out.println("Luas segitiga adalah " + luas);
            System.out.println("============================");

        }
    }
}

