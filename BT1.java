import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tên người dùng
        System.out.print("Vui long nhap ten cua ban: ");
        String ten = scanner.nextLine();

        // Hiển thị lời chào
        System.out.println("Hello: " + ten + "!");

        scanner.close();
    }
}