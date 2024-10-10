import java.util.Scanner;

public class Parkir20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalPembayaran = 0;
        int pembayaran;
        int jenisKendaraan;
        int durasiParkir;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            if (jenisKendaraan != 1 && jenisKendaraan != 2) {
                System.out.println("Input tidak valid, silakan coba lagi.");
                continue;
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasiParkir = sc.nextInt();

            if (durasiParkir < 0) {
                System.out.println("Durasi tidak valid, silakan coba lagi.");
                continue;
            }

            if (durasiParkir > 5) {
                pembayaran = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    pembayaran = durasiParkir * 3000; // Mobil
                } else {
                    pembayaran = durasiParkir * 2000; // Motor
                }
            }

            totalPembayaran += pembayaran;
            System.out.println("Pembayaran untuk kendaraan jenis " + (jenisKendaraan == 1 ? "mobil" : "motor") + ": Rp " + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);

    }
}