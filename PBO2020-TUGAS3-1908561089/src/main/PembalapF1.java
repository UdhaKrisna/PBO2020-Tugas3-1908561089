package main;

import java.io.Serializable;

public class PembalapF1 implements Serializable {
    private String namaPembalap;

    public PembalapF1(String namaPembalap) {
        this.namaPembalap = namaPembalap;
    }

    public String getNamaPembalap() {
        return namaPembalap;
    }
}
