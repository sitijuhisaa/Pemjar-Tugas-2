import java.io.*;



public class Contoh2 {
    public static void main(String[] args) throws IOException
    {
        int angka1, angka2;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan Angka 1 :");
        angka1=Integer.parseInt(br.readLine());

        System.out.print("Masukkan Angka 2 : ");
        angka2=Integer.parseInt(br.readLine());

        System.out.println("Angka1 Anda : "+angka1);
        System.out.println("Angka2 Anda : "+angka2);
    }
}
