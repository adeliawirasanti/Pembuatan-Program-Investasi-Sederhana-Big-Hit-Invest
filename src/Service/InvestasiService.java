package Service;

import Model.Saham;
import Model.SuratBerhargaNegara;
import java.util.ArrayList;
import java.util.List;

public class InvestasiService {
    private static List<Saham> daftarSaham = new ArrayList<>();
    private static List<SuratBerhargaNegara> daftarSBN = new ArrayList<>();

    public static List<Saham> getDaftarSaham() {
        return daftarSaham;
    }

    public static List<SuratBerhargaNegara> getDaftarSBN() {
        return daftarSBN;
    }

    public static void tambahSaham(Saham saham) {
        daftarSaham.add(saham);
    }

    public static void tambahSBN(SuratBerhargaNegara sbn) {
        daftarSBN.add(sbn);
    }

    public static Saham cariSahamByKode(String kode) {
        for (Saham saham : daftarSaham) {
            if (saham.getKode().equalsIgnoreCase(kode)) {
                return saham;
            }
        }
        return null;
    }

    public static SuratBerhargaNegara cariSBNByNama(String nama) {
        for (SuratBerhargaNegara sbn : daftarSBN) {
            if (sbn.getNama().equalsIgnoreCase(nama)) {
                return sbn;
            }
        }
        return null;
    }
}

