package Model;

public class SuratBerhargaNegara {
    private String nama;
    private double bunga;
    private int jangkaWaktu; 
    private String tanggalJatuhTempo;
    private double kuotaNasional;
    
    // Menginisialisasi nama, bunga, jangka waktu, tanggal jatuh tempo, dan kuota nasional
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
    
    // Mengurangi kuota nasional saat customer membeli SBN
    public void kurangiKuota(double nominal) {
        this.kuotaNasional -= nominal;
    }
    
    // Representasi objek SuratBerhargaNegara dalam bentuk String
    @Override
    public String toString() {
        return nama + " - Bunga: " + bunga + "%, Jangka: " + jangkaWaktu + " bulan, Jatuh Tempo: " + tanggalJatuhTempo + ", Kuota: Rp" + kuotaNasional;
    }

}