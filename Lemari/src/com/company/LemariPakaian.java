package com.company;

import java.util.ArrayList;

public class LemariPakaian implements Lemari{
    private ArrayList<Baju> dataBaju = new ArrayList<>();
    private ArrayList<Celana> dataCelana = new ArrayList<>();

    void addItem(Baju baju){
        dataBaju.add(baju);
    }
    void addItem(Celana celana){
        dataCelana.add(celana);
    }

    void searchItem(String search) {
        int found = 0;
        for (Baju baju : dataBaju) {
            if (baju.getNamaBaju().toLowerCase().contains(search.toLowerCase())){
                found++;
                System.out.println("\nNama : " + baju.getNamaBaju());
                System.out.println("Warna : " + baju.getWarna());
                System.out.println("Merk : " + baju.getMerk());
            }
        }
        for (Celana celana : dataCelana) {
            if (celana.getNamaCelana().toLowerCase().contains(search.toLowerCase())){
                found++;
                System.out.println("\nNama : " + celana.getNamaCelana());
                System.out.println("Warna : " + celana.getWarna());
                System.out.println("Merk : " + celana.getMerk());
            }
        }
        if (found == 0){
            System.out.println("Pakaian tidak ditemukan");
        }
        System.out.println();
    }

    @Override
    public void listItem() {
        if (dataCelana.size() == 0 && dataBaju.size() == 0){
            System.out.println("Lemari Kosong");
        }else {
            System.out.print("----------- Isi Lemari -----------");
            for (Baju baju : dataBaju) {
                System.out.println("\nNama : " + baju.getNamaBaju());
                System.out.println("Warna : " + baju.getWarna());
                System.out.println("Merk : " + baju.getMerk());
            }
            for (Celana celana : dataCelana) {
                System.out.println("\nNama : " + celana.getNamaCelana());
                System.out.println("Warna : " + celana.getWarna());
                System.out.println("Merk : " + celana.getMerk());
            }
            System.out.println("-----------------------------------");
        }
    }
}
