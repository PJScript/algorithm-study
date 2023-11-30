import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double x = scanner.nextInt();
        double y = scanner.nextInt();

        if (x < 0) {
            // 2, 3 사분면
            if (y < 0) {
                System.out.print(3);
            } else {
                System.out.print(2);
            }

        } else {
            // 1, 4 사분면
            if (y < 0) {
                System.out.print(4);
            } else {
                System.out.print(1);
            }

        }


    }

}