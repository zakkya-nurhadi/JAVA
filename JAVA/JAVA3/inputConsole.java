import java.io.Console;

public class inputConsole {
        public static void main(String[] args) {
        String nama;
        int umur;

        Console con = System.console();

        System.out.print("Masukkan nama: "); 
        nama = con.readLine();
        System.out.print("Masukkan umur: ");
        umur = Integer.parseInt(con.readLine());

        System.out.println("Selamat datang " + nama);
        System.out.println("Umur kamu " + umur + " tahun");
    }
}

