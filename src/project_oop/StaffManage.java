package project_oop;

import java.io.*;
import java.util.*;

public class StaffManage {
    ArrayList<Staff> listStaff = new ArrayList<>();
    public static final String Fname = "Staff.dat";
    Scanner sc = new Scanner(System.in);
    public void importListStaff (){
        System.out.println("Import n staff: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Staff st = new Staff();
            st.importStaff();
            listStaff.add(st);
        }
    }

    public void saveFileStaff () throws IOException {
        FileOutputStream fout = new FileOutputStream("Staff.dat");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(listStaff);
        out.flush();
        out.close();
        fout.close();
    }

    public void readFileStaff () throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream("Staff.dat");
        ObjectInputStream in = new ObjectInputStream(fin);
        listStaff = new ArrayList<Staff>();
        listStaff = (ArrayList<Staff>) in.readObject();
        in.close();
        fin.close();
    }

    public void printListStaff () throws IOException, ClassNotFoundException {
        readFileStaff();
        for(Staff st : listStaff){
            System.out.println(" "+st.toString());
        }
    }

    public void insertStaff () {
        System.out.println("Import n staff need add: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            Staff st = new Staff();
            st.importStaff();
            listStaff.add(st);
        }
    }

    public void findNameStaff (){
        System.out.println("Import name search: ");
        String name = sc.nextLine();
        Staff foundName = null;
        for(Staff st : listStaff){
            if (st.getName().equalsIgnoreCase(name)){
               foundName = st;
               break;
            }
        }

        if(foundName != null){
            System.out.println("Imformation staff find by name: ");
            System.out.println("" + foundName.toString());
        }
        else{
            System.out.println("Name staff not exist!!!");
        }
    }

    public void sortAgeStaff () {
        for(int i = 0; i < listStaff.size(); i++){
            for(int j = i+1; j < listStaff.size(); j++){
                if(listStaff.get(j).getAge() < listStaff.get(i).getAge()){
                    Staff tmp ;
                    tmp = listStaff.get(i);
                    listStaff.set(i, listStaff.get(j));
                    listStaff.set(j, tmp);
                }
            }
        }
    }

    public void deleteStaffById () {
        System.out.println("Import id need delete: ");
        String id = sc.nextLine();
        Staff deleteStaff = null;
        for(Staff st : listStaff){
            if(st.getId().equalsIgnoreCase(id)){
                deleteStaff = st;
                break;
            }
        }

        if(deleteStaff != null){
            listStaff.remove(deleteStaff);
            System.out.println("Staff deleted....");
        }
        else{
            System.out.println("Staff id not exist, can't remove!!");
        }
    }

    public void editInfoStaffById () {
        System.out.println("Import id staff need edit: ");
        String id = sc.nextLine();
        Staff editStaff = null;
        for(Staff st : listStaff){
            if(st.getId().equalsIgnoreCase(id)){
                editStaff = st;
                break;
            }
        }

        if(editStaff != null){
            System.out.println("Edit information staff: ");
            System.out.println("Edit name: ");
            String name = sc.nextLine();
            editStaff.setName(name);
            System.out.println("Edit gender: ");
            String gender = sc.nextLine();
            editStaff.setGender(gender);
            System.out.println("Edit address: ");
            String address = sc.nextLine();
            editStaff.setAddress(address);
            System.out.println("Edit age: ");
            int age = sc.nextInt();
            editStaff.setAge(age);
        }
        else {
            System.out.println("Id is not exist, can't edit!!!");
        }
    }
}
