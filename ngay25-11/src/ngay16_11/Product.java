package ngay16_11;
public class Product {
    // Các thuộc tính
    private String maSanPham;
    private String tenSanPham;
    private double giaTien;
    private int soLuong;
    private String donVi;

    // Constructor
    public Product(String maSanPham, String tenSanPham, double giaTien, int soLuong, String donVi) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
        this.donVi = donVi;
    }

    // Phương thức tăng số lượng sản phẩm
    public void tangSoLuong(int soLuongThem) {
        this.soLuong += soLuongThem;
    }

    // Phương thức giảm số lượng sản phẩm
    public void giamSoLuong(int soLuongGiam) {
        if (soLuongGiam > this.soLuong) {
            System.out.println("Số lượng giảm lớn hơn số lượng hiện có.");
        } else {
            this.soLuong -= soLuongGiam;
        }
    }

    // Phương thức thay đổi giá tiền sản phẩm
    public void thayDoiGiaTien(double giaTienMoi) {
        this.giaTien = giaTienMoi;
    }

    // Phương thức kiểm tra hàng còn/hết hàng
    public void kiemTraHang() {
        if (soLuong > 0) {
            System.out.println("Còn hàng. Số lượng hiện tại: " + soLuong);
        } else {
            System.out.println("Hết hàng.");
        }
    }

    // Phương thức in thông tin sản phẩm
    public void inThongTinSanPham() {
        System.out.println("Mã sản phẩm: " + maSanPham);
        System.out.println("Tên sản phẩm: " + tenSanPham);
        System.out.println("Giá tiền: " + giaTien + " " + donVi);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn vị: " + donVi);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        // Tạo 3 sản phẩm
        Product product1 = new Product("SP001", "Laptop", 1200.0, 10, "USD");
        Product product2 = new Product("SP002", "Smartphone", 500.0, 20, "USD");
        Product product3 = new Product("SP003", "Mouse", 20.0, 50, "VND");

        // In thông tin sản phẩm
        product1.inThongTinSanPham();
        product2.inThongTinSanPham();
        product3.inThongTinSanPham();

        // Thực hiện một số thay đổi và in lại thông tin
        product1.tangSoLuong(5);
        product2.giamSoLuong(15);
        product3.thayDoiGiaTien(25.0);

        // In lại thông tin sau khi thay đổi
        product1.inThongTinSanPham();
        product2.inThongTinSanPham();
        product3.inThongTinSanPham();

        // Kiểm tra tình trạng hàng
        product1.kiemTraHang();
        product2.kiemTraHang();
        product3.kiemTraHang();
    }
}

