import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>();

        for(int i =0; i<N; i++){
            A.add(scanner.nextInt());
        }


        for(int i =0; i<N; i++){
            if(A.get(i) < X){
                System.out.print(A.get(i) + " ");
            }
        }

    }
}