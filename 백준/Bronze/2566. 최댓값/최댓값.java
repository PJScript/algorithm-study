import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();

        int max = 0;
        int x = 1;
        int y = 1;

        for (int i = 0; i < 9; i++) {

            list.add(new ArrayList<>());

            for (int j = 0; j < 9; j++) {
                int input = sc.nextInt();
                list.get(i).add(input);
            }

        }


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if(max < list.get(i).get(j)){
                    x = j+1;
                    y = i+1;
                    max = list.get(i).get(j);
                }
            }
        }
        System.out.println(max);
        System.out.print(y + " ");
        System.out.print(x);
    }
}
