import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập bán kính
        System.out.print("Nhap ban kinh duong tron: ");
        double banKinh = scanner.nextDouble();

        // Tính chu vi và diện tích
        final double PI = 3.14159; // Giá trị xấp xỉ của số Pi
        double chuVi = 2 * PI * banKinh;
        double dienTich = PI * banKinh * banKinh;

        // Hiển thị kết quả
        System.out.printf("Chu vi hình tron la: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh tron la: %.2f\n", dienTich);

        scanner.close();
    }
}
