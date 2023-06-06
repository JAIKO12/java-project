package Pertemuan5;

import java.util.Scanner;

public class PenjualanBarang {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input Nama Petugas dan Tanggal
            System.out.print("Masukkan Nama Petugas: ");
            String namaPetugas = input.nextLine();
            System.out.print("Masukkan Tanggal: ");
            String tanggal = input.nextLine();

            // Input Jumlah Data
            System.out.print("Masukkan Jumlah Data yang akan Dimasukkan: ");
            int jumlahData = input.nextInt();

            // Inisialisasi Array
            String[] kodeBarang = new String[jumlahData];
            int[] jumlahBarang = new int[jumlahData];
            int[] hargaBarang = new int[jumlahData];

            // Input Data
            for (int i = 0; i < jumlahData; i++) {
                System.out.print("Masukkan Kode Barang ke-" + (i + 1) + ": ");
                kodeBarang[i] = input.next();

                switch (kodeBarang[i]) {
                    case "P001":
                        hargaBarang[i] = 700000;
                        break;
                    case "V001":
                        hargaBarang[i] = 75000;
                        break;
                    case "M001":
                        hargaBarang[i] = 950000;
                        break;
                    default:
                        hargaBarang[i] = 0;
                        break;
                }

                System.out.print("Masukkan Jumlah Barang ke-" + (i + 1) + ": ");
                jumlahBarang[i] = input.nextInt();
            }

            // Hitung Total Pendapatan
            int totalPendapatan = 0;
            for (int i = 0; i < jumlahData; i++) {
                totalPendapatan += hargaBarang[i] * jumlahBarang[i];
            }

            // Output Data
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("\t\t\t\tPT. PERMATA PRATAMA");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Nama Petugas    : " + namaPetugas);
            System.out.println("Tanggal         : " + tanggal);
            System.out.println("Jumlah Data     : " + jumlahData);
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("Kode Barang\tNama Barang\tHarga Barang\tJumlah Barang\tTotal Harga");
            for (int i = 0; i < jumlahData; i++) {
                String namaBarang = "";
                switch (kodeBarang[i]) {
                    case "P001":
                        namaBarang = "Printer";
                        break;
                    case "V001":
                        namaBarang = "VGA Card";
                        break;
                    case "M001":
                        namaBarang = "Motherboard";
                        break;
                    default:
                        namaBarang = "-";
                        break;
                }
                System.out
                        .println(kodeBarang[i] + "\t\t" + namaBarang + "\t\t" + hargaBarang[i] + "\t\t"
                                + jumlahBarang[i] + "\t\t" + hargaBarang[i] * jumlahBarang[i]);
            }
            System.out
                    .println("\nTotal Pendapatan Pada Tanggal: " + tanggal + "\tAdalah Sebesar : Rp."
                            + totalPendapatan);
            System.out.println("-----------------------------------------------------------------------------");

        }
    }
}
