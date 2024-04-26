import java.util.Scanner;

public class mesinKasir {
    public static void main(String[] args) {
        String nama_barang;
        int jumlah_barang, harga;
        double totalharga, diskon = 0.075, totalbayar;
        Scanner input = new Scanner(System.in);

        System.out.println("Program Kasir Sederhana");
        System.out.println("-----------------------");
        System.out.println("Masukan data berikut:");
        System.out.println("Nama Barang= ");
        nama_barang = input.nextLine();
        System.out.println("Jumlah Barang= ");
        jumlah_barang = input.nextInt();

        if (jumlah_barang <= 0) {
            System.out.println("Mohon masukan jumlah yang benar dan ulang programnya");
            System.exit(0);
        }

        System.out.println("Harga Barang=  ");
        harga = input.nextInt();

        if (harga < 100) {
            System.out.println("Mohon masukan harga yang valid dan ulang programnya");
            System.exit(0);
        }

        totalharga = jumlah_barang * harga;
        diskon = totalharga * diskon;
        totalbayar = totalharga - diskon;
        input.close();

        System.out.println("Total Harga= Rp" + totalharga);
        System.out.println("Total Bayar = Rp" + totalbayar);
        System.out.println("-------------------------");
        System.out.println("Nota Belanja");
        System.out.println("Nama Barang = " + nama_barang);
        System.out.println("Jumlah Barang = " + jumlah_barang);
        System.out.println("Harga Barang = Rp" + harga);
        System.out.println("Total Harga= Rp" + totalharga);
        System.out.println("Total Bayar = Rp" + totalbayar);
        System.out.println("-------------------------");
    }
}