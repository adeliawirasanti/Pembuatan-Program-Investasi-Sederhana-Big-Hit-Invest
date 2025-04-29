package Service;

import Model.Customer;
import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.List;
import java.util.Scanner;

public class CustomerService {

    // Menampilkan menu utama untuk customer
    public static void menuCustomer(Scanner scanner, Customer customer) {
        boolean isRunning = true;
        while (isRunning) {
            clearScreen();
            tampilkanMenuCustomer();
            System.out.print("Masukan pilihan: ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    beliSaham(scanner, customer);
                    break;
                case "2":
                    jualSaham(scanner, customer);
                    break;
                case "3":
                    beliSBN(scanner, customer);
                    break;
                case "4":
                    simulasiSBN(scanner);
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

    // Menampilkan tampilan menu customer
    private static void tampilkanMenuCustomer() {
        System.out.println("=====================================================================");
        System.out.println("||                      M E N U  C U S T O M E R                   ||");
        System.out.println("=====================================================================");
        System.out.println("||                    Silahkan Pilih Di Bawah Ini                  ||");
        System.out.println("||                                                                 ||");
        System.out.println("||  [1] Beli Saham                                                 ||");
        System.out.println("||  [2] Jual Saham                                                 ||");
        System.out.println("||  [3] Beli SBN                                                   ||");
        System.out.println("||  [4] Simulasi SBN                                               ||");
        System.out.println("||  [5] Portofolio                                                 ||");
        System.out.println("||  [6] Logout                                                     ||");
        System.out.println("=====================================================================");
    }

    // Proses membeli saham
    private static void beliSaham(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                          B E L I  S A H A M                      ||");
        System.out.println("=====================================================================");

        List<Saham> daftarSaham = InvestasiService.getDaftarSaham();
        System.out.println("Daftar Saham yang Tersedia:");
        for (Saham saham : daftarSaham) {
            System.out.printf("|| %-10s - %-30s - Rp %-10.2f ||\n", saham.getKode(), saham.getNamaPerusahaan(), saham.getHarga());
        }

        System.out.print("Pilih kode saham untuk dibeli: ");
        String kodeSaham = scanner.nextLine();

        // Cari saham berdasarkan kode
        Saham sahamTerpilih = null;
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kodeSaham)) {
                sahamTerpilih = saham;
                break;
            }
        }

        if (sahamTerpilih != null) {
            int jumlah = 0;
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan jumlah lembar saham yang akan dibeli: ");
                    jumlah = Integer.parseInt(scanner.nextLine());
                    valid = true; // Set valid flag to true if input is successful
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, harap masukkan angka.");
                }
            }
            customer.beliSaham(sahamTerpilih, jumlah);
            System.out.println("Pembelian berhasil!");
        } else {
            System.out.println("Saham tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    // Proses menjual saham
    private static void jualSaham(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                        J U A L  S A H A M                        ||");
        System.out.println("=====================================================================");

        customer.tampilkanSahamYangDimiliki();

        System.out.print("Pilih kode saham untuk dijual: ");
        String kodeSaham = scanner.nextLine();

        // Cari saham yang dimiliki berdasarkan kode
        Saham sahamTerpilih = customer.getSahamByKode(kodeSaham);
        if (sahamTerpilih != null) {
            int jumlah = 0;
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan jumlah lembar saham yang akan dijual: ");
                    jumlah = Integer.parseInt(scanner.nextLine());
                    valid = true; // Set valid flag to true if input is successful
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, harap masukkan angka.");
                }
            }
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

    // Proses membeli Surat Berharga Negara
    private static void beliSBN(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                          B E L I  S B N                         ||");
        System.out.println("=====================================================================");

        List<SuratBerhargaNegara> daftarSBN = InvestasiService.getDaftarSBN();
        System.out.println("Daftar SBN yang Tersedia:");
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.printf("|| %-30s || Bunga: %-6.2f%% ||\n", sbn.getNama(), sbn.getBunga());
        }

        System.out.print("Pilih nama SBN untuk dibeli: ");
        String namaSBN = scanner.nextLine();

        // Cari SBN berdasarkan nama
        SuratBerhargaNegara sbnTerpilih = null;
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(namaSBN)) {
                sbnTerpilih = sbn;
                break;
            }
        }

        if (sbnTerpilih != null) {
            double nominal = 0;
            boolean valid = false;
            while (!valid) {
                try {
                    System.out.print("Masukkan nominal yang akan dibeli: ");
                    nominal = Double.parseDouble(scanner.nextLine());
                    valid = true; // Set valid flag to true if input is successful
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid, harap masukkan angka.");
                }
            }
            customer.beliSBN(sbnTerpilih, nominal);
            sbnTerpilih.kurangiKuota(nominal);
            System.out.println("Pembelian SBN berhasil!");
        } else {
            System.out.println("SBN tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    // Menampilkan portofolio saham dan SBN customer
    private static void lihatPortofolio(Scanner scanner, Customer customer) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                       P O R T O F O L I O                        ||");
        System.out.println("=====================================================================");

        System.out.println("Saham yang Anda Miliki:");
        customer.tampilkanSahamYangDimiliki();

        System.out.println("SBN yang Anda Miliki:");
        customer.tampilkanSBNYangDimiliki();

        tekanEnterUntukLanjut(scanner);
    }
    
    // Simulasi estimasi pendapatan dari investasi SBN
    private static void simulasiSBN(Scanner scanner) {
        clearScreen();
        System.out.println("=====================================================================");
        System.out.println("||                       S I M U L A S I  S B N                     ||");
        System.out.println("=====================================================================");

        List<SuratBerhargaNegara> daftarSBN = InvestasiService.getDaftarSBN();
        System.out.println("Daftar SBN yang Tersedia:");
        for (SuratBerhargaNegara sbn : daftarSBN) {
            System.out.printf("|| %-30s || Bunga: %-6.2f%% ||\n", sbn.getNama(), sbn.getBunga());
        }

        System.out.print("Pilih nama SBN untuk simulasi: ");
        String namaSBN = scanner.nextLine();

        // Cari SBN berdasarkan nama
        SuratBerhargaNegara sbnTerpilih = null;
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(namaSBN)) {
                sbnTerpilih = sbn;
                break;
            }
        }

        if (sbnTerpilih != null) {
            System.out.print("Masukkan nominal investasi (Rp): ");
            double nominal = Double.parseDouble(scanner.nextLine());

            double bungaTahunan = sbnTerpilih.getBunga();
            double kuponPerBulan = (bungaTahunan / 100.0 / 12) * 0.9 * nominal;

            System.out.printf("Estimasi kupon yang Anda terima setiap bulan: Rp %.2f\n", kuponPerBulan);
        } else {
            System.out.println("SBN tidak ditemukan!");
        }

        tekanEnterUntukLanjut(scanner);
    }

    private static void tekanEnterUntukLanjut(Scanner scanner) {
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }

    // Membersihkan layar console
    private static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
