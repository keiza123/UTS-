package com.company;

public class Celana extends Pakaian{
    private String namaCelana;

    Celana(String namaCelana, String warna, String merk) {
        this.namaCelana = namaCelana;
        setWarna(warna);
        setMerk(merk);
    }

    Celana(String namaCelana, String warna) {
        this(namaCelana, warna, "-");
    }

    String getNamaCelana() {
        return namaCelana;
    }

    @Override
    public String getMerk() {
        return super.getMerk();
    }

    @Override
    public void setMerk(String merk) {
        super.setMerk(merk);
    }
}
