package Pertemuan1;

import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = input.nextDouble();

            double luas = Math.PI * Math.pow(r, 2);
            double keliling = 2 * Math.PI * r;

            System.out.printf("Luas lingkaran: %.2f satuan persegi\n", luas);
            System.out.printf("Keliling lingkaran: %.2f satuan\n", keliling);
        }
    }
}