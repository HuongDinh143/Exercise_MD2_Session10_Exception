package ra.exercise06;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập vào số phần tử trong mảng");
            int n = Integer.parseInt(scanner.nextLine());
            int sum = 0;
            if (n > 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println("Nhập vào phần tử thứ " + (i + 1));
                    String input = scanner.nextLine();
                    try {
                        int num = Integer.parseInt(input);
                        sum += num;

                    } catch (NumberFormatException e) {
                        System.err.println("Lỗi " + input + " không phải số nguyên");
                    } catch (Exception e) {
                        System.err.println("Lỗi không xác định");
                    }
                }
                System.out.println("Tổng các số nguyên trong mảng: " + sum);
            } else {
                System.err.println("Không có phần tử nào trong mảng");
            }
        } catch (NumberFormatException e) {
            System.err.println("Lỗi số nhập vào không phải số nguyên");
        }
    }
}
