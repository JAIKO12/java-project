package Pertemuan4;

import java.util.Scanner;

public class IfExample {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Masukkan jumlah ayam yang ingin dibeli: ");
      int jumlahAyam = scanner.nextInt();
      int hargaAyam = 10000; // harga per potong ayam
      int totalHarga = jumlahAyam * hargaAyam;

      if (jumlahAyam > 10) {
        double diskon = 0.1 * totalHarga;
        totalHarga -= diskon;
        System.out.println("Anda mendapat diskon sebesar 10%!");
      }

      System.out.println("Anda harus membayar sebesar " + totalHarga + " rupiah.");
    }
  }
}