import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Nilai Absen: ");
            double absen = input.nextDouble();

            System.out.print("Masukkan Nilai Tugas: ");
            double tugas = input.nextDouble();

            System.out.print("Masukkan Nilai UTS: ");
            double uts = input.nextDouble();

            System.out.print("Masukkan Nilai UAS: ");
            double uas = input.nextDouble();

            // Hitung nilai rata-rata
            double rata = (0.1 * absen) + (0.2 * tugas) + (0.3 * uts) + (0.4 * uas);

            System.out.println("PROGRAM NILAI MAHASISWA");
            System.out.println("======================");
            System.out.println("NIM             : " + nim);
            System.out.println("Nama            : " + nama);
            System.out.println("Nilai Absen     : " + absen);
            System.out.println("Nilai Tugas     : " + tugas);
            System.out.println("Nilai UTS       : " + uts);
            System.out.println("Nilai UAS       : " + uas);
            System.out.println("======================");
            System.out.println("Nilai Rata-rata : " + rata);
        }
    }
}
