package ngay21_11;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Nhập thông tin sinh viên:");
        student.Input();
        System.out.println("\nThông tin sinh viên:");
        student.Show();
        System.out.println("Đủ điều kiện được học bông : " + student.Requiredpoint());

        System.out.println("\n-----------------------\n");

        GiaoVien teacher = new GiaoVien();
        System.out.println("Nhập thông tin giáo viên:");
        teacher.Input();
        System.out.println("\nThông tin giáo viên:");
        teacher.Show();

    }
}