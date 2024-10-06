package ra.exercise02;

import java.util.Scanner;

public class Sum {
    static int firstNumber;
    static int secondNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sumNumber(sc);
        System.out.printf("Tổng 2 số: %d + %d = %d: ", firstNumber, secondNumber, sum);
    }

    public static int sumNumber(Scanner sc) {
        do {
            try {
                System.out.println("Nhập vào số nguyên thứ 1: ");
                firstNumber = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập vào số nguyên thứ 2: ");
                secondNumber = Integer.parseInt(sc.nextLine());
                return firstNumber + secondNumber;
            } catch (NumberFormatException e) {
                System.err.println("Dữ liệu nhập vào không đúng định dạng, vui lòng nhập lại");
            }
        } while (true);

    }
}

