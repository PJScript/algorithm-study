import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < 5; i++) {
            int input = sc.nextInt();
            list.add(input);
            total += input;
        }

        Collections.sort(list);

        System.out.println(total / 5);
        System.out.println(list.get(5 / 2));

    }
}