package dfsbfs_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex1260 {
    static ArrayList<Integer> arraylist[];
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //정점의 개수
        int M = Integer.parseInt(st.nextToken()); //간선의 개수
        int V = Integer.parseInt(st.nextToken()); //시작노드

        arraylist = new ArrayList[N+1];
        visited = new boolean[N+1];

        for(int i=1;i<N+1;i++){
            arraylist[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            arraylist[s].add(e);
            arraylist[e].add(s);
        }
        //번호가 작은 것을 먼저 방문하기 위해 정렬
        for(int i=1;i<N+1;i++){
            Collections.sort(arraylist[i]);
        }

        DFS(V);
        visited = new boolean[N+1];
        System.out.println();
        BFS(V);

    }
    static void DFS(int v){
        System.out.print(v + " ");
        if(visited[v]){
            return;
        }else{
            visited[v] = true;
            for(int i : arraylist[v]){
                if(visited[i] == false){ //연결 노드 중 방문하지 않았던 노드만 탐색
                    DFS(i);
                }
            }
        }
    }
    static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            System.out.print(now_Node +" ");
            for(int i : arraylist[now_Node]){
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);

                }


            }

        }


    }
}
