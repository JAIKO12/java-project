import java.io.*;

public class letBuffer {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Masukkan kata pertama: ");
            String kata_pertama = reader.readLine();

            System.out.print("Masukkan kata kedua: ");
            String kata_kedua = reader.readLine();

            System.out.println("Kata Pertama: " + kata_pertama);
            System.out.println("Kata Kedua: " + kata_kedua);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
