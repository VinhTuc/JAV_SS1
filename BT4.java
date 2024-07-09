import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm ba môn
        System.out.print("Nhap diem TOAN: ");
        double diemToan = scanner.nextDouble();

        System.out.print("Nhap diem VAN: ");
        double diemVan = scanner.nextDouble();

        System.out.print("Nhap diem ANH: ");
        double diemAnh = scanner.nextDouble();

        // Tính điểm trung bình cộng
        double diemTrungBinh = (diemToan + diemVan + diemAnh) / 3;

        // Hiển thị kết quả
        System.out.printf("Diem trung binh cong cua 3 mon la: %.2f\n", diemTrungBinh);

        scanner.close();
    }
}
