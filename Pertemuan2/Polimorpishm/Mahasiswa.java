package Pertemuan2.Polimorpishm;

public class Mahasiswa {

    public class TugasMahasiswa {
        public void Mahasiswa() {
            System.out.println("Tugas Mahasiswa Adalah :");
        }
    }

    class Belajar {
        public void Mahasiswa() {
            System.out.println("1. Belajar");
        }
    }

    class MengerjakanTugas extends Belajar {
        @Override
        public void Mahasiswa() {
            System.out.println("2. Mengerjakan Tugas");
        }
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        TugasMahasiswa tugasMahasiswa = mahasiswa.new TugasMahasiswa();
        Belajar belajar = mahasiswa.new Belajar();
        MengerjakanTugas mengerjakanTugas = mahasiswa.new MengerjakanTugas();

        tugasMahasiswa.Mahasiswa();
        belajar.Mahasiswa();
        mengerjakanTugas.Mahasiswa();
    }
}
