package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class ex1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long arr[] = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        int count =0;
        for(int i=0;i<N;i++){
            long find = arr[i];
            int Start_idx =0;
            int End_idx = N-1;
            while(Start_idx<End_idx){
                if(arr[Start_idx]+arr[End_idx]==find){
                    if(Start_idx!=i && End_idx!=i){
                    count++;
                    break;
                    }else if(Start_idx==i){
                        Start_idx++;
                    }else if(End_idx==i){
                        End_idx--;
                    }
                }else if(arr[Start_idx]+arr[End_idx]<find){
                    Start_idx++;
                }else if(arr[Start_idx]+arr[End_idx]>find){
                    End_idx--;
                }
            }
        }

        System.out.print(count);



    }
}
