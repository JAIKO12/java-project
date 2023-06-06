package Pertemuan2;

public class Mobil {
    // data mobil
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    // constructor
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }

    // method untuk mendapatkan merk mobil
    public String getMerk() {
        return merk;
    }

    // method untuk mengubah merk mobil
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // method untuk mendapatkan model mobil
    public String getModel() {
        return model;
    }

    // method untuk mengubah model mobil
    public void setModel(String model) {
        this.model = model;
    }

    // method untuk mendapatkan tahun mobil
    public int getTahun() {
        return tahun;
    }

    // method untuk mengubah tahun mobil
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // method untuk mendapatkan warna mobil
    public String getWarna() {
        return warna;
    }

    // method untuk mengubah warna mobil
    public void setWarna(String warna) {
        this.warna = warna;
    }


    // method untuk menampilkan data mobil
    public void display() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }

    // main method untuk membuat object dan menampilkan data mobil
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", "Avanza", 2020, "Putih");
        Mobil mobil2 = new Mobil("Honda", "Jazz", 2021, "Merah");

        mobil1.display();
        System.out.println();
        mobil2.display();
    }
}
