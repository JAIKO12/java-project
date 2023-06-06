package Pertemuan6;

import java.util.Scanner;

public class PenggajianKaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\t\tPT. DINGIN DAMAI");

            System.out.println("======================================================");
            System.out.println("\tProgram Hitung Honor Karyawan Kontrak");
            System.out.println("======================================================");

            // Input data karyawan
            System.out.print("Nama Karyawan : ");
            String nama = input.nextLine();

            System.out.print("Golongan (I/II/III) : ");
            String golongan = input.nextLine();

            System.out.print("Pendidikan (SMU/D3/S1) : ");
            String pendidikan = input.nextLine();

            System.out.print("Jumlah Jam Kerja : ");
            int jamKerja = input.nextInt();

            // Hitung honor tetap
            int honorTetap = 300000;

            // Hitung tunjangan jabatan
            double tunjanganJabatan = 0.0;
            if (golongan.equalsIgnoreCase("I")) {
                tunjanganJabatan = 0.05 * honorTetap;
            } else if (golongan.equalsIgnoreCase("II")) {
                tunjanganJabatan = 0.1 * honorTetap;
            } else if (golongan.equalsIgnoreCase("III")) {
                tunjanganJabatan = 0.15 * honorTetap;
            }

            // Hitung tunjangan pendidikan
            double tunjanganPendidikan = 0.0;
            if (pendidikan.equalsIgnoreCase("SMU")) {
                tunjanganPendidikan = 0.025 * honorTetap;
            } else if (pendidikan.equalsIgnoreCase("D3")) {
                tunjanganPendidikan = 0.05 * honorTetap;
            } else if (pendidikan.equalsIgnoreCase("S1")) {
                tunjanganPendidikan = 0.075 * honorTetap;
            }

            // Hitung honor lembur
            int honorLembur = 0;
            if (jamKerja > 8) {
                int jamLembur = jamKerja - 8;
                honorLembur = jamLembur * 2500;
            }

            // Hitung total honor
            int totalHonor = honorTetap + (int) tunjanganJabatan + (int) tunjanganPendidikan + honorLembur;

            // Output hasil
            System.out.println("==============================================");
            System.out.println("Karyawan yang bernama   : " + nama);
            System.out.println("Honor yang diterima     : Rp. " + totalHonor);
            System.out.println("Honor Tetap             : Rp. " + honorTetap);
            System.out.println("Tunjangan Jabatan       : Rp. " + (int) tunjanganJabatan);
            System.out.println("Tunjangan Pendidikan    : Rp. " + (int) tunjanganPendidikan);
            System.out.println("Honor Lembur            : Rp. " + honorLembur);
            System.out.println("==============================================");
            System.out.println("Honor yang diterima     : Rp. " + totalHonor);
        }
    }
}
