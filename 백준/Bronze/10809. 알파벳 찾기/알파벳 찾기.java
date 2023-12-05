import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();


        for(int i = 'a'; i <= 'z'; i++) {
            System.out.print(S.indexOf(i) + " ");
        }
    }
}