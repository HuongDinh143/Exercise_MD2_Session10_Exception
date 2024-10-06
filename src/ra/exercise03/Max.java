package ra.exercise03;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vào số lượng phần tử của mảng");
            int n = Integer.parseInt(sc.nextLine());

            if (n <= 0) {
                throw new IllegalArgumentException("Không có phần tử nào trong mảng.");
            }
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhập số thứ %d: \n", i + 1);
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Số lớn nhất trong mảng là: " + max);

        }catch (NumberFormatException e) {
            System.err.println("Lỗi định dạng dữ liệu đầu vào");
        }

    }
}


