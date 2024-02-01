package dfsbfs_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex2606 {

    static ArrayList<Integer> arrlist[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int computer = Integer.parseInt(br.readLine()); //컴퓨터 수
        int line = Integer.parseInt(br.readLine()); //간선의 수
        arrlist = new ArrayList[computer+1];
        visited = new boolean[computer+1];

        //어레이리스트 생성(노드, 간선)
        for(int i=1;i<computer+1;i++){
            arrlist[i] = new ArrayList<Integer>();
        }
        for(int i=1;i<=line;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arrlist[s].add(e);
            arrlist[e].add(s);
        }
        BFS(1);


    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;
        int count=0;
        while(!queue.isEmpty()){
            int now_computer = queue.poll();
            for(int i: arrlist[now_computer]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
