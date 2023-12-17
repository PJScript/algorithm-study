import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> Numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            Numbers.add(number);
        }
        Collections.sort(Numbers);

        for (int i = 0; i < N; i++) {
            System.out.println(Numbers.get(i));
        }
    }
}