package dfsbfs_ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ex2178 {


    static int visited[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[N][M];

        //map 입력받기
        for(int i=0;i<N;i++){
            String s = br.readLine();
            for(int j=0;j<M;j++){
                map[i][j] = s.charAt(j) - '0';
            }
        }
        //BFS
        Queue<Integer> queue = new LinkedList<>();
        visited = new int[N][M];
        queue.add(0);
        queue.add(0);
        visited[0][0] = 1;

        int count = 0; //지나간 길 세는 변수
        while(!queue.isEmpty()){
            int x = queue.poll();
            int y = queue.poll();
            //방문하지않았고 인접한 노드 ([x-1,y][x+1,y][x,y+1][x,y-1])

            if (x-1>=0){
                if(visited[x-1][y] ==0) {
                    if (map[x - 1][y] == 1) {
                        queue.add(x - 1);
                        queue.add(y);
                        visited[x - 1][y] = visited[x][y]+1;
                    }
                }
            }if (x+1<N){
                if(visited[x+1][y] ==0) {
                    if (map[x + 1][y] == 1) {
                        queue.add(x + 1);
                        queue.add(y);
                        visited[x + 1][y] = visited[x][y]+1;
                    }
                }
            }if (y-1>=0) {
                if(visited[x][y-1]==0) {
                    if (map[x][y - 1] == 1) {
                        queue.add(x);
                        queue.add(y - 1);
                        visited[x][y - 1] = visited[x][y]+1;
                    }
                }
            }if (y+1< M){
                if(visited[x][y+1]==0) {
                    if (map[x][y + 1] == 1) {
                        queue.add(x);
                        queue.add(y + 1);
                        visited[x][y + 1] = visited[x][y]+1;
                    }
                }
            }
        }
        count = visited[N-1][M-1];
        System.out.print(count);

    }
}
