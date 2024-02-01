package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int count =0;
        int start_idx =0;
        int end_idx =N-1;

        while(start_idx<end_idx){
            if(arr[start_idx]+arr[end_idx]<M){
                start_idx++;
            }else if(arr[start_idx]+arr[end_idx]>M){
                end_idx--;
            }else if(arr[start_idx]+arr[end_idx]==M){
                count++;
                start_idx++;
                end_idx--;
            }
        }
        System.out.print(count);


    }
}
