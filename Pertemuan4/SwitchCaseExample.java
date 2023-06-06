package Pertemuan4;

import java.util.Scanner;

public class SwitchCaseExample {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nomor hari dalam seminggu (1-7): ");
            int nomorHari = input.nextInt();

            switch (nomorHari) {
                case 1:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Minggu");
                    break;
                case 2:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Senin");
                    break;
                case 3:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Selasa");
                    break;
                case 4:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Rabu");
                    break;
                case 5:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Kamis");
                    break;
                case 6:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Jumat");
                    break;
                case 7:
                    System.out.println("Hari ke-" + nomorHari + " adalah hari Sabtu");
                    break;
                default:
                    System.out.println("Nomor hari yang dimasukkan tidak valid.");
            }
        }
    }
}
