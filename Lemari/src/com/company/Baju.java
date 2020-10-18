package com.company;

public class Baju extends Pakaian {
    private String namaBaju;

    Baju(String namaBaju, String warna, String merk) {
        this.namaBaju = namaBaju;
        setWarna(warna);
        setMerk(merk);
    }

    Baju(String namaBaju, String warna) {
        this(namaBaju, warna, "-");
    }

    String getNamaBaju() {
        return namaBaju;
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
