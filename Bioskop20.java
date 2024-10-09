import java.util.Scanner;

public class Bioskop20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalTiket = 0;
        double totalHarga = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau -1 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                continue;
            }

            double hargaTiket = 50000 * jumlahTiket;

            if (jumlahTiket > 10) {
                hargaTiket *= 0.85; // Diskon 15%
            } else if (jumlahTiket > 4) {
                hargaTiket *= 0.90; // Diskon 10%
            }

            totalTiket += jumlahTiket;
            totalHarga += hargaTiket;

            System.out.println("Jumlah tiket: " + jumlahTiket + ", Harga total: Rp " + hargaTiket);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total harga penjualan tiket: Rp " + totalHarga);
    }
}