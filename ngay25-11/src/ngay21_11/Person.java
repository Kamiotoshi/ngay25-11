package ngay21_11;
import java.util.Scanner;
import java.util.ArrayList;
public class Person {
    private String Name;
    private String Gender;
    private String Birthday;
    private String Address;
    public Person(){
        Name = "Mai";
        Gender = "Nu";
        Birthday = "21/11/2000";
        Address = "VN";
    }
    public Person(String Name, String Gender, String Birthday, String Address){
        this.Name = Name;
        this.Gender = Gender;
        this.Address = Address;
        this.Birthday = Birthday;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        this.Birthday = birthday;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin cá nhân:");

        System.out.println("Nhập tên:");
        String Name = scanner.nextLine();

        System.out.println("Nhập giới tính:");
        String Gender = scanner.nextLine();

        System.out.println("Nhập ngày sinh ");
        String Birthday = scanner.nextLine();

        System.out.println("Nhập địa chỉ:");
        String Address = scanner.nextLine();
    }
    public void Show(){
        System.out.println("Tên: " + Name);
        System.out.println("Giới tính: " + Gender);
        System.out.println("Ngày sinh: " + Birthday);
        System.out.println("Địa chỉ: " + Address);
    }
}
