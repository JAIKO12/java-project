package Pertemuan6;

import java.util.Scanner;

public class HitungHonorKaryawanKontrak {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String namaKaryawan;
            int golongan, jamKerja;
            double honorTetap = 300000, tunjanganJabatan = 0, tunjanganPendidikan = 0, honorLembur = 0;

            // Input data karyawan
            System.out.print("Nama Karyawan : ");
            namaKaryawan = input.nextLine();
            System.out.print("Golongan : ");
            golongan = input.nextInt();
            System.out.print("Pendidikan (SMU/D3/S1) : ");
            String pendidikan = input.next();
            System.out.print("Jumlah Jam Kerja : ");
            jamKerja = input.nextInt();

            // Hitung tunjangan jabatan
            switch (golongan) {
                case 1:
                    tunjanganJabatan = 0.05 * honorTetap;
                    break;
                case 2:
                    tunjanganJabatan = 0.1 * honorTetap;
                    break;
                case 3:
                    tunjanganJabatan = 0.15 * honorTetap;
                    break;
                default:
                    System.out.println("Golongan yang dimasukkan salah.");
                    System.exit(0);
            }

            // Hitung tunjangan pendidikan
            switch (pendidikan.toUpperCase()) {
                case "SMU":
                    tunjanganPendidikan = 0.025 * honorTetap;
                    break;
                case "D3":
                    tunjanganPendidikan = 0.05 * honorTetap;
                    break;
                case "S1":
                    tunjanganPendidikan = 0.075 * honorTetap;
                    break;
                default:
                    System.out.println("Pendidikan yang dimasukkan salah.");
                    System.exit(0);
            }

            // Hitung honor lembur
            if (jamKerja > 8) {
                honorLembur = (jamKerja - 8) * 2500;
            }

            // Hitung total honor yang diterima
            double totalHonor = honorTetap + tunjanganJabatan + tunjanganPendidikan + honorLembur;

            // Output hasil perhitungan
            System.out.println("========================");
            System.out.println("Karyawan yang bernama : " + namaKaryawan);
            System.out.println("Honor Tetap Rp. " + honorTetap);
            System.out.println("Tunjangan Jabatan Rp. " + tunjanganJabatan);
            System.out.println("Tunjangan Pendidikan Rp. " + tunjanganPendidikan);
            System.out.println("Honor Lembur Rp. " + honorLembur);
            System.out.println("========================");
            System.out.println("Honor yang diterima     : Rp. " + totalHonor);
        }

    }

}
