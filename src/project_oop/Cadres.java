package project_oop;

/**
 *  Đề bài: 1 đơn vị sản xuất gồm gồm có các cán bộ là công nhân, kỹ sư, nhân viên. Mỗi cán bộ cần
 *  quản lý các dữ liệu: Họ tên, tuổi, giới tính, ịa chỉ
 *  - Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc từ 1 đến 10
 *  - Cấp kỹ sư có thuộc tính riêng: Ngành đào tạo
 *  - Các nhân viên có thuộc tính riêng: Công việc
 * *Y/C:
 * - Xây dựng các lớp ConhNhan, KySu, NhanVien kế thừa lớp CanBo
 * - Xây dựng lớp QLCanBo cài đặt các phương thức thực hiện các chức năng sau:
 * + Thêm mới cán bộ
 * + Tìm kếm theo họ tên
 * + Hiển thị thông tin danh sách cán bộ
 * + Thoát khỏi trương trình
 * */

import java.util.Scanner;

public class Cadres {
    private String name;
    private int age;
    private String gender;
    private String address;

    public Cadres (){

    }

    public Cadres(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void importCadres (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Gender: ");
        gender = sc.nextLine();
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gender: '" + gender + '\'' +
                ", address: '" + address + '\'' +
                '}';
    }
}
