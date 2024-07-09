
import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap do dai canh hinh vuong: ");
        double canh = scanner.nextDouble();

        // Tính chu vi và diện tích
        double chuVi = 4 * canh;
        double dienTich = canh * canh;

        // Hiển thị kết quả
        System.out.printf("Chu vi hinh vuong: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh vuong: %.2f\n", dienTich);

        scanner.close();
    }
}
