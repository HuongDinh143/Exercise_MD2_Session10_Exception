package ra.exercise05;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String input = scanner.nextLine();
        int length = input.trim().length();
        if(length==0){
            throw new IllegalArgumentException("Chuỗi không hợp lệ");
        }
        String reversed = "";
        for (int i = length - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Chuỗi đảo ngược: " + reversed);
        scanner.close();
    }
}
