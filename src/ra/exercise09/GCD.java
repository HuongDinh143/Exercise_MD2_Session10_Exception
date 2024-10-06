package ra.exercise09;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Nhập vào số thứ nhất");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào số thứ hai");
            int b = Integer.parseInt(sc.nextLine());
            if(a==0 && b==0){
                System.err.println("Lỗi: không thể tìm ước chung của hai số bằng 0 ");
            }else {
                int gcd = findGcd(a,b);
                System.out.printf("Ước số chung lớn nhất của %d và %d là %d",a,b,gcd);
            }
        }catch (NumberFormatException e){
            System.err.println("Lỗi: giá trị nhập vào không phải là số nguyên");
        }catch (Exception e){
            System.err.println("Lỗi không xác định");
        }

    }

    public static int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);
    }
}
