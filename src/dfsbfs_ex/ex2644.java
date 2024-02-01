package dfsbfs_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex2644 {
    static ArrayList<Integer> arraylist[];
    static boolean visited[];
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사람의 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(br.readLine());
        arraylist = new ArrayList[N+1];
        visited = new boolean[N+1];
        //
        for(int i=1;i<N+1;i++){
            arraylist[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arraylist[s].add(e);
            arraylist[e].add(s);
        }
        DFS(start, end);
        System.out.print(count);
    }
        static void DFS(int x,int y){

            visited[x] = true;
            count++;





        }


}
