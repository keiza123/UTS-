package com.company;

import java.util.Scanner;

public class Main {
    private static LemariPakaian lemariPakaian = new LemariPakaian();
    private static Scanner numInput = new Scanner(System.in);
    private static Scanner strInput = new Scanner(System.in);

    public static void main(String[] args) {
        int menu;

        // Data dummy
        lemariPakaian.addItem(new Baju("Kaos Oblong", "Putih"));
        lemariPakaian.addItem(new Baju("Kemeja Sekolah", "Merah", "Calvin Klein"));
        lemariPakaian.addItem(new Baju("Kaos Summer Black", "Hitam", "Erigo"));
        lemariPakaian.addItem(new Baju("Celana jeans", "Biru", "Lois"));

        do {
            runMenu();
            menu = numInput.nextInt();
            switch (menu) {
                case 1:
                    pakaianMenu();
                    menu = numInput.nextInt();
                    if (menu == 1)
                        tambahBaju();
                    else if (menu == 2)
                        tambahCelana();
                    else
                        System.err.println("Pilihan tidak tersedia");
                    break;
                case 2:
                    System.out.println("---->");
                    System.out.print("Masukkan nama pakaian : ");
                    String cari = strInput.nextLine();
                    lemariPakaian.searchItem(cari);
                    break;
                case 3:
                    lemariPakaian.listItem();
                    break;
                case 4:
                    System.out.println("Keluar");
                    break;
                default:
                    System.err.println("Menu tidak ada !");
            }
        } while (menu != 4);
    }

    private static void runMenu() {
        System.out.println("========== Lemari Pakaian ==========");
        System.out.println("| 1. Masukkan Pakaian              |");
        System.out.println("| 2. Cari Pakaian                  |");
        System.out.println("| 3. Lihat isi lemari              |");
        System.out.println("| 4. Keluar                        |");
        System.out.println("====================================");
        System.out.print("Pilih : ");
    }

    private static void pakaianMenu() {
        System.out.println("---->");
        System.out.println("Masukkan Pakaian");
        System.out.println("1. Baju");
        System.out.println("2. Celana");
        System.out.print("Pilih : ");
    }

    private static void tambahBaju() {
        System.out.print("Masukkan Nama Baju  (required) : ");
        String namaBaju = strInput.nextLine();
        System.out.print("Masukkan Warna      (required) : ");
        String warnaBaju = strInput.nextLine();
        System.out.print("Masukkan Merk  (enter to skip) : ");
        String merkBaju = strInput.nextLine();

        if (merkBaju.equals("")) {
            lemariPakaian.addItem(new Baju(namaBaju, warnaBaju));
        } else {
            lemariPakaian.addItem(new Baju(namaBaju, warnaBaju, merkBaju));
        }
    }

    private static void tambahCelana() {
        System.out.print("Masukkan Nama Celana (required) : ");
        String namaBaju = strInput.nextLine();
        System.out.print("Masukkan Warna       (required) : ");
        String warnaBaju = strInput.nextLine();
        System.out.print("Masukkan Merk   (enter to skip) : ");
        String merkBaju = strInput.nextLine();

        if (merkBaju.equals("")) {
            lemariPakaian.addItem(new Celana(namaBaju, warnaBaju));
        } else {
            lemariPakaian.addItem(new Celana(namaBaju, warnaBaju, merkBaju));
        }
    }
}

