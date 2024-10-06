package ra.exercise04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateValid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào ngày ");
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(scanner.nextLine());
            System.out.println(date);
        } catch (ParseException pe) {
            System.err.println("Không đúng định dạng dd/MM/yyyy");
        } catch (Exception ex) {
            System.err.println("Có lỗi không xác định");
        }
    }
}
