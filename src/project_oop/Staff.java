package project_oop;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Staff extends Cadres implements JobInterface, Serializable {
    private String Id;
    private String job;

    ArrayList<Staff> listStaff = new ArrayList<>();

    public Staff() {
        super();
    }

    public Staff(String name, int age, String gender, String address, String id, String job) {
        super(name, age, gender, address);
        this.Id = id;
        this.job = job;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void importStaff (){
        super.importCadres();
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        Id = sc.nextLine();
        System.out.println("Job: ");
        while (true){
            System.out.println("a. Dev Front end");
            System.out.println("b. Dev Back end");
            System.out.println("c. Dev Full stack");
            System.out.println("d. Exit");
            System.out.println("Choose job, please: ");
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    job = FrontEnd;
                    break;
                case 2:
                    job = Backend;
                    break;
                case 3:
                    job = FullStack;
                    break;
                case 0:
                   return;
                default:
                    break;
            }
        }
    }

    @Override
    public String toString() {
        return "Staff{" + super.toString() +
                "Id='" + Id + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
