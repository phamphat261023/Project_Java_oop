package project_oop;

import java.io.Serializable;
import java.util.Scanner;

public class Worker extends Cadres implements levelInterface, Serializable {
    private int level;

    public Worker (){
        super();
    }

    public Worker(String name, int age, String gender, String address, int level) {
        super(name, age, gender, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void importWorker (){
        super.importCadres();
        Scanner sc = new Scanner(System.in);
        System.out.println("Level: ");
        while(true){
            System.out.println("a. Level 1");
            System.out.println("b. Level 2");
            System.out.println("c. Level 3");
            System.out.println("d. Level 4");
            System.out.println("e. Level 5");
            System.out.println("f. Exit");
            System.out.println("Choose level: ");
            int choose = sc.nextInt();

            switch(choose){
                case 1:
                    level = level1;
                    break;
                case 2:
                    level = level2;
                    break;
                case 3:
                    level = level3;
                    break;
                case 4:
                    level = level4;
                    break;
                case 5:
                    level = level5;
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
        return "Worker{" + super.toString() +
                "level=" + level +
                '}';
    }
}
