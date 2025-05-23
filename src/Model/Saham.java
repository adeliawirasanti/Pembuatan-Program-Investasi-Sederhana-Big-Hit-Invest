package Model;

public class Saham {
    private String kode;
    private String namaPerusahaan;
    private double harga;

    // Menginisialisasi kode, nama perusahaan, dan harga saham
    public Saham(String kode, String namaPerusahaan, double harga) {
        this.kode = kode;
        this.namaPerusahaan = namaPerusahaan;
        this.harga = harga;
    }

    public String getKode() { return kode; }
    public String getNamaPerusahaan() { return namaPerusahaan; }
    public double getHarga() { return harga; }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Representasi objek Saham dalam bentuk String
    @Override
    public String toString() {
        return kode + " - " + namaPerusahaan + " (Rp" + harga + ")";
    }
}
