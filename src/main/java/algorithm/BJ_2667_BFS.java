package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ_2667_BFS {

    static int[][] direction = {
            // 좌 우 하 상  {x, y}
            {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());

        int[][] map = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {

                }
            }
        }
    }

    public static int bfs(int N, int[][] map, boolean[][] visited, int x, int y) {
        int size = 1;

    }
}
