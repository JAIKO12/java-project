package Pertemuan2.Pewarisan;


public class SpedaGunung extends Speda {
    private int jumlahGear;

    public SpedaGunung(String merk, int kecepatan, int jumlahGear) {
        super(merk, kecepatan);
        this.jumlahGear = jumlahGear;
    }

    public void setJumlahGear(int jumlahGear) {
        this.jumlahGear = jumlahGear;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void info() {
        super.info();
        System.out.println("Jumlah Gear: " + jumlahGear);
    }
}


