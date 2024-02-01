package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long Sum[] = new long[N+1];
        //합배열 S[i] = S[i-1] + A[i]
        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            Sum[i] = Sum[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int x=0;x<M;x++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(Sum[j]-Sum[i-1]);

        }

    }
}
