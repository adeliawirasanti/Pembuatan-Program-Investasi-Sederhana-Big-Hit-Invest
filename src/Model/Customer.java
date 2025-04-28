package Model;

import java.util.HashMap;
import java.util.Map;

public class Customer extends User {
    private Map<Saham, Integer> sahamDimiliki = new HashMap<>();
    private Map<SuratBerhargaNegara, Double> sbnDimiliki = new HashMap<>();

    public Customer(String username, String password) {
        super(username, password);
    }

    public Map<Saham, Integer> getSahamDimiliki() {
        return sahamDimiliki;
    }

    public Map<SuratBerhargaNegara, Double> getSbnDimiliki() {
        return sbnDimiliki;
    }

    // Membeli saham
    public void beliSaham(Saham saham, int jumlah) {
        sahamDimiliki.put(saham, sahamDimiliki.getOrDefault(saham, 0) + jumlah);
    }

    // Menjual saham
    public boolean jualSaham(Saham saham, int jumlah) {
        if (sahamDimiliki.containsKey(saham) && sahamDimiliki.get(saham) >= jumlah) {
            sahamDimiliki.put(saham, sahamDimiliki.get(saham) - jumlah);
            if (sahamDimiliki.get(saham) == 0) {
                sahamDimiliki.remove(saham); // Jika saham habis, hapus dari daftar
            }
            return true;
        }
        return false;
    }

    // Membeli SBN
    public void beliSBN(SuratBerhargaNegara sbn, double nominal) {
        sbnDimiliki.put(sbn, sbnDimiliki.getOrDefault(sbn, 0.0) + nominal);
    }

    // Menampilkan saham yang dimiliki
    public void tampilkanSahamYangDimiliki() {
        if (sahamDimiliki.isEmpty()) {
            System.out.println("Anda tidak memiliki saham.");
        } else {
            for (Map.Entry<Saham, Integer> entry : sahamDimiliki.entrySet()) {
                Saham saham = entry.getKey();
                int jumlah = entry.getValue();
                System.out.println(saham.getKode() + " - " + saham.getNamaPerusahaan() + " - " + jumlah + " lembar");
            }
        }
    }

    // Menampilkan SBN yang dimiliki
    public void tampilkanSBNYangDimiliki() {
        if (sbnDimiliki.isEmpty()) {
            System.out.println("Anda tidak memiliki SBN.");
        } else {
            for (Map.Entry<SuratBerhargaNegara, Double> entry : sbnDimiliki.entrySet()) {
                SuratBerhargaNegara sbn = entry.getKey();
                double nominal = entry.getValue();
                System.out.println(sbn.getNama() + " - Nominal: Rp " + nominal + " - Bunga: " + sbn.getBunga() + "%");
            }
        }
    }

    // Mendapatkan saham berdasarkan kode
    public Saham getSahamByKode(String kode) {
        for (Saham saham : sahamDimiliki.keySet()) {
            if (saham.getKode().equals(kode)) {
                return saham;
            }
        }
        return null;
    }

    // Mendapatkan SBN berdasarkan nama
    public SuratBerhargaNegara getSBNByNama(String nama) {
        for (SuratBerhargaNegara sbn : sbnDimiliki.keySet()) {
            if (sbn.getNama().equals(nama)) {
                return sbn;
            }
        }
        return null;
    }
}