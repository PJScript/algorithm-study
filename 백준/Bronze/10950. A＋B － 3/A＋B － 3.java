import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            System.out.println(left + right);
        }
    }
}