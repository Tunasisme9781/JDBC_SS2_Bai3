
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String choice = "1";
//
        while (choice.equals("1")) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số tháng trong năm: ");
            int n = Integer.parseInt(sc.nextLine());
            do {

                if (n<1 || n>12) {
                    System.out.println("Số tháng không hợp lệ! Nhập lại: ");
                    n = Integer.parseInt(sc.nextLine());
                }
            }while(n<1 || n>12);

            switch (n) {
                case 1:
                    System.out.printf("Tháng %d có 31 ngày",n); break;
                case 2:
                    System.out.printf("Tháng %d có 28 hoặc 29 ngày",n);break;
                case 3:
                    System.out.printf("Tháng %d có 31 ngày",n);break;
                case 4:
                    System.out.printf("Tháng %d có 30 ngày",n);break;
                case 5:
                    System.out.printf("Tháng %d có 31 ngày",n);break;
                case 6:
                    System.out.printf("Tháng %d có 30 ngày",n);break;
                case 7:
                    System.out.printf("Tháng %d có 31 ngày",n);break;
                case 8:
                    System.out.printf("Tháng %d có 31 ngày",n);break;
                case 9:
                    System.out.printf("Tháng %d có 30 ngày",n);break;
                case 10:
                    System.out.printf("Tháng %d có 31 ngày",n);break;
                case 11:
                    System.out.printf("Tháng %d có 30 ngày",n);break;
                case 12:
                    System.out.printf("Tháng %d có 31 ngày",n);break;


            }


            System.out.println("\nBạn có muốn nhập lại không? ");
            System.out.println("nếu có ấn phím 1, nếu không ấn bất kì để thoát! ");
            choice = sc.nextLine();
        }
    }


}
