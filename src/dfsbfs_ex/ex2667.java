package dfsbfs_ex;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex2667 {
    static int map[][];
    static boolean visit[][];
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};

    static int count = 0;
    static int nowX, nowY, N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visit = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < N; j++) {
                map[i][j] = str.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                if (!visit[i][j] && map[i][j] == 1) {
                    count = 0;
                    DFS(i, j);
                    list.add(count);
                }

            }
        }

        Collections.sort(list);
        bw.append(list.size() + "\n");
        for (int num : list) {
            bw.append(num + "\n");
        }

        bw.flush();
        bw.close();
    } // End of main

    static void DFS(int x, int y) {
        visit[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            nowX = dx[i] + x;
            nowY = dy[i] + y;

            if (nowX >= 0 && nowX < N && nowY >= 0 && nowY < N && !visit[nowX][nowY] && map[nowX][nowY] == 1) {
                visit[nowX][nowY] = true;
                DFS(nowX, nowY);
            }
        }

    }
}