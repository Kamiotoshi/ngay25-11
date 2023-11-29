package ngay21_11;
import java.util.Scanner;
import java.util.ArrayList;
public class GiaoVien extends Person{
    private ArrayList<String> classesTeaching; //Danh sách lớp giảng dạy
    private double salary; //mức lương
    private int numberOfSubjects; //số môn giảng dạy
    private ArrayList<String> subjectsTeaching; //các môn giảng dạy

    public GiaoVien() {
        classesTeaching = new ArrayList<>();
        subjectsTeaching = new ArrayList<>();
    }
    public GiaoVien(String Name, String Gender, String Birthday, String Address, ArrayList<String> classesTeaching, double salary, int numberOfSubjects, ArrayList<String> subjectsTeaching) {
        super(Name, Gender, Birthday, Address);
        this.classesTeaching = classesTeaching;
        this.salary = salary;
        this.numberOfSubjects = numberOfSubjects;
        this.subjectsTeaching = subjectsTeaching;
    }
    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lớp giảng dạy: ");
        int numClasses = scanner.nextInt();
        scanner.nextLine(); // Để khi kích hoạt for thì nó sẽ lưu tất cả nhập lẫn tên lớp
        for (int i = 0; i < numClasses; i++) {
            System.out.println("Nhập tên lớp " + (i + 1) + ": ");
            String className = scanner.nextLine();
            classesTeaching.add(className);
        }
        System.out.println("Nhập mức lương: ");
        this.salary = scanner.nextDouble();
        scanner.nextLine(); // Lưu số môn dạy

        System.out.println("Nhập số môn giảng dạy: ");
        this.numberOfSubjects = scanner.nextInt();
        scanner.nextLine(); // Lưu tên môn và số lượng
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Nhập tên môn " + (i + 1) + ": ");
            String subject = scanner.nextLine();
            subjectsTeaching.add(subject);
        }
    }
    @Override
    public void Show() {
        super.Show();

        System.out.println("Danh sách lớp giảng dạy: ");
        for (String className : classesTeaching) {
            System.out.println(className);
        }

        System.out.println("Mức lương: " + salary);
        System.out.println("Số môn giảng dạy: " + numberOfSubjects);
        System.out.println("Các môn giảng dạy: ");
        for (String subject : subjectsTeaching) {
            System.out.println(subject);
        }
    }
}
