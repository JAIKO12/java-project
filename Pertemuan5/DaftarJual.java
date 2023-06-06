package Pertemuan5;

import java.util.Scanner;

public class DaftarJual {
    public static void main(String[] args) {
        int i, j;
        int[][] data_jual;
        data_jual = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print("Masukkan data jual ke-" + i + ", " + j + ": ");
                data_jual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Data yang dimasukkan adalah: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(data_jual[i][j] + " ");
            }
            System.out.println();
        }
    }
}
