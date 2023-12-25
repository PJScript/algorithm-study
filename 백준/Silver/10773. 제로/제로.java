import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        // read line 으로 입력 감지
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int inputNumber = Integer.parseInt(br.readLine());

            if (inputNumber == 0) {
                stack.pop();
            } else {
                stack.push(inputNumber);
            }
        }

        int sum = 0;
        for (Integer el : stack) {
            sum += el;
        }
        br.close();
        System.out.println(sum);
    }
}