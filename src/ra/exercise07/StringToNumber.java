package ra.exercise07;

import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String input = scanner.nextLine();
        int lengthInput = input.length();
        int[] numbers = new int[lengthInput];
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                numbers[i] = Integer.parseInt(input.charAt(i)+"");
            }else {
                numbers[i] = 0;
            }
        }
        for (int i = 0; i < lengthInput; i++) {
            System.out.print(numbers[i] + " ");
        }
    }


}
