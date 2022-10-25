package project_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffManage {
    ArrayList<Staff> listStaff = new ArrayList<>();
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

    public void printListStaff (){
        for(Staff st : listStaff){
            System.out.println(" "+st.toString());
        }
    }
}
