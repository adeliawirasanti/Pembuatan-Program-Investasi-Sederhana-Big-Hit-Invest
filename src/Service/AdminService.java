package Service;

import Model.Admin;
import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.Scanner;

public class AdminService {

    // Menampilkan menu utama untuk Admin
    public static void menuAdmin(Scanner scanner, Admin admin) {
        boolean isRunning = true;

        while (isRunning) {
            clearScreen();
            tampilkanMenuAdmin();

            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    menuSaham(scanner);
                    break;
                case "2":
                    menuSBN(scanner);
                    break;
                case "3":
                    System.out.println("Keluar dari menu Admin...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut();
            }
        }
    }
    
    // Menampilkan daftar menu utama Admin
    private static void tampilkanMenuAdmin() {
        System.out.println("=====================================================================");
        System.out.println("||                         M E N U  A D M I N                      ||");
        System.out.println("=====================================================================");
        System.out.println("||               Silahkan Pilih Tipe User Di bawah ini             ||");
        System.out.println("||                                                                 ||");
        System.out.println("||  [1] Saham                                                      ||");
        System.out.println("||  [2] Surat Berharga Negara (SBN)                                ||");
        System.out.println("||  [3] Logout                                                     ||");
        System.out.println("=====================================================================");
    }
    
    // Menu pengelolaan Saham
    private static void menuSaham(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            clearScreen();
            tampilkanMenuSaham();

            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahSaham(scanner);
                    break;
                case "2":
                    ubahHargaSaham(scanner);
                    break;
                case "3":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut();
            }
        }
    }
    
    // Menampilkan daftar menu Saham
    private static void tampilkanMenuSaham() {
        System.out.println("=====================================================================");
        System.out.println("||                         M E N U  S A H A M                      ||");
        System.out.println("=====================================================================");
        System.out.println("||               Silahkan Pilih Tipe User Di bawah ini             ||");
        System.out.println("||                                                                 ||");
        System.out.println("||  [1] Tambah Saham                                               ||");
        System.out.println("||  [2] Ubah Harga Saham                                           ||");
        System.out.println("||  [3] Logout                                                     ||");
        System.out.println("=====================================================================");
    }
    
    // Menambahkan Saham baru
    private static void tambahSaham(Scanner scanner) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                     T A M B A H  S A H A M                       ||");
        System.out.println("||                 Silakan masukkan data saham baru                 ||");
        System.out.println("=====================================================================");

        System.out.print("|| Kode Saham            : ");
        String kode = scanner.nextLine();
        System.out.print("|| Nama Perusahaan       : ");
        String namaPerusahaan = scanner.nextLine();
        System.out.print("|| Harga Saham (Rp)      : ");
        double harga = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        Saham sahamBaru = new Saham(kode, namaPerusahaan, harga);
        InvestasiService.tambahSaham(sahamBaru); // Tambahkan ke sistem

        System.out.println("=====================================================================");
        System.out.printf("|| Berhasil menambahkan: %-25s Harga: Rp %-12.2f ||\n", namaPerusahaan + " (" + kode + ")", harga);
        System.out.println("=====================================================================");
        tekanEnterUntukLanjut();
    }
    
    // Mengubah harga saham yang sudah ada
    private static void ubahHargaSaham(Scanner scanner) {
        System.out.print("Masukkan kode saham yang akan diubah harganya: ");
        String kode = scanner.nextLine();
        Saham saham = InvestasiService.cariSahamByKode(kode);

        if (saham != null) {
            System.out.print("Masukkan harga baru untuk saham " + kode + ": ");
            double hargaBaru = scanner.nextDouble();
            scanner.nextLine(); // consume newline
            saham.setHarga(hargaBaru); // Update harga
            System.out.println("Harga saham " + kode + " berhasil diubah menjadi Rp " + hargaBaru);
        } else {
            System.out.println("Saham tidak ditemukan.");
        }
        tekanEnterUntukLanjut();
    }
    
    // Menu pengelolaan Surat Berharga Negara (SBN)
    private static void menuSBN(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            clearScreen();
            tampilkanMenuSBN();

            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    tambahSBN(scanner);
                    break;
                case "2":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut();
            }
        }
    }
    
    // Menampilkan daftar menu SBN
    private static void tampilkanMenuSBN() {
        System.out.println("=====================================================================");
        System.out.println("||                M E N U  S U R A T  B E R H A R G A              ||");
        System.out.println("=====================================================================");
        System.out.println("||               Silahkan Pilih Tipe User Di bawah ini             ||");
        System.out.println("||                                                                 ||");
        System.out.println("||  [1] Tambah Surat Berharga (SBN)                                ||");
        System.out.println("||  [2] Logout                                                     ||");
        System.out.println("=====================================================================");
    }

    // Menambahkan SBN baru
    private static void tambahSBN(Scanner scanner) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                TAMBAH SURAT BERHARGA NEGARA (SBN)               ||");
        System.out.println("||                 Silakan masukkan data SBN baru                  ||");
        System.out.println("=====================================================================");

        System.out.print("|| Nama SBN             : ");
        String nama = scanner.nextLine();
        System.out.print("|| Bunga SBN (%)         : ");
        double bunga = scanner.nextDouble();
        System.out.print("|| Jangka Waktu SBN (bulan) : ");
        int jangkaWaktu = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("|| Tanggal Jatuh Tempo (yyyy-MM-dd) : ");
        String jatuhTempo = scanner.nextLine();
        System.out.print("|| Kuota Nasional SBN (Rp) : ");
        double kuota = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        SuratBerhargaNegara sbnBaru = new SuratBerhargaNegara(nama, bunga, jangkaWaktu, jatuhTempo, kuota);
        InvestasiService.tambahSBN(sbnBaru); // Tambahkan ke sistem

        System.out.println("=====================================================================");
        System.out.printf("|| Berhasil menambahkan: %-25s Bunga: %-6.2f%%  Kuota: Rp %-12.2f ||\n", nama, bunga, kuota);
        System.out.println("=====================================================================");
        tekanEnterUntukLanjut();
    }
    
    // Mmeminta user menekan Enter untuk lanjut
    private static void tekanEnterUntukLanjut() {
        System.out.print("Tekan Enter untuk melanjutkan...");
    }

    // Clear layar console 
    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
