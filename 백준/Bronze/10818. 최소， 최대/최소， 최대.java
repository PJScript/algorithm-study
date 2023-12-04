import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int max = -1_000_000;
        int min = 1_000_000;

        for (int i = 0; i < N; i++) {
            // max
            int number = scanner.nextInt();
            if (max < number) {
                max = number;
            }

            if(min > number){
                // min
                min = number;
            }

        }

        System.out.print(min + " ");
        System.out.println(max);
    }
}