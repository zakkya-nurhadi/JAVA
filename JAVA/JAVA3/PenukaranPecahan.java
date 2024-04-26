import java.io.Console;

public class PenukaranPecahan {
    public static void main(String[] args) {
        int uang;
        Console con = System.console();
        System.out.print("Masukkan jumlah uang :Rp");
        uang = Integer.parseInt(con.readLine());
        int[] pecahan = {1000, 500, 100, 50, 25};
        int jumlah;

        System.out.println("=============================================\n");
        for (int i = 0; i < pecahan.length; i++) {
            jumlah = uang / pecahan[i];
            uang = uang % pecahan[i];
            System.out.println("Pecahan Rp" + pecahan[i] + ": " + jumlah + " buah");
        }
    }
}