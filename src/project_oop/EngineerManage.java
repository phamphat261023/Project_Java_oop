package project_oop;

import java.io.*;
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

    public void printListEngineer () throws IOException, ClassNotFoundException {
        readFileEngineer();
        for(Engineer en : listEn){
            System.out.println(" " + en.toString());
        }
    }

    public void saveFileEngineer () throws IOException {
        FileOutputStream fout = new FileOutputStream("Engineer.dat");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(listEn);
        out.flush();
        out.close();
        fout.close();
    }

    public void readFileEngineer () throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("Engineer.dat");
        ObjectInputStream in = new ObjectInputStream(fin);
        listEn = new ArrayList<Engineer>();
        listEn = (ArrayList<Engineer>) in.readObject();
        in.close();
        fin.close();
    }

    public void insertEngineer (){
        System.out.println("Import n engineer need insert: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Engineer en = new Engineer();
            en.importEngineer();
            listEn.add(en);
        }
    }

    public void findEnginnerByName (){
        System.out.println("Import id need found: ");
        String name = sc.nextLine();
        Engineer foundEn = null;
        for(Engineer en : listEn){
            if(en.getName().equalsIgnoreCase(name)){
                foundEn = en;
                break;
            }
        }

        if(foundEn != null){
            System.out.println("Information engineer find by name: ");
            System.out.println("" + foundEn.toString());
        }
        else {
            System.out.println("Name not exist!!!");
        }
    }

    public void sortListEngineer (){
        for(int i = 0; i < listEn.size(); i++){
            for(int j = i+1; j < listEn.size(); j++){
                if(listEn.get(i).getName().equalsIgnoreCase(listEn.get(j).getName())){
                    Engineer tmp;
                    tmp = listEn.get(i);
                    listEn.set(i, listEn.get(j));
                    listEn.set(j, tmp);
                }
            }
        }
    }

    public void removeEngineerByName (){
        System.out.println("Import name engineer need remove: ");
        String name = sc.nextLine();
        Engineer removeEn = null;
        for(Engineer en : listEn){
            if(en.getName().equalsIgnoreCase(name)){
                removeEn = en;
                break;
            }
        }

        if(removeEn != null){
            listEn.remove(removeEn);
            System.out.println("Delete success....");
        }
        else{
            System.out.println("Name not exist, can't remove!!");
        }
    }

    public void editEngineer (){
        System.out.println("Inport name engineer need edit: ");
        String name = sc.nextLine();
        Engineer editEn = null;
        for (Engineer en : listEn){
            if(en.getName().equalsIgnoreCase(name)){
                editEn = en;
                break;
            }
        }

        if(editEn != null){
            System.out.println("Edit information engineer");
            System.out.println("Edit name: ");
            String nameEn = sc.nextLine();
            editEn.setName(nameEn);
            System.out.println("Edit gender: ");
            String gender = sc.nextLine();
            editEn.setGender(gender);
            System.out.println("Edit address: ");
            String address = sc.nextLine();
            editEn.setAddress(address);
            System.out.println("Edit age: ");
            int age = sc.nextInt();
            editEn.setAge(age);
        }
        else{
            System.out.println("Name not exist, can't edit!!!");
        }
    }
}
