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

        while(N > 0){
            list.add(N % 10);
            N = N / 10;
        }



        Collections.sort(list, Collections.reverseOrder());

        for(Integer c : list) {
            sb.append(c);
        }
        System.out.println(sb);


    }
}