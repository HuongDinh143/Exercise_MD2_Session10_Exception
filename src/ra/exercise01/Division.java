package ra.exercise01;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Nhập số nguyên thứ nhất");
            ;
            number1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập số nguyên thứ hai");
            number2 = Integer.parseInt(scanner.nextLine());
            int div = number1 / number2;
            System.out.printf("Kết quả phép chia %d cho %d là: %d\n", number1, number2, div);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi dữ liệu nhập vào không đúng định dạng");
        } catch (ArithmeticException e) {
            System.out.println("Lỗi chia cho 0 trong phép chia");
        } catch (Exception e) {
            System.out.println("Lỗi không xác định");
        }finally {
            System.out.println("Chương trình kết thúc");
        }


    }
}
