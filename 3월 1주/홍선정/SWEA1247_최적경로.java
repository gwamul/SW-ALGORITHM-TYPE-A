package SWEA_D2;

import java.util.*;
import java.io.*;

public class SWEA1247_최적경로 {
    static int N, minDist;
    static Point company, home;
    static Point[] customers;
    static boolean[] visited;

    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            N = sc.nextInt();
            minDist = Integer.MAX_VALUE;
            
            // 회사, 집, 고객 좌표 입력
            company = new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            customers = new Point[N];
            visited = new boolean[N];

            for (int i = 0; i < N; i++) {
                customers[i] = new Point(sc.nextInt(), sc.nextInt());
            }

            // 회사에서 시작하여 백트래킹 탐색
            search(0, company, 0);

            System.out.println("#" + tc + " " + minDist);
        }
    }

    /**
     * @param cnt     방문한 고객 수
     * @param last    마지막으로 머물렀던 위치
     * @param totalDist 현재까지 누적된 거리
     */
    private static void search(int cnt, Point last, int totalDist) {
        // 가지치기: 현재 거리가 이미 최솟값을 넘었다면 더 볼 필요 없음
        if (totalDist >= minDist) return;

        // 모든 고객을 방문했다면 집으로 돌아가고 종료
        if (cnt == N) {
            int finalDist = totalDist + getDistance(last, home);
            minDist = Math.min(minDist, finalDist);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                search(cnt + 1, customers[i], totalDist + getDistance(last, customers[i]));
                visited[i] = false; // 백트래킹 (원상 복구)
            }
        }
    }
    

    private static int getDistance(Point p1, Point p2) {
        return Math.abs(p1.x - p2.x) + Math.abs(p1.y - p2.y);
    }
}