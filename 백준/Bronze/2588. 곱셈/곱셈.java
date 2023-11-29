import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int top = scanner.nextInt();
        int bottom = scanner.nextInt();


        while (bottom > 0) {
            numbers.add(bottom % 10);
            bottom /= 10;
        }

        System.out.println(top * numbers.get(0));
        System.out.println(top * numbers.get(1));
        System.out.println(top * numbers.get(2));
        System.out.println(top * numbers.get(0) + top * numbers.get(1) * 10 + top * numbers.get(2) * 100);


    }

}