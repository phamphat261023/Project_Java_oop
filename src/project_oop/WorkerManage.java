package project_oop;

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

    public void printListWorker (){
        for(Worker wk : listWk){
            System.out.println(" " + wk.toString());
        }
    }
}
