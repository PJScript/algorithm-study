import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < N; i++) {

            int count = scanner.nextInt();
            int price = scanner.nextInt();
            total += count * price;
        }

        if (total == X) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}