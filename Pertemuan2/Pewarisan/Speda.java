package Pertemuan2.Pewarisan;


public class Speda {
    protected String merk;
    protected int kecepatan;

    public Speda(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void info() {
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }

    public void meloncat() {
    }
}
