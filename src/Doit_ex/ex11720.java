package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum =0;
        String s = br.readLine();
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += num;

        }
        System.out.println(sum);
    }
}
