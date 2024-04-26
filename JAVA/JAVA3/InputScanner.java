import java.util.Scanner;

public class InputScanner{
    public static void main(String[] args){
    String nama, npm;
    int umur;

    Scanner Inputan = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
    nama = Inputan.nextLine();
        System.out.print("Masukkan NPM : ");
    npm = Inputan.nextLine();
        System.out.print("Masukkan umur: ");
    umur =  Inputan.nextInt();
        System.out.println("\nSelamat Datang :" + nama);
        System.out.println("NPM Anda :" + npm);
        System.out.println("Dan umur Anda :" + umur + " tahun");
        Inputan.close();
    }
}