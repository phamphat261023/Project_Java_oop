package project_oop;

import java.util.Scanner;

public class TestManage {
    public static void main(String[] args) {
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
            System.out.println("Continue or 0.Exit: ");
            choose = new Scanner(System.in).nextInt();
        }while(choose != 0);
    }

    public static void MenuStaff (){
        StaffManage staffManage = new StaffManage();
        while (true){
            System.out.println("------------- STAFF -------------");
            System.out.println("1. Import list staff");
            System.out.println("2. Print list staff");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    staffManage.importListStaff();
                    break;
                case 2:
                    staffManage.printListStaff();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public static void MenuEngineer (){
        EngineerManage engineerManage = new EngineerManage();
        while(true){
            System.out.println("------------- ENGINEER -------------");
            System.out.println("1. Import list engineer");
            System.out.println("2. Print list engineer");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    engineerManage.importListEngineer();
                    break;
                case 2:
                    engineerManage.printListEngineer();
                    break;
                case 0:
                    return;
                default:
                    break;
            }
        }
    }

    public static void MenuWorker (){
        WorkerManage workerManage = new WorkerManage();
        while(true){
            System.out.println("------------- WORKER -------------");
            System.out.println("1. Import list worker");
            System.out.println("2. Print list worker");
            System.out.println("0. Exit");
            System.out.println("Choose option: ");
            int choose = new Scanner(System.in).nextInt();

            switch (choose){
                case 1:
                    workerManage.importListWorker();
                    break;
                case 2:
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
