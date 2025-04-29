**PBO - TUGAS 1**
======================================================

**PEMBUATAN PROGRAM INVESTASI SEDERHANA Bighit Invest**
-------------------------------------------------------
HIIII!!! 👋😄
Ini adalah proyek kecil kami, yaitu pembuatan program investasi sederhana bernama BigHit Invest 💰📈, yang digunakan untuk memenuhi Tugas I dari mata kuliah Pemrograman Berorientasi Objek (PBO) 👨‍💻👩‍💻 dengan implementasi struktur kode yang modular, bersih, dan juga terorganisir.

BigHit Invest adalah aplikasi investasi saham dan Surat Berharga Negara (SBN) berbasis Command Line Interface (CLI). Aplikasi ini memungkinkan pengguna, yaitu admin dan customer, untuk:
- Melakukan investasi 📊
- Memeriksa portofolio 🧾
- Melakukan transaksi jual beli saham dan SBN 📉📈
  
Semua dijalankan dari terminal dengan antarmuka teks yang simpel namun interaktif!


**IDENTITAS KAMI**
------------------------------------------------------
1. Ni Made Adelia Wirasanti | NIM: 2405551010 | Kelas PBO B
2. Nyoman Pramita Windari  | NIM: 2405551050 | Kelas PBO B


**UML**
-------------------------------------------------------
![UML PBO Tugas 1](https://github.com/user-attachments/assets/09d64397-b8cf-43a8-b893-3178cc764f86)

**FITUR UTAMA**
------------------------------------------------------
**1.🔐 Login untuk Admin dan Customer**

Pengguna dapat login sebagai:
- Admin (contoh: username ADEL, password adel123)
- Customer (contoh: username MITA, password mita123)
  
Login dilakukan melalui antarmuka teks dan diverifikasi menggunakan class User dan subclass-nya (Admin, Customer).

**2.📈 Investasi Saham**
Fitur untuk Customer:
- Membeli saham berdasarkan daftar yang tersedia di sistem
- Menjual saham yang sudah dimiliki
- Saham yang dimiliki disimpan dalam Map<Saham, Integer> di class Customer

**3.🏦 Investasi Surat Berharga Negara (SBN)**
Fitur untuk Customer:
- Membeli SBN berdasarkan nama dan nominal yang tersedia
- Sistem otomatis mengurangi kuota nasional dari SBN yang dibeli
- Simulasi kupon bulanan dari SBN juga tersedia
- Portofolio SBN disimpan dalam Map<SuratBerhargaNegara, Double>

**4.📊 Cek Portofolio**
Pengguna dapat melihat portofolio investasi mereka, yaitu:
- Saham yang dimiliki dan jumlah lembarnya
- Surat Berharga Negara yang dimiliki dan nominal investasinya

**5.✅ Validasi Input**
Class ValidasiInput menyediakan berbagai metode validasi seperti:
- Format nama, nominal uang, tanggal (dd-MM-yyyy), jenis investasi
- Rentang angka dan ID yang valid
  
Validasi ini mencegah kesalahan input dan memastikan integritas data


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
Program ini dijalankan dengan menerapkan konsep Object Oriented Programming (OOP), yaitu:

**1. Penggunaan Class dan Object**
**2. Flow Control**
**3. ArrayList**
**4. Inheritance**
**5. Encapsulation**
**6. Static Usage**

**PENGGUNAAN PROGRAM**
-----------------------------------------
Bagian berikut menunjukkan langkah-langkah dari penggunaan program, disertai gambar hasil eksekusi serta penjelasan di bawahnya.

**Log In Admin & Customer**
-----------------------------------------

![Screenshot 2025-04-29 223705](https://github.com/user-attachments/assets/aec5bf2e-2e8c-4445-bea2-c316ab1e0990)

![Screenshot 2025-04-29 223912](https://github.com/user-attachments/assets/fa877e3d-9d57-4114-92b0-e91a76a7692a)

![Screenshot 2025-04-29 224007](https://github.com/user-attachments/assets/e15c1646-e67b-4ebc-b95f-3b68b2335b5b)

![Screenshot 2025-04-29 225150](https://github.com/user-attachments/assets/18243c1d-1396-4881-a4b0-29de6354402d)

![Screenshot 2025-04-29 225228](https://github.com/user-attachments/assets/ef4109cb-bcd5-42ad-a180-517f1b2a56fd)

![Screenshot 2025-04-29 235143](https://github.com/user-attachments/assets/7854a3f0-7aaf-40b7-9596-c2e2c8a57671)

Setelah memilih opsi login, user akan diminta memasukkan username dan password sesuai dengan peran yang dipilih. Jika data yang dimasukkan benar, sistem akan menampilkan output seperti pada gambar di atas. Namun, apabila terjadi kesalahan pada input, akan muncul pesan login gagal.

**Menu Admin**
--------------------------------------

![Screenshot 2025-04-29 224031](https://github.com/user-attachments/assets/8970a1c7-8e33-4fe9-b780-d5c2a39d5ae2)

Di menu admin ini, tersedia dua pilihan utama yang bisa dipilih, yaitu Saham dan Surat Berharga Negara (SBN).

**Menu Admin Tambah Saham**
----------------------------------------

![Screenshot 2025-04-29 224055](https://github.com/user-attachments/assets/570c0128-e202-4661-a57b-104e29d9f9aa)

![Screenshot 2025-04-29 224201](https://github.com/user-attachments/assets/739c29ad-4afa-4d21-9917-652b242a7b49)

![Screenshot 2025-04-29 224233](https://github.com/user-attachments/assets/ec601d32-b25b-4492-993e-d0b7146a1447)
![Screenshot 2025-04-29 224601](https://github.com/user-attachments/assets/04528316-6e45-459c-adc1-af483ac20700)

![Screenshot 2025-04-29 231039](https://github.com/user-attachments/assets/32c51217-6fcb-4808-8e84-789c8a5ae79d)

Jika admin memilih opsi menu saham, maka akan muncul pilihan untuk menambah saham atau mengubah harga saham. Jika memilih untuk menambah saham, admin akan diminta untuk memasukkan kode saham, nama perusahaan, dan harga saham yang akan ditambahkan.

**Menu Admin Ubah Harga Saham**
----------------------------------------

![Screenshot 2025-04-29 224954](https://github.com/user-attachments/assets/ef5caca6-5721-4c0a-bc49-3764ade25a15)

![Screenshot 2025-04-29 231140](https://github.com/user-attachments/assets/e59493de-3c01-4acb-8e28-076f7dae4c7f)

Pada menu ini, pengguna dapat memperbarui harga saham dengan cara memasukkan kode saham yang ingin diubah, diikuti dengan harga baru yang diinginkan.

**Menu Admin SBN**
----------------------------------------

![Screenshot 2025-04-29 231301](https://github.com/user-attachments/assets/869c32b0-9ff2-47d0-8c5e-3e991a1667b3)

![Screenshot 2025-04-29 231332](https://github.com/user-attachments/assets/b3859e4a-ed07-4143-8af9-88d5ec00c3ea)

![Screenshot 2025-04-29 231351](https://github.com/user-attachments/assets/77fbefa3-76d3-4e3d-a316-ec804ff5ac32)

![Screenshot 2025-04-29 231411](https://github.com/user-attachments/assets/9887f088-1f17-4d83-9a69-ac72b43e3567)

![Uploading Screenshot 2025-04-29 235854.jpg…]()

Apabila admin memilih opsi Surat Berharga Negara (SBN), maka akan muncul pilihan untuk menambahkan SBN baru, yang meliputi pengisian informasi seperti nama, bunga, jangka waktu, jatuh tempo, dan kuota nasional, sesuai dengan gambar di atas.

**Menu Customer**
----------------------------------------

![Screenshot 2025-04-29 225254](https://github.com/user-attachments/assets/981124b2-7a25-4e69-9c73-3f7ebbf3675e)

Di tahap menu customer, pengguna akan diberikan beberapa pilihan mengenai tindakan yang ingin dilakukan sebagai pelanggan.

**Menu Customer Beli Saham**
----------------------------------------

![Screenshot 2025-04-29 231752](https://github.com/user-attachments/assets/154e847e-4557-477f-9875-ffe9e5534deb)

![Screenshot 2025-04-29 231825](https://github.com/user-attachments/assets/630fbc78-dd7c-44f4-b6b5-f6e6cb39de12)

![Screenshot 2025-04-29 231914](https://github.com/user-attachments/assets/b7090781-59bf-4007-abef-fdc293ef3914)

Ketika customer ingin membeli saham, sistem akan menampilkan daftar saham yang tersedia. Untuk melakukan pembelian, customer cukup memasukkan kode saham dan jumlah lembar yang ingin dibeli.

**Menu Customer Jual Saham**
----------------------------------------

![Screenshot 2025-04-29 231934](https://github.com/user-attachments/assets/82c560d3-ea44-4a1e-969e-f804b038aa38)

![Screenshot 2025-04-29 231957](https://github.com/user-attachments/assets/9a6dfd30-90ef-41e8-9d8d-a3985c84b6e4)

![Screenshot 2025-04-29 232048](https://github.com/user-attachments/assets/c551182c-0698-4ba8-a495-a6f40e187286)

Jika customer berencana untuk menjual saham, sistem akan menampilkan terlebih dahulu daftar saham yang dimiliki. Setelah itu, customer perlu memasukkan kode saham dan jumlah lembar yang ingin dijual.

**Menu Customer Beli SBN**
----------------------------------------

![Screenshot 2025-04-29 232110](https://github.com/user-attachments/assets/3e98125e-c650-4820-9f53-c70b521dac12)

![Screenshot 2025-04-29 232142](https://github.com/user-attachments/assets/10e18d7c-da9d-4481-9b83-8fd3acabe13b)

![Screenshot 2025-04-29 232224](https://github.com/user-attachments/assets/23781dca-9854-490e-94aa-c9972c0844cc)

Di bagian pembelian SBN, customer juga dapat melihat daftar SBN yang tersedia untuk dibeli.

**Menu Customer Simulasi SBN**
----------------------------------------
![Screenshot 2025-04-29 232243](https://github.com/user-attachments/assets/cd0100d4-ce7d-43ae-8158-e08cd190ea3d)

![Screenshot 2025-04-29 232306](https://github.com/user-attachments/assets/21fe7bd9-a2f8-4538-aa37-f0de8b0a64b4)

![Screenshot 2025-04-29 232341](https://github.com/user-attachments/assets/0ded354c-d999-4722-bc0b-125c9fc35f96)

Customer dapat melihat simulasi SBN dengan memilih nama SBN dari daftar yang tersedia, kemudian memasukkan nominal investasi. Sistem akan menampilkan estimasi kupon yang akan diterima setiap bulan, seperti yang terlihat pada gambar di bawah.

**Menu Customer Portofolio**
----------------------------------------

![Screenshot 2025-04-29 232403](https://github.com/user-attachments/assets/06bff143-60d9-496e-8976-2dad0954dac6)

![Screenshot 2025-04-29 232422](https://github.com/user-attachments/assets/672134e5-1c95-498e-890a-11c8eb2237ca)

Pada menu portofolio, akan ditampilkan Saham dan SBN yang dimiliki oleh customer.

**Menu Logout**
----------------------------------------

![Screenshot 2025-04-29 232440](https://github.com/user-attachments/assets/9da673f2-6b40-484d-aaeb-feb6cef8ef31)

![Screenshot 2025-04-29 232500](https://github.com/user-attachments/assets/937200ae-f387-4db5-be25-4ddcf186f9e3)

![Screenshot 2025-04-30 000339](https://github.com/user-attachments/assets/a27c91ac-a7f4-45a7-ae56-d8bffbb000c0)

Saat user memutuskan untuk keluar dari program, mereka dapat memilih opsi logout terlebih dahulu, kemudian memilih untuk keluar dari program. Setelah itu, pesan seperti yang ditampilkan pada gambar di atas akan muncul.
