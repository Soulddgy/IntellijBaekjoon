package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex6603 {
    static int n;
    static int[] arr;
    static int[] result;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.readLine()!= "0"){
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            visited = new boolean[n];
            for(int i =0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }



        }

    }
    //재귀함수
    public static void dfs(int start, int depth){
        if(depth ==6){
            for(int i : result);
        }


    }


}
