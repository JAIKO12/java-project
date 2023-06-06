package Pertemuan2.Pewarisan;


public class SpedaGunungBeraksi extends SpedaGunung {
    public SpedaGunungBeraksi(String merk, int kecepatan, int jumlahGear) {
        super(merk, kecepatan, jumlahGear);
    }

    public void meloncat() {
        System.out.println("Speda gunung " + this.getMerk() + " meloncat!");
    }

    public static void main(String[] args) {
        SpedaGunungBeraksi speda = new SpedaGunungBeraksi("Polygon", 30, 7);
        speda.info();
        speda.meloncat();
    }
}



