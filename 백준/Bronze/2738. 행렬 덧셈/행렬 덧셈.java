import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        // N 개의 줄에 M  개씩 행렬이 구성된다.

        for (int i = 0; i < N; i++) {
            A.add(new ArrayList<>());
            for (int j = 0; j < M; j++) {
                int number = sc.nextInt();
                A.get(i).add(number);
            }
        }

        for (int i = 0; i < N; i++) {
            B.add(new ArrayList<>());
            for (int j = 0; j < M; j++) {
                int number = sc.nextInt();
                B.get(i).add(number);
            }
        }


        for (int i = 0; i < A.size(); i++) {
            for (int j = 0; j < A.get(i).size(); j++) {

                System.out.printf(String.valueOf(A.get(i).get(j) + B.get(i).get(j)) + " ");
            }
            System.out.println();
        }
    }
}
