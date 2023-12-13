import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int loop = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int i = 0; i < loop; i++) {

            list.add(sc.nextInt());
        }

        for (int i = 0; i < loop - 2; i++) {
            for (int j = i + 1; j < loop - 1; j++) {
                for (int k = j + 1; k < loop; k++) {
                    int current = list.get(i) + list.get(j) + list.get(k);


                 
                    if (result < current && current <= M) {
                        result = current;
                    }

                }
            }
        }
        System.out.println(result);

    }
}