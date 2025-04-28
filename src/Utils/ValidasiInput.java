package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidasiInput {

    // Validasi nama (hanya huruf dan spasi)
    public static String validasiNama(String input) {
        if (input.matches("[a-zA-Z\\s]+")) {
            return input;
        } else {
            System.out.println("Nama hanya boleh berisi huruf dan spasi.");
            return "";
        }
    }

    // Validasi pilihan menu (antara 1 dan 4)
    public static int validasiMenu(int pilihan) {
        if (pilihan >= 1 && pilihan <= 4) {
            return pilihan;
        } else {
            System.out.println("Pilihan tidak valid. Masukkan angka antara 1 dan 4.");
            return -1;
        }
    }

    // Validasi nominal uang (harus lebih dari 0)
    public static double validasiNominal(double nominal) {
        if (nominal > 0) {
            return nominal;
        } else {
            System.out.println("Nominal harus lebih dari 0.");
            return -1;
        }
    }

    // Validasi format tanggal (dd-MM-yyyy)
    public static boolean validasiTanggal(String input) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(input);
            return true;
        } catch (ParseException e) {
            System.out.println("Format tanggal salah. Harap masukkan tanggal dengan format dd-MM-yyyy.");
            return false;
        }
    }

    // Validasi jenis investasi (hanya 'Saham' atau 'SBN')
    public static String validasiJenisInvestasi(String jenis) {
        String[] jenisInvestasiValid = {"Saham", "SBN"};
        for (String j : jenisInvestasiValid) {
            if (j.equalsIgnoreCase(jenis)) {
                return jenis;
            }
        }
        System.out.println("Jenis investasi tidak valid. Pilih antara 'Saham' atau 'SBN'.");
        return "";
    }

    // Validasi angka dalam rentang tertentu
    public static int validasiAngka(int input, int min, int max) {
        if (input >= min && input <= max) {
            return input;
        } else {
            System.out.println("Angka harus antara " + min + " dan " + max);
            return -1;
        }
    }

    // Validasi ID (ID harus lebih besar dari 0)
    public static int validasiID(int id) {
        if (id > 0) {
            return id;
        } else {
            System.out.println("ID harus lebih besar dari 0.");
            return -1;
        }
    }
}
