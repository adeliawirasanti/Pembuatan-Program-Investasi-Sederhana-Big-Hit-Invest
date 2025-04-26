import Service.AdminService;
import Service.CustomerService;
import Model.Admin;
import Model.Customer;
import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Admin admin = new Admin("ADEL", "adel123");
    private static Customer customer = new Customer("MITA", "mita123");

    // Tambahkan daftarSaham dan daftarSBN di sini
    private static List<Saham> daftarSaham = new ArrayList<>();
    private static List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    public static void main(String[] args) {
        // Inisialisasi data dummy saham dan SBN
        daftarSaham.add(new Saham("BBCA", "Bank BCA", 10000));
        daftarSaham.add(new Saham("TLKM", "Telkom Indonesia", 4000));

        daftarSBN.add(new SuratBerhargaNegara("ORI022", 6.1, 36, "2027-01-15", 500000000));
        daftarSBN.add(new SuratBerhargaNegara("SR018", 5.5, 24, "2026-10-10", 30000000));

        boolean isRunning = true;

        while (isRunning) {
            clearScreen();
            tampilkanMenuAwal();

            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    if (loginAdmin()) {
                        AdminService.menuAdmin(scanner, admin); // Admin menu
                    }
                    break;
                case "2":
                    if (loginCustomer()) {
                        CustomerService.menuCustomer(scanner, customer, daftarSaham, daftarSBN); // Customer menu
                    }
                    break;
                case "0":
                    System.out.println("Keluar dari program...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut();
            }
        }

        scanner.close();
    }

    // Menampilkan menu awal (login)
    private static void tampilkanMenuAwal() {
        System.out.println("====================================================");
        System.out.println("||                  W E L C O M E                 ||");
        System.out.println("||                  LOGIN PAGE                   ||");
        System.out.println("====================================================");
        System.out.println("||  Pilih Tipe User Di bawah                     ||");
        System.out.println("||                                               ||");
        System.out.println("||  [1] Admin                                    ||");
        System.out.println("||  [2] Customer                                 ||");
        System.out.println("||  [0] Keluar Program                           ||");
        System.out.println("====================================================");
    }

    // Login Admin
    private static boolean loginAdmin() {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                    L O G I N                   ||");
        System.out.println("||  Mohon Masukkan Username dan Password         ||");
        System.out.println("====================================================");

        System.out.print("Masukkan username Anda: ");
        String uname = scanner.nextLine();
        System.out.print("Masukkan password Anda: ");
        String pass = scanner.nextLine();

        if (uname.equals(admin.getUsername()) && pass.equals(admin.getPassword())) {
            System.out.println("\n====================================================");
            System.out.println("||             Hallo Admin, Adel                 ||");
            System.out.println("||     Tekan Enter untuk melanjutkan...         ||");
            System.out.println("====================================================");
            tekanEnterUntukLanjut();
            return true;
        } else {
            System.out.println("Login gagal!");
            tekanEnterUntukLanjut();
            return false;
        }
    }

    // Login Customer
    private static boolean loginCustomer() {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                    L O G I N                   ||");
        System.out.println("||  Mohon Masukkan Username dan Password         ||");
        System.out.println("====================================================");

        System.out.print("Masukkan username Anda: ");
        String uname = scanner.nextLine();
        System.out.print("Masukkan password Anda: ");
        String pass = scanner.nextLine();

        if (uname.equals(customer.getUsername()) && pass.equals(customer.getPassword())) {
            System.out.println("\n====================================================");
            System.out.println("||             Hallo Customer, Mita              ||");
            System.out.println("||     Tekan Enter untuk melanjutkan...         ||");
            System.out.println("====================================================");
            tekanEnterUntukLanjut();
            return true;
        } else {
            System.out.println("Login gagal!");
            tekanEnterUntukLanjut();
            return false;
        }
    }

    // Fungsi untuk menunggu pengguna menekan Enter untuk melanjutkan
    private static void tekanEnterUntukLanjut() {
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }

    // Fungsi untuk membersihkan layar (simulasi)
    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
