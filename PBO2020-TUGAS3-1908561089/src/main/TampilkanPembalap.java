package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TampilkanPembalap {
    public static PembalapF1 tampilkanPembalap() {
        PembalapF1 pembalapF1 = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("pit_stop.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            pembalapF1 = (PembalapF1) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return pembalapF1;
    }
}
