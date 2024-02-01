package Doit_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11660 {
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // NxN
        int M = Integer.parseInt(st.nextToken()); //질문의 개수
        arr = new int[N][N];
        //arr 입력받기
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int S[][] = new int[N+1][N+1];
        for(int i=1;i<N+1;i++){
            for(int j=1;j<N+1;j++){
                S[i][j] = S[i][j-1]+S[i-1][j] - S[i-1][j-1] + arr[i-1][j-1];
            }
        }
        //질문
        for(int i=0;i<M;i++){
//            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
//            sb.append(solution(x1,x2,y1,y2));
//            System.out.println(sb);
            int result = S[y1][y2] - S[x1-1][y2] - S[y1][x2-1] + S[x1-1][x2-1];
            System.out.println(result);
        }

    }
//    static int solution(int x1, int x2, int y1, int y2){
//        int n = (y1-x1+1)*(y2-x2+1);
//        if (n==1){
//            return arr[x1-1][x2-1];
//        }else{
//            int num =0;
//            int S[] = new int[n];
//            for(int i=x1-1;i<=y1-1;i++){
//                for(int j=x2-1;j<=y2-1;j++){
//                    num += arr[i][j];
//                }
//            }
//
//            return num;
//        }
//    }
}
