
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int number = i;
            int temp = 0;
            while (number > 0) {
                temp += number % 10;
                number /= 10;
            }

            if (i + temp == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }


}
