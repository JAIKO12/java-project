package Pertemuan4;

import java.util.Scanner;

public class IfelseExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Masukkan total belanja: ");
            int totalBelanja = sc.nextInt();

            if (totalBelanja >= 500000) {
                System.out.println("Selamat, anda mendapatkan diskon 20%!");
                int totalBayar = (int) (totalBelanja * 0.8);
                System.out.println("Total yang harus dibayar: " + totalBayar);
            } else if (totalBelanja >= 250000) {
                System.out.println("Selamat, anda mendapatkan diskon 10%!");
                int totalBayar = (int) (totalBelanja * 0.9);
                System.out.println("Total yang harus dibayar: " + totalBayar);
            } else {
                System.out.println("Maaf, anda tidak mendapatkan diskon.");
                System.out.println("Total yang harus dibayar: " + totalBelanja);
            }
        }
    }
}
