**PBO - TUGAS 1**
======================================================

**PEMBUATAN PROGRAM INVESTASI SEDERHANA Bighit Invest**
-------------------------------------------------------
HIIII!!! Ini adalah proyek kecil kami, yaitu pembuatan program investasi sederhana Bernama Bighit Invest, yang digunakan untuk untuk memenuhi tugas I dari mata kuliah Pemrograman Berorientasi Objek (PBO) dengan implementasi struktur kode modular yang bersih dan terorganisir.

BigHit Invest adalah aplikasi investasi saham dan Surat Berharga Negara (SBN) berbasis Command Line Interface (CLI). Aplikasi ini memungkinkan pengguna (admin dan customer) untuk melakukan investasi, memeriksa saldo, dan melakukan transaksi saham serta SBN


**IDENTITAS KAMI**
------------------------------------------------------
1. Ni Made Adelia Wirasanti NIM: 2405551010 Kelas PBO B
2. Nyoman Paramita Windari NIM: 2405551050 Kelas PBO B


**UML**
-------------------------------------------------------
![UML PBO Tugas 1](https://github.com/user-attachments/assets/09d64397-b8cf-43a8-b893-3178cc764f86)

**FITUR UTAMA**
------------------------------------------------------
- Login untuk Admin dan Customer: Admin dan Customer dapat login menggunakan username dan password.
- Investasi Saham: Customer dapat membeli dan menjual saham.
- Investasi SBN: Customer dapat membeli dan menjual Surat Berharga Negara (SBN).
- Cek Saldo: Pengguna dapat memeriksa saldo akun mereka.
- Validasi Input: Program memvalidasi semua input dari pengguna untuk memastikan data yang dimasukkan valid.
- Menu Interaktif: Menggunakan menu untuk memudahkan navigasi.


**PENJELASAN KODE**
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


**BAGAIMANA PROGRAM DIJALANKAN**
--------------------------------------------


**PENGGUNAAN PROGRAM**
-----------------------------------------
![Screenshot 2025-04-29 103121](https://github.com/user-attachments/assets/21ee4366-d196-41a0-a841-cc7a35c553fc)

![Screenshot 2025-04-29 103225](https://github.com/user-attachments/assets/24f443b6-91d8-4236-ab8a-ad0c19f35a36)

![Screenshot 2025-04-29 103327](https://github.com/user-attachments/assets/e553aeeb-84b4-4d5b-95bd-21d1958b1b24)

![Screenshot 2025-04-29 105022](https://github.com/user-attachments/assets/6e0695bf-1a22-4ca6-8f2a-cbea230a7697)

Menu Admin Saham
![Screenshot 2025-04-29 105221](https://github.com/user-attachments/assets/4d4961eb-5fe9-408d-871f-5625afe3ac60)

![Screenshot 2025-04-29 105243](https://github.com/user-attachments/assets/baf644ee-8a04-43b9-ab73-c42c5bd5bb56)

![Screenshot 2025-04-29 105307](https://github.com/user-attachments/assets/2704282d-af6b-488e-a2e7-0c156c682484)

![Screenshot 2025-04-29 105444](https://github.com/user-attachments/assets/2093f2fc-7383-4c34-8a17-47a9f29a5067)

Ubah Harga Saham
![Screenshot 2025-04-29 105514](https://github.com/user-attachments/assets/6eadb91b-1ff2-4e95-aa0b-a809f1fe2cdb)

![Screenshot 2025-04-29 105837](https://github.com/user-attachments/assets/0e1cddc2-e7a9-4b5b-ae8b-144a7c0f1a55)

![Screenshot 2025-04-29 105943](https://github.com/user-attachments/assets/6e87b1eb-4b00-4f3e-9639-1302ee6cf90a)

Menu Admin SBN
![Screenshot 2025-04-29 110013](https://github.com/user-attachments/assets/d0121f3a-d438-43af-83c8-01e3d96e607d)

![Screenshot 2025-04-29 110039](https://github.com/user-attachments/assets/4814b722-9617-4d87-b90a-553f155dacd1)

![Screenshot 2025-04-29 111053](https://github.com/user-attachments/assets/269672f3-93e1-4563-8cf8-e9ebe7a8e519)

![Screenshot 2025-04-29 111204](https://github.com/user-attachments/assets/3e70e6d2-d7a8-493c-b3aa-c37a8bb97722)

![Screenshot 2025-04-29 111230](https://github.com/user-attachments/assets/06261f02-472d-4ae9-9cbe-d7a325ec8def)

Menu Customer
![Screenshot 2025-04-29 111252](https://github.com/user-attachments/assets/6a595fe0-f87a-427b-855f-2277664b9378)

![Screenshot 2025-04-29 111324](https://github.com/user-attachments/assets/0f31d048-75c6-4fff-af29-7bb94137abb6)

![Screenshot 2025-04-29 111351](https://github.com/user-attachments/assets/6ca44adc-8ff9-4cff-a452-1bcd65f688c9)

![Screenshot 2025-04-29 111415](https://github.com/user-attachments/assets/00d568dc-e0b3-40ae-9af5-aba18a541971)

Beli Saham
![Screenshot 2025-04-29 113618](https://github.com/user-attachments/assets/142092a1-3887-410b-b0ed-5736e6df99f7)

Jual Saham

![Screenshot 2025-04-29 113856](https://github.com/user-attachments/assets/68d7073d-c938-4998-ac30-28207661c8ca)

Beli SBN

![Screenshot 2025-04-29 111907](https://github.com/user-attachments/assets/e1d56fbb-156d-4d93-9c48-ac028ba9a0af)

Simulasi SBN

![Screenshot 2025-04-29 112150](https://github.com/user-attachments/assets/ff2f7663-b085-4992-9cc4-c6aa747ef6d1)

![Screenshot 2025-04-29 113051](https://github.com/user-attachments/assets/4d2fcdbf-efbf-4ae9-8e9e-0e4d7d84acf6)

Portofolio

![Screenshot 2025-04-29 113123](https://github.com/user-attachments/assets/cb2bf983-bac3-4a1d-b069-d78b84783034)

![Screenshot 2025-04-29 113315](https://github.com/user-attachments/assets/e5e37ec2-9f91-4b5c-a81a-018a7b8ed541)

Logout

![Screenshot 2025-04-29 113957](https://github.com/user-attachments/assets/33161733-132e-4a66-9646-7f6bfa9b9622)

![Screenshot 2025-04-29 114025](https://github.com/user-attachments/assets/76747ffb-ab60-441c-9273-4cad4a589f19)

![Screenshot 2025-04-29 114746](https://github.com/user-attachments/assets/84d7d1e1-d06b-42dc-916f-0cbfd118dbed)
