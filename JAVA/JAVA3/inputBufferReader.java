import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputBufferReader {
    public static void main(String[] args) throws IOException {
        String nama;

        // Membuat objek inputstream dan bufferreader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Masukkan Nama: ");
        nama = br.readLine();

        System.out.println("Hello " + nama);
    }
}
