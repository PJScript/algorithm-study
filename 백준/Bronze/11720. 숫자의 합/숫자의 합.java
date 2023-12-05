import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += numbers.charAt(i) - '0';
        }

        System.out.println(total);

    }
}
