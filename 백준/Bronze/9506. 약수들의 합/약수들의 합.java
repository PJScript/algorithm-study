import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0;

        List<Integer> list = new ArrayList<>();
        int check = 0;


        while (true) {
            list = new ArrayList<>();
            check = 0;
            N = sc.nextInt();
            if (N == -1) {
                return;
            }

            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    list.add(i);
                    if (i != N) {
                        check += i;
                    }
                }
            }


            if (check == N) {
                String output = "";
                for (int i = 0; i < list.size(); i++) {
                    if (i > 0) {
                        output += " + " + list.get(i);
                    } else {
                        output += " " + list.get(i);

                    }
                }
//            System.out.println(check + "체크");
                System.out.println(N + " =" + output);

            } else {

                System.out.println(N + " is NOT perfect.");
            }
        }

    }
}