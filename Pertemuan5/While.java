package Pertemuan5;

public class While {
    public static void main(String[] args) {
        int bill = 10;
        while (bill >= 1) {
            System.out.println("Perulangan ke-" + bill);
            --bill;
        }
    }
}