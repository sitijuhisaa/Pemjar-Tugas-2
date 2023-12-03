import java.io.*;

public class Tugas2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Meminta input nama
        System.out.print("Masukkan Nama Anda : ");
        String nama = br.readLine();

        // Meminta input NIM
        System.out.print("Masukkan NIM Anda : ");
        String nim = br.readLine();

        // Meminta input nilai UTS
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = Double.parseDouble(br.readLine());

        // Meminta input nilai UAS
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = Double.parseDouble(br.readLine());

        // Menghitung nilai akhir
        //double nilaiAkhir = (nilaiUTS + nilaiUAS) / 2;

        // Menampilkan hasil
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
    }
}
