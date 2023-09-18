import java.util.Scanner;

public class GiamGia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tuổi khách hàng: ");
        int a = scanner.nextInt();
        System.out.println("Nhập tổng số tiền hóa đơn phải trả: ");
        int b = scanner.nextInt();

        System.out.println(checkGiamGia(a, b));

    }

    public static String checkGiamGia(int a, int b) {
        if (a <= 0 || b <= 0) {
            return "Input không hợp lệ";
        } else if (a < 7) {
            return "Miễn phí";
        } else if (b <= 2000000) {
            return "Không được giảm";
        } else if (b <= 3000000) {
            return "Giảm 10%";
        }
        return "Giảm 20%";
    }
}
