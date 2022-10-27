package project_oop;

import java.io.Serializable;
import java.util.Scanner;

public class Engineer extends Cadres implements SpecializedInterface, Serializable {
    private String specialized;

    public Engineer (){
        super();
    }

    public Engineer(String name, int age, String gender, String address, String specialized) {
        super(name, age, gender, address);
        this.specialized = specialized;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }

    public void importEngineer (){
        super.importCadres();
        Scanner sc = new Scanner(System.in);
        System.out.println("Specialized: ");
        while (true){
            System.out.println("a. Information Technology");
            System.out.println("b. Technical");
            System.out.println("c. Artificial Interlligence");
            System.out.println("d. Exit");
            System.out.println("Choose specialized, please: ");
            int choose = sc.nextInt();

            switch (choose){
                case 1:
                    specialized = IT;
                    break;
                case 2:
                    specialized = Technical;
                    break;
                case 3:
                    specialized = AI;
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
        return "Engineer{" + super.toString() +
                "specialized='" + specialized + '\'' +
                '}';
    }
}
