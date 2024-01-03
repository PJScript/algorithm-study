import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


        int min = 0;
        int max = 0;

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(st.nextToken());
            if(min == 0){
                min = number;
            }

            if(max == 0){
                max = number;
            }

            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        System.out.println(min * max);

    }
}