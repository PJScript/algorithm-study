import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();
            list.add(number);
        }


        Collections.sort(list);


        for(Integer c : list) {
            sb.append(c).append("\n");
        }
        System.out.println(sb);


    }
}