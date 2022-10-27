package project_oop;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestManage {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int choose;
        do{
            System.out.println("------------ MANAGE CADRES -------------");
            System.out.println("1. Staff......");
            System.out.println("2. Enginerr.....");
            System.out.println("3. Worker......");
            System.out.println("0. Exit =>");
            System.out.println("Choose option: ");
            choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    MenuStaff();
                    break;
                case 2:
                    MenuEngineer();
                    break;
                case 3:
                    MenuWorker();
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while(choose != 0);
    }

    public static void MenuStaff () throws IOException, ClassNotFoundException {
        StaffManage staffManage = new StaffManage();
        ArrayList<Staff> listStaff = new ArrayList<>();
        while (true){
            System.out.println("------------- STAFF -------------");
            System.out.println("1. Import list staff");
            System.out.println("2. Print list staff");
            System.out.println("3. Inset list staff");
            System.out.println("4. Find staff by name");
            System.out.println("5. Sort list staff by name");
            System.out.println("6. Remove information staff by id");
            System.out.println("7. Edit information staff by id");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    staffManage.importListStaff();
                    staffManage.saveFileStaff();
                    break;
                case 2:
                    staffManage.printListStaff();
                    break;
                case 3:
                    staffManage.insertStaff();
                    staffManage.saveFileStaff();
                    System.out.println("List Staff after insert");
                    staffManage.printListStaff();
                    break;
                case 4:
                    staffManage.findNameStaff();
                    break;
                case 5:
                    staffManage.sortAgeStaff();
                    staffManage.saveFileStaff();
                    System.out.println("List staff after sort");
                    staffManage.printListStaff();
                    break;
                case 6:
                    staffManage.deleteStaffById();
                    staffManage.saveFileStaff();
                    System.out.println("List staff after delete");
                    staffManage.printListStaff();
                    break;
                case 7:
                    staffManage.editInfoStaffById();
                    staffManage.saveFileStaff();
                    System.out.println("Information staff after edit");
                    staffManage.printListStaff();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public static void MenuEngineer () throws IOException, ClassNotFoundException {
        EngineerManage engineerManage = new EngineerManage();
        while(true){
            System.out.println("------------- ENGINEER -------------");
            System.out.println("1. Import list engineer");
            System.out.println("2. Print list engineer");
            System.out.println("3. Inset list engineer");
            System.out.println("4. Find engineer by name");
            System.out.println("5. Sort list engineer by name");
            System.out.println("6. Remove information engineer by id");
            System.out.println("7. Edit information engineer by id");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    engineerManage.importListEngineer();
                    engineerManage.saveFileEngineer();
                    break;
                case 2:
                    engineerManage.printListEngineer();
                    break;
                case 3:
                    engineerManage.insertEngineer();
                    engineerManage.saveFileEngineer();
                    System.out.println("List engineer after insert");
                    engineerManage.printListEngineer();
                    break;
                case 4:
                    engineerManage.findEnginnerByName();
                    break;
                case 5:
                    engineerManage.sortListEngineer();
                    engineerManage.saveFileEngineer();
                    System.out.println("List engineer after sort");
                    engineerManage.printListEngineer();
                    break;
                case 6:
                    engineerManage.removeEngineerByName();
                    engineerManage.saveFileEngineer();
                    System.out.println("List engineer after remove");
                    engineerManage.printListEngineer();
                    break;
                case 7:
                    engineerManage.editEngineer();
                    engineerManage.saveFileEngineer();
                    System.out.println("Information engineer after edit");
                    engineerManage.printListEngineer();
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public static void MenuWorker () throws IOException, ClassNotFoundException {
        WorkerManage workerManage = new WorkerManage();
        while(true){
            System.out.println("------------- WORKER -------------");
            System.out.println("1. Import list worker");
            System.out.println("2. Print list worker");
            System.out.println("3. Inset list worker");
            System.out.println("4. Find worker by name");
            System.out.println("5. Sort list worker by name");
            System.out.println("6. Remove information worker by id");
            System.out.println("7. Edit information worker by id");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    workerManage.importListWorker();
                    break;
                case 2:
                    workerManage.printListWorker();
                    workerManage.saveFileWorker();
                    break;
                case 3:
                    workerManage.insertWorker();
                    workerManage.saveFileWorker();
                    System.out.println("List worker after insert: ");
                    workerManage.printListWorker();
                    break;
                case 4:
                    workerManage.findWorkerByName();
                    break;
                case 5:
                    workerManage.sortListWorker();
                    workerManage.saveFileWorker();
                    System.out.println("List worker after sort: ");
                    workerManage.printListWorker();
                    break;
                case 6:
                    workerManage.removeWorker();
                    workerManage.saveFileWorker();
                    System.out.println("List worker after remove: ");
                    workerManage.printListWorker();
                    break;
                case 7:
                    workerManage.editWorkerByName();
                    workerManage.saveFileWorker();
                    System.out.println("List woker after edit: ");
                    workerManage.printListWorker();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }
}
