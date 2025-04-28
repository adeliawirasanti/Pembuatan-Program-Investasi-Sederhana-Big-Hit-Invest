package Service;

import Model.Customer;
import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    public static void menuCustomer(Scanner scanner, Customer customer, List<Saham> daftarSaham, List<SuratBerhargaNegara> daftarSBN) {
        boolean isRunning = true;
        while (isRunning) {
            clearScreen();
            tampilkanMenuCustomer();
            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    beliSaham(scanner, customer, daftarSaham);
                    break;
                case "2":
                    jualSaham(scanner, customer);
                    break;
                case "3":
                    beliSBN(scanner, customer, daftarSBN);
                    break;
                case "4":
                    simulasiSBN(scanner, customer);
                    break;
                case "5":
                    lihatPortofolio(scanner, customer);
                    break;
                case "6":
                    System.out.println("Keluar dari Customer...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut(scanner);
            }
        }
    }

    private static void tampilkanMenuCustomer() {
        System.out.println("====================================================");
        System.out.println("||                MENU CUSTOMER                  ||");
        System.out.println("====================================================");
        System.out.println("||  [1] Beli Saham                               ||");
        System.out.println("||  [2] Jual Saham                               ||");
        System.out.println("||  [3] Beli SBN                                 ||");
        System.out.println("||  [4] Simulasi SBN                             ||");
        System.out.println("||  [5] Portofolio                               ||");
        System.out.println("||  [6] Logout                                   ||");
        System.out.println("====================================================");
    }

    private static void beliSaham(Scanner scanner, Customer customer, List<Saham> daftarSaham) {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                  BELI SAHAM                    ||");
        System.out.println("====================================================");

        System.out.println("Daftar Saham yang Tersedia:");
        for (Saham saham : daftarSaham) {
            System.out.println(saham.getKode() + " - " + saham.getNamaPerusahaan() + " - Rp " + saham.getHarga());
        }

        System.out.print("Pilih kode saham untuk dibeli: ");
        String kodeSaham = scanner.nextLine();

        Saham sahamTerpilih = null;
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kodeSaham)) {
                sahamTerpilih = saham;
                break;
            }
        }

        if (sahamTerpilih != null) {
            System.out.print("Masukkan jumlah lembar saham yang akan dibeli: ");
            int jumlah = Integer.parseInt(scanner.nextLine());
            customer.beliSaham(sahamTerpilih, jumlah);
            System.out.println("Pembelian berhasil!");
        } else {
            System.out.println("Saham tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    private static void jualSaham(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                  JUAL SAHAM                    ||");
        System.out.println("====================================================");

        customer.tampilkanSahamYangDimiliki();

        System.out.print("Pilih kode saham untuk dijual: ");
        String kodeSaham = scanner.nextLine();

        Saham sahamTerpilih = customer.getSahamByKode(kodeSaham);
        if (sahamTerpilih != null) {
            System.out.print("Masukkan jumlah lembar saham yang akan dijual: ");
            int jumlah = Integer.parseInt(scanner.nextLine());
            if (customer.jualSaham(sahamTerpilih, jumlah)) {
                System.out.println("Penjualan berhasil!");
            } else {
                System.out.println("Jumlah saham tidak mencukupi!");
            }
        } else {
            System.out.println("Saham tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    private static void beliSBN(Scanner scanner, Customer customer, List<SuratBerhargaNegara> daftarSBN) {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                  BELI SBN                      ||");
        System.out.println("====================================================");

        System.out.println("Daftar SBN yang Tersedia:");
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.println(sbn.getNama() + " - Bunga: " + sbn.getBunga() + "%");
        }

        System.out.print("Pilih nama SBN untuk dibeli: ");
        String namaSBN = scanner.nextLine();

        SuratBerhargaNegara sbnTerpilih = null;
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(namaSBN)) {
                sbnTerpilih = sbn;
                break;
            }
        }

        if (sbnTerpilih != null) {
            System.out.print("Masukkan nominal yang akan dibeli: ");
            double nominal = Double.parseDouble(scanner.nextLine());
            customer.beliSBN(sbnTerpilih, nominal);
            System.out.println("Pembelian SBN berhasil!");
        } else {
            System.out.println("SBN tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    private static void lihatPortofolio(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                   PORTOFOLIO                 ||");
        System.out.println("====================================================");

        System.out.println("Saham yang Anda Miliki:");
        customer.tampilkanSahamYangDimiliki();

        System.out.println("SBN yang Anda Miliki:");
        customer.tampilkanSBNYangDimiliki();

        tekanEnterUntukLanjut(scanner);
    }

    private static void simulasiSBN(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                   SIMULASI SBN                 ||");
        System.out.println("====================================================");

        System.out.println("Fitur simulasi SBN akan ditambahkan nanti.");
        tekanEnterUntukLanjut(scanner);
    }

    private static void tekanEnterUntukLanjut(Scanner scanner) {
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
