
//      MEMBUAT SCANNER UNTUK MEMBUAT NILAI MAHASISWA
import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int jumlahNilai = 0;
            int nilai;
            int counter = 0;

            System.out.print("Masukkan jumlah nilai mahasiswa: ");
            int jumlahMahasiswa = input.nextInt();

            while (counter < jumlahMahasiswa) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (counter + 1) + ": ");
                nilai = input.nextInt();
                jumlahNilai += nilai;
                counter++;
            }

            double rataRata = (double) jumlahNilai / jumlahMahasiswa;
            System.out.println("Nilai rata-rata mahasiswa adalah " + rataRata);
        }
    }
}
