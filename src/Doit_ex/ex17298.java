package Doit_ex;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;
// 이해 안되버림ㅡㅡㅡㅡㅡㅡ

public class ex17298 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int arr[] = new int[N];
        int ans[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        stack.push(0); //스택 초기화

        //스택에 인덱스를 넣고 인덱스를 비교해야함
        for(int i=1;i<N;i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            ans[stack.pop()] = -1;
        }
        for(int i=0;i<N;i++){
            sb.append(ans[i]);
            sb.append(" ");
        }

        System.out.print(sb);



    }

}
