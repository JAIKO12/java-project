package Pertemuan1;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan alamat: ");
            String alamat = scanner.nextLine();

            System.out.print("Masukkan usia: ");
            int usia = scanner.nextInt();

            System.out.print("Masukkan nomor telepon: ");
            String noTelp = scanner.next();

            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Alamat: " + alamat);
            System.out.println("Usia: " + usia + " tahun");
            System.out.println("No. Telepon: " + noTelp);
        }
    }
}

