**PBO - TUGAS 1**
-------------------------------------------------------
**Pembuatan Program Investasi Sederhana Bighit Invest**
-------------------------------------------------------
HIIII!!! Ini adalah proyek kecil kami, yaitu pembuatan program investasi sederhana Bernama Bighit Invest, yang digunakan untuk untuk memenuhi tugas I dari mata kliah Pemrograman Berorientasi Objek (PBO) dengan implementasi struktur kode modular yang bersih dan terorganisir.

BigHit Invest adalah aplikasi investasi saham dan Surat Berharga Negara (SBN) berbasis Command Line Interface (CLI). Aplikasi ini memungkinkan pengguna (admin dan customer) untuk melakukan investasi, memeriksa saldo, dan melakukan transaksi saham serta SBN
--------------------------------------------------------------------------------------------

**Identitas Kami**
------------------------------------------------------
1. Ni Made Adelia Wirasanti NIM: 2405551010 Kelas PBO B
2. Nyoman Paramita Windari NIM: 2405551050 Kelas PBO B
---------------------------------------------------------------------------------------------

**UML**

---------------------------------------------------------------------------------------------

**Fitur Utama**
------------------------------------------------------
- Login untuk Admin dan Customer: Admin dan Customer dapat login menggunakan username dan password.
- Investasi Saham: Customer dapat membeli dan menjual saham.
- Investasi SBN: Customer dapat membeli dan menjual Surat Berharga Negara (SBN).
- Cek Saldo: Pengguna dapat memeriksa saldo akun mereka.
- Validasi Input: Program memvalidasi semua input dari pengguna untuk memastikan data yang dimasukkan valid.
- Menu Interaktif: Menggunakan menu untuk memudahkan navigasi.
----------------------------------------------------------------------------------------------

**Penjelasan Kode**
----------------------------------------------------
**1. Main.java**
File ini adalah pintu utama untuk menjalankan aplikasi BigHit Invest. Program dimulai dari Main.java yang berfungsi untuk menampilkan menu awal, memproses login untuk Admin dan Customer, serta mengarahkan pengguna ke menu yang sesuai. Seluruh alur interaksi pengguna dikendalikan dari file ini.

**2. model/**
Folder model berisi kelas-kelas yang mewakili entitas data yang digunakan dalam aplikasi. User.java adalah kelas dasar yang menyimpan informasi umum pengguna seperti username dan password, yaitu:
- Saham.java: Mewakili entitas saham yang memiliki harga dan jumlah.
- SuratBerhargaNegara.java: Mewakili entitas Surat Berharga Negara (SBN).
- User.java: Kelas dasar yang digunakan oleh Admin dan Customer untuk menyimpan informasi umum pengguna.
- Admin.java dan Customer.java: Kelas turunan dari User yang memiliki fungsionalitas dan data spesifik untuk admin dan customer.

**3. service/**
Folder ini berisi kelas-kelas yang menangani logika bisnis utama aplikasi:
- InvestasiService.java: Mengelola transaksi investasi (membeli/menjual saham dan SBN).
- AdminService.java: Mengelola data admin, seperti menambah, mengubah, atau menghapus data admin.
- CustomerService.java: Mengelola data customer, seperti registrasi, login, dan logout.

**4. utils/**
Folder ini berisi kelas InputValidator.java yang digunakan untuk memvalidasi input dari pengguna agar tidak ada data yang salah atau tidak valid.
-----------------------------------------------------------------------------------------------

**Bagaimana Program Dijalankan**
--------------------------------------------


**Penggunaan Program**
-----------------------------------------
