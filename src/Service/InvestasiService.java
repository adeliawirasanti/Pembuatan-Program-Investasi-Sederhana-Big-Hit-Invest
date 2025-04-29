package Service;

import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.ArrayList;
import java.util.List;

public class InvestasiService {
    // Daftar semua saham dan SBN yang tersedia
    private static List<Saham> daftarSaham = new ArrayList<>();
    private static List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    // Mengambil daftar semua saham
    public static List<Saham> getDaftarSaham() {
        return daftarSaham;
    }

    // Mengambil daftar semua SBN
    public static List<SuratBerhargaNegara> getDaftarSBN() {
        return daftarSBN;
    }

    // Menambahkan saham baru ke daftar
    public static void tambahSaham(Saham saham) {
        daftarSaham.add(saham);
    }

    // Menambahkan SBN baru ke daftar
    public static void tambahSBN(SuratBerhargaNegara sbn) {
        daftarSBN.add(sbn);
    }

    // Mencari saham berdasarkan kode
    public static Saham cariSahamByKode(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kode)) {
                return saham;
            }
        }
        return null;
    }

    // Mencari SBN berdasarkan nama
    public static SuratBerhargaNegara cariSBNByNama(String nama) {
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(nama)) {
                return sbn;
            }
        }
        return null;
    }
}
