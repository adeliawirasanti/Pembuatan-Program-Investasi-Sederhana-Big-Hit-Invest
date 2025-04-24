import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Admin admin = new Admin("ADEL", "adel123");      // Admin: Adel
    private static final Customer customer = new Customer("MITA", "mita123"); // Customer: Mita

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
            clearScreen();
            tampilkanMenuAwal();

            System.out.print("Masukan pilihan : ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    if (loginAdmin()) {
                        AdminService.menuAdmin(scanner);
                    }
                    break;
                case "2":
                    if (loginCustomer()) {
                        CustomerService.menuCustomer(scanner, customer);
                    }
                    break;
                case "0":
                    System.out.println("Keluar dari program...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    tekanEnterUntukLanjut();
            }
        }

        scanner.close();
    }

    private static void tampilkanMenuAwal() {
        System.out.println("====================================================");
        System.out.println("||                  W E L C O M E                 ||");
        System.out.println("||                  LOGIN PAGE                   ||");
        System.out.println("====================================================");
        System.out.println("||  Pilih Tipe User Di bawah                     ||");
        System.out.println("||                                               ||");
        System.out.println("||  [1] Administrator                            ||");
        System.out.println("||  [2] Customer                                 ||");
        System.out.println("||  [0] Keluar Program                           ||");
        System.out.println("====================================================");
    }

    private static boolean loginAdmin() {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                    L O G I N                   ||");
        System.out.println("||  Mohon Masukkan Username dan Password         ||");
        System.out.println("====================================================");

        System.out.print("Masukkan username Anda: ");
        String uname = scanner.nextLine();
        System.out.print("Masukkan password Anda: ");
        String pass = scanner.nextLine();

        if (uname.equals(admin.getUsername()) && pass.equals(admin.getPassword())) {
            System.out.println("====================================================");
            System.out.println("||             Hallo Admin, Adel                 ||");
            System.out.println("||     Tekan Enter untuk melanjutkan...         ||");
            System.out.println("====================================================");
            tekanEnterUntukLanjut();
            return true;
        } else {
            System.out.println("Login gagal!");
            tekanEnterUntukLanjut();
            return false;
        }
    }

    private static boolean loginCustomer() {
        clearScreen();
        System.out.println("====================================================");
        System.out.println("||                    L O G I N                   ||");
        System.out.println("||  Mohon Masukkan Username dan Password         ||");
        System.out.println("====================================================");

        System.out.print("Masukkan username Anda: ");
        String uname = scanner.nextLine();
        System.out.print("Masukkan password Anda: ");
        String pass = scanner.nextLine();

        if (uname.equals(customer.getUsername()) && pass.equals(customer.getPassword())) {
            System.out.println("====================================================");
            System.out.println("||             Hallo Customer, Mita              ||");
            System.out.println("||     Tekan Enter untuk melanjutkan...         ||");
            System.out.println("====================================================");
            tekanEnterUntukLanjut();
            return true;
        } else {
            System.out.println("Login gagal!");
            tekanEnterUntukLanjut();
            return false;
        }
    }

    private static void tekanEnterUntukLanjut() {
        System.out.print("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
