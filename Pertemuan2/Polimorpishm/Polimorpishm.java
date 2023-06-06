package Pertemuan2.Polimorpishm;

public class Polimorpishm {

    class Hewan {
        public void suara() {
            System.out.println("Hewan suara");
        }
    }

    class Kucing extends Hewan {
        @Override
        public void suara() {
            System.out.println("Meong");
        }
    }

    class Anjing extends Hewan {
        @Override
        public void suara() {
            System.out.println("Guk Guk");
        }
    }

    class Ayam extends Hewan {
        @Override
        public void suara() {
            System.out.println("Kukuruyuk");
        }
    }

    class Buaya extends Hewan {
        @Override
        public void suara() {
            System.out.println("Kamu Kenapa ? sini cerita.");
        }
    }

    public static void main(String[] args) {
        Polimorpishm polimorpishm = new Polimorpishm();
        Hewan hewan = polimorpishm.new Hewan();
        Kucing kucing = polimorpishm.new Kucing();
        Anjing anjing = polimorpishm.new Anjing();
        Ayam ayam = polimorpishm.new Ayam();
        Buaya buaya = polimorpishm.new Buaya();

        hewan.suara();
        kucing.suara();
        anjing.suara();
        ayam.suara();
        buaya.suara();
    }
}
