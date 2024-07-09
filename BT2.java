import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tỷ giá USD sang VNĐ (bạn có thể cập nhật giá trị này)
        final double TY_GIA = 23500; // 1 USD = 23,500 VNĐ

        System.out.print("Nhap so tien USD: ");
        double soTienUSD = scanner.nextDouble();

        // Tính toán giá trị tiền VNĐ
        double soTienVND = soTienUSD * TY_GIA;

        System.out.printf("%.2f USD = %.2f VNĐ\n", soTienUSD, soTienVND);

        scanner.close();
    }
}
