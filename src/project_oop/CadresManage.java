package project_oop;

import java.io.*;
import java.util.ArrayList;

public class CadresManage {

    ArrayList<Cadres> listCard = new ArrayList<>();
    public void saveFileCadres () throws IOException {
        FileOutputStream fout = new FileOutputStream("Cadres.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(listCard);
        out.flush();
        out.close();
        fout.close();
    }

    public void readFileCadres () throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("Cadres.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        listCard = new ArrayList<Cadres>();
        listCard = (ArrayList<Cadres>) in.readObject();
        in.close();
        fin.close();
    }
}
