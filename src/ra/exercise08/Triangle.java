package ra.exercise08;

import java.util.Scanner;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh bất kỳ phải lớn hơn cạnh còn lại");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập vào chiều dài cạnh thứ nhất:");
            double side1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào chiều dài cạnh thứ hai:");
            double side2 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập vào cạnh thứ ba:");
            double side3 = Integer.parseInt(sc.nextLine());

            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Ba cạnh của tam giác là" + side1 + " " + side2 + " " + side3);
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi dữ liệu nhập vào không tạo được tam giác");

        }catch (NumberFormatException e) {
            System.err.println("Lỗi: dữ liệu dầu vào");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}

