package ngay18_11;
import java.util.Scanner;
public class Fraction {
    int Tuso;
    int Mauso;

    public Fraction(){
        this.Tuso = 0;
        this.Mauso = 1;
    }

    public Fraction(int Tuso, int Mauso) {
        if (Mauso == 0) {
            System.out.println("Mẫu số không thể là 0");
            return;
        }
        this.Tuso = Tuso;
        this.Mauso = Mauso;
    }

    public void setTuso(int tuso) {
        this.Tuso = tuso;
    }

    public int getTuso() {
        return Tuso;
    }

    public void setMauso(int mauso) {
        if (Mauso != 0) {
            this.Mauso = mauso;
        } else {
            System.out.println("Mẫu số không thể là 0");
        }

    }

    public int getMauso() {

        return Mauso;
    }

    public void Nhapso() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tử số");
        int tuso = scanner.nextInt();
        System.out.println("Nhập mẫu số");
        int mauso = scanner.nextInt();

        if (mauso != 0) {
            Tuso = tuso;
            Mauso = mauso;
        } else {
            System.out.println("Mẫu số không thể là 0");
        }
    }

    //in phân so
    public void Phanso() {
        System.out.println(Tuso + "/" + Mauso);
    }

    // Nghịch đảo phân số
    public Fraction inverse() {
        if (Tuso != 0) {
            return new Fraction(Mauso, Tuso);
        } else {
            System.out.println("Không thể đảo ngược khi tử số bằng 0");
            return null;
        }
    }

    // Cộng hai phân số
    public Fraction add(Fraction other) {
        int TusoCong = this.Tuso * other.Mauso + other.Tuso * this.Mauso;
        int MausoCong = this.Mauso * other.Mauso;
        return new Fraction(TusoCong, MausoCong);
    }

    // Trừ hai phân số
    public Fraction sub(Fraction other) {
        int TusoTru = this.Tuso * other.Mauso - other.Tuso * this.Mauso;
        int MausoTru = this.Mauso * other.Mauso;
        return new Fraction(TusoTru, MausoTru);
    }

    // Nhân hai phân số
    public Fraction mul(Fraction other) {
        int TusoNhan = this.Tuso * other.Tuso;
        int MausoNhan = this.Mauso * other.Mauso;
        return new Fraction(TusoNhan, MausoNhan);
    }

    // Chia hai phân số
    public Fraction div(Fraction other) {
        if (other.Tuso != 0) {
            int TusoChia = this.Tuso * other.Mauso;
            int MausoChia = this.Mauso * other.Tuso;
            return new Fraction(TusoChia, MausoChia);
        } else {
            System.out.println("Không thể chia cho 0");
            return null;
        }
    }

    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        // Test các phương thức
        System.out.println("Fraction 1: ");
        fraction1.Phanso();

        System.out.println("Fraction 2: ");
        fraction2.Phanso();

        Fraction sum = fraction1.add(fraction2);
        System.out.println("Cộng 2 phân số: ");
        sum.Phanso();

        Fraction difference = fraction1.sub(fraction2);
        System.out.println("Trừ 2 phân số: ");
        difference.Phanso();


        Fraction product = fraction1.mul(fraction2);
        System.out.println("Nhân hai phân số: ");
        product.Phanso();

        Fraction quotient = fraction1.div(fraction2);
        System.out.println("Chia hai phân số: ");
        quotient.Phanso();
    }
}
