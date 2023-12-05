import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = 0;
        for (int i = 0; i < 9 ; i++) {
            int input = scanner.nextInt();

            if(number < input){
                number = input;
                count = i + 1;
            }
        }
        System.out.println(number);
        System.out.print(count);
    }
}