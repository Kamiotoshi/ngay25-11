package ngay21_11;
import java.util.Scanner;
import java.util.ArrayList;
public class Student extends Person{
    private String ID;
    private double point;
    private String email;
    public Student() {
        ID = "M566";
        point = 10;
        email = "gkjgk@gmail.com";

    }
    public Student(String Name, String Gender, String Birthday, String Address, String ID, double point, String email) {
        super(Name, Gender, Birthday, Address);
        this.ID = ID;
        this.point = point;
        this.email = email;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID sinh vin: ");
        this.ID = scanner.nextLine();
        System.out.println("Nhập điểm: ");
        this.point = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Nhập email: ");
        this.email = scanner.nextLine();
    }
    @Override
    public void Show() {
        super.Show();
        System.out.println("ID Sinh viên: " + ID);
        System.out.println("Điểm kiểm tra: " + point);
        System.out.println("Email: " + email);
    }
    public boolean Requiredpoint() {
        return point > 8.0;
    }

}
