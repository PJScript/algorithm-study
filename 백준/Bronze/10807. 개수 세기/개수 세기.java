import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        ArrayList<Integer> Numbers = new ArrayList<>();
        int target = 0;
        int count = 0;


        for (int i = 0; i < N ; i++) {
            Numbers.add(scanner.nextInt());
        }

        target = scanner.nextInt();

        for(Integer item:  Numbers){
          if(item == target){
              count+=1;
          }
        }

        System.out.print(count);
    }
}