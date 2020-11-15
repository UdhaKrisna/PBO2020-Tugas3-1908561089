package main;

import java.util.Scanner;

public class Program {
    private final Scanner scanner;

    public Program() {
        scanner = new Scanner(System.in);
    }

    public void run() {
        int userMenu;
        do {
            userMenu = this.getIntegerInput("\n\nNama: I Ketut Gede Udha Krisna Yasa\nNIM: 1908561089\nMENU\n1. Cek Pembalap\n2. Ganti Pembalap\n3. Reset Data Pembalap\n4. Quit\nPilihan: ");
            this.processMenu(userMenu);
        } while(userMenu != 4);
    }

    private void processMenu(int menu) {
        switch (menu) {
            case 1:
                PembalapF1 pembalapF1 = TampilkanPembalap.tampilkanPembalap();
                if (pembalapF1 != null) {
                    System.out.println("Pembalap : " + pembalapF1.getNamaPembalap());
                } else {
                    System.out.println("Mohon diisi terlebih dahulu!");
                }
                break;
            case 2:
                MenyimpanPembalap menyimpanPembalap = new MenyimpanPembalap(getInputPembalap("Siapa nama pembalap anda inginkan?2: "));
                menyimpanPembalap.laksanakan();
                break;
            case 3:
                MenyimpanPembalap menyimpanPembalap1 = new MenyimpanPembalap(null);
                menyimpanPembalap1.laksanakan();
                break;
            case 4:
                break;
            default:
                System.out.println("Mohon maaf anda nomor sambung");
                break;
        }
    }

    private int getIntegerInput(String message) {
        System.out.println(message);
        int buffer = scanner.nextInt();
        scanner.nextLine();
        return buffer;
    }

    private String getInputPembalap(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
