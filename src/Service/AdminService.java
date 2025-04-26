package Service;

import Model.Admin;
import java.util.Scanner;

public class AdminService {

    public static void menuAdmin(Scanner scanner) {
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

    private static void tampilkanMenuAdmin() {
        System.out.println("====================================================");
        System.out.println("||                   MENU ADMIN                    ||");
        System.out.println("====================================================");
        System.out.println("||  Pilih menu di bawah ini                        ||");
        System.out.println("||                                                 ||");
        System.out.println("||  [1] Saham                                      ||");
        System.out.println("||  [2] Surat Berharga Negara (SBN)                ||");
        System.out.println("||  [3] Logout                                     ||");
        System.out.println("====================================================");
    }

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

    private static void tampilkanMenuSaham() {
        System.out.println("====================================================");
        System.out.println("||                  MENU SAHAM                    ||");
        System.out.println("====================================================");
        System.out.println("||  Pilih menu di bawah ini                       ||");
        System.out.println("||                                                ||");
        System.out.println("||  [1] Tambah Saham                              ||");
        System.out.println("||  [2] Ubah Harga Saham                          ||");
        System.out.println("||  [3] Kembali                                   ||");
        System.out.println("====================================================");
    }

    private static void tambahSaham(Scanner scanner) {
        System.out.print("Masukkan kode saham: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama perusahaan: ");
        String namaPerusahaan = scanner.nextLine();
        System.out.print("Masukkan harga saham: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();  // consume the newline

        // Simulasi penambahan saham ke sistem
        System.out.println("Saham " + namaPerusahaan + " (" + kode + ") berhasil ditambahkan dengan harga Rp " + harga);
        tekanEnterUntukLanjut();
    }

    private static void ubahHargaSaham(Scanner scanner) {
        System.out.print("Masukkan kode saham yang akan diubah harganya: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan harga baru saham " + kode + ": ");
        double hargaBaru = scanner.nextDouble();
        scanner.nextLine();  // consume the newline

        // Simulasi perubahan harga saham
        System.out.println("Harga saham " + kode + " berhasil diubah menjadi Rp " + hargaBaru);
        tekanEnterUntukLanjut();
    }

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

    private static void tampilkanMenuSBN() {
        System.out.println("====================================================");
        System.out.println("||               MENU SURAT BERHARGA              ||");
        System.out.println("====================================================");
        System.out.println("||  Pilih menu di bawah ini                       ||");
        System.out.println("||                                                ||");
        System.out.println("||  [1] Tambah Surat Berharga Negara (SBN)        ||");
        System.out.println("||  [2] Kembali                                   ||");
        System.out.println("====================================================");
    }

    private static void tambahSBN(Scanner scanner) {
        System.out.print("Masukkan nama SBN: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan bunga SBN: ");
        double bunga = scanner.nextDouble();
        System.out.print("Masukkan jangka waktu SBN (bulan): ");
        int jangkaWaktu = scanner.nextInt();
        scanner.nextLine();  // consume the newline
        System.out.print("Masukkan tanggal jatuh tempo SBN: ");
        String jatuhTempo = scanner.nextLine();
        System.out.print("Masukkan kuota nasional SBN: ");
        double kuota = scanner.nextDouble();
        scanner.nextLine();  // consume the newline

        // Simulasi penambahan SBN ke sistem
        System.out.println("SBN " + nama + " berhasil ditambahkan dengan bunga " + bunga + "% dan kuota Rp " + kuota);
        tekanEnterUntukLanjut();
    }

    private static void tekanEnterUntukLanjut() {
        System.out.print("Tekan Enter untuk melanjutkan...");
        new Scanner(System.in).nextLine();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuAdmin(Scanner scanner, Admin admin) {
        menuAdmin(scanner);
    }
}
