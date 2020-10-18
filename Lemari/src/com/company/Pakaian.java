package com.company;

public abstract class Pakaian {
    private String merk;
    private String warna;

    String getWarna() {
        return warna;
    }

    void setWarna(String warna) {
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
}
