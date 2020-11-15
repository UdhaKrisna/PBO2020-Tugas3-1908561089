package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MenyimpanPembalap implements Serializable {
    private PembalapF1 pembalapF1;
    public MenyimpanPembalap(String pembalapBaru) {
        if (pembalapBaru == null) {
            pembalapF1 = null;
        } else {
            pembalapF1 = new PembalapF1(pembalapBaru);
        }
    }

    public void laksanakan() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("pit_stop.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.pembalapF1);
            objectOutputStream.flush();
            objectOutputStream.close();

        } catch (Exception error) {
            error.printStackTrace();
        }
    }
}
