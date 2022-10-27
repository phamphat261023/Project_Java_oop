package project_oop;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerManage {
    ArrayList<Worker> listWk = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void importListWorker (){
        System.out.println("Import n worker: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Worker wk = new Worker();
            wk.importWorker();
            listWk.add(wk);
        }
    }

    public void saveFileWorker () throws IOException {
        FileOutputStream fout = new FileOutputStream("Worker.dat");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(listWk);
        out.flush();
        out.close();
        fout.close();
    }

    public void readFileWorker () throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("Worker.dat");
        ObjectInputStream in = new ObjectInputStream(fin);
        listWk = new ArrayList<Worker>();
        listWk = (ArrayList<Worker>) in.readObject();
        in.close();
        fin.close();
    }

    public void printListWorker () throws IOException, ClassNotFoundException {
        readFileWorker();
        for(Worker wk : listWk){
            System.out.println(" " + wk.toString());
        }
    }

    public void insertWorker (){
        System.out.println("Import n worker need insert: ");
        int n = sc.nextInt();
        for( int i = 0; i < listWk.size(); i++){
            Worker wk = new Worker();
            wk.importWorker();
            listWk.add(wk);
        }
    }

    public void findWorkerByName (){
        System.out.println("Import name search: ");
        String name = sc.nextLine();
        Worker foundName = null;
        for(Worker wk : listWk){
            if (wk.getName().equalsIgnoreCase(name)){
                foundName = wk;
                break;
            }
        }

        if(foundName != null){
            System.out.println("Imformation worker find by name: ");
            System.out.println("" + foundName.toString());
        }
        else{
            System.out.println("Name worker not exist!!!");
        }
    }

    public void sortListWorker (){
        for(int i = 0; i < listWk.size(); i++){
            for(int j = i+1; j < listWk.size(); j++){
                if(listWk.get(i).getName().equalsIgnoreCase(listWk.get(j).getName())){
                    Worker tmp;
                    tmp = listWk.get(i);
                    listWk.set(i, listWk.get(j));
                    listWk.set(j, tmp);
                }
            }
        }
    }

    public void removeWorker (){
        System.out.println("Import name worker need remove: ");
        String name = sc.nextLine();
        Worker removeWk = null;
        for(Worker wk : listWk){
            if(wk.getName().equalsIgnoreCase(name)){
                removeWk = wk;
                break;
            }
        }

        if(removeWk != null){
            listWk.remove(removeWk);
            System.out.println("Delete success.....");
        }
        else{
            System.out.println("Name not exist, can't remove!!");
        }
    }

    public void editWorkerByName (){
        System.out.println("Import name worker need edit: ");
        String name = sc.nextLine();
        Worker editWk = null;
        for(Worker wk : listWk){
            if(wk.getName().equalsIgnoreCase(name)){
                editWk = wk;
                break;
            }
        }

        if(editWk != null){
            System.out.println("Edit information worker");
            System.out.println("Edit name: ");
            String nameWk = sc.nextLine();
            editWk.setName(nameWk);
            System.out.println("Edit gender: ");
            String gender = sc.nextLine();
            editWk.setGender(gender);
            System.out.println("Edit address: ");
            String address = sc.nextLine();
            editWk.setAddress(address);
            System.out.println("Edit age: ");
            int age = sc.nextInt();
            editWk.setAge(age);
        }
        else {
            System.out.println("Name not exist, can't edit!!");
        }
    }
}
