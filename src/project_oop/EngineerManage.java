package project_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class EngineerManage {
    ArrayList<Engineer> listEn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void importListEngineer (){
        System.out.println("Import n engineer: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Engineer en = new Engineer();
            en.importEngineer();
            listEn.add(en);
        }
    }

    public void printListEngineer (){
        for(Engineer en : listEn){
            System.out.println(" " + en.toString());
        }
    }
}
