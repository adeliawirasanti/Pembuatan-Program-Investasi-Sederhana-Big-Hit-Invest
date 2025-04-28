package Model;

public class SuratBerhargaNegara {
    private String nama;
    private double bunga;
    private int jangkaWaktu; // bulan
    private String tanggalJatuhTempo;
    private double kuotaNasional;

    public SuratBerhargaNegara(String nama, double bunga, int jangkaWaktu, String tanggalJatuhTempo, double kuotaNasional) {
        this.nama = nama;
        this.bunga = bunga;
        this.jangkaWaktu = jangkaWaktu;
        this.tanggalJatuhTempo = tanggalJatuhTempo;
        this.kuotaNasional = kuotaNasional;
    }

    public String getNama() { return nama; }
    public double getBunga() { return bunga; }
    public int getJangkaWaktu() { return jangkaWaktu; }
    public String getTanggalJatuhTempo() { return tanggalJatuhTempo; }
    public double getKuotaNasional() { return kuotaNasional; }

    public void kurangiKuota(double nominal) {
        this.kuotaNasional -= nominal;
    }

    @Override
    public String toString() {
        return nama + " - Bunga: " + bunga + "%, Jangka: " + jangkaWaktu + " bulan, Jatuh Tempo: " + tanggalJatuhTempo + ", Kuota: Rp" + kuotaNasional;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> efac99d202b89c449ed71af8a608e4e76a54cf1f
