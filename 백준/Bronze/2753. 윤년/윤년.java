import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = scanner.nextInt();

        if (date % 4 == 0 && date % 100 != 0 || date % 400 == 0) {
            System.out.print(1);
        } else {
            System.out.println(0);
        }


    }

}