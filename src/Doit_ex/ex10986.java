package Doit_ex;

import java.util.Scanner;

public class ex10986{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        //두번째줄 배열 선언
        int[] array = new int[N];
        for (int i=0; i<array.length;i++){
            array[i] = sc.nextInt();
        }
        //합배열
        long S[] = new long[N];
        S[0] = array[0];
        for(int i=1;i<N;i++){
            S[i] = S[i-1] + array[i];
        }
        long C[] = new long[M];

        long count = 0;
        //연속된 구간 나누기
//        for(int i=0; i<N;i++){
//            int sum = 0;
//            for(int j=i; j<N; j++){
//                if(i==j){
//                    sum = array[i];
//                }else{
//                    sum = sum +array[j];
//                }
//
//                if(sum%M==0){
//                    count++;
//                }
//            }
//
//        }
        for(int i=0;i<N;i++){
            int remainder =(int)(S[i] % M);
            if (remainder ==0) count++;
            C[remainder]++;
        }

        for(int i =0; i< M; i++){
            count = count + (C[i]*(C[i]-1)/2);
        }

        System.out.print(count);
    }
}