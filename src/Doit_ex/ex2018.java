package Doit_ex;

import java.util.Scanner;

public class ex2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_idx =0;
        int end_idx=0;
        int arr[] = new int[N];
        for(int i=0; i<N;i++){
            arr[i] = i+1;
        }
        //start_idx ~ end_idx = sum
        int sum =1;
        while(end_idx != N-1){
            if(sum==N){
                count++;
                end_idx++;
                sum = sum + arr[end_idx];
            }else if(sum<N){
                end_idx++;
                sum = sum + arr[end_idx];
            }else if(sum>N){
                sum = sum - arr[start_idx];
                start_idx++;
            }
        }
        System.out.print(count);

    }
}
