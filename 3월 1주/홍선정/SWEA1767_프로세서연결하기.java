package SWEA_D2;

import java.io.*;
import java.util.*;

public class SWEA1767_프로세서연결하기 {

	static int N;
	static int[][] map;
	static ArrayList<Core> cores;

	static int maxCore;
	static int minLen;

	// 상 하 좌 우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	
	static class Core{
		int i, j;

		public Core(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			cores = new ArrayList<>();

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());

					// 가장자리가 아닌 cores 리스트에 저장
					if (map[i][j] == 1) {
						if (i != 0 && i != N - 1 && j != 0 && j != N - 1) {
							cores.add(new Core(i, j));
						}
					}
				}
			}
//			for (int[] c : cores)
//				System.out.println(c[0] + "," + c[1]);
			
			minLen=0;
			maxCore=Integer.MIN_VALUE;
			dfs(0, 0, 0);

		}
	}

	public static void dfs(int idx, int connected, int wLen) {
		if (idx == cores.size()) {
			if (connected > maxCore) {
				maxCore = connected;
				minLen = wLen;
			}
			if (connected == maxCore) {
				minLen=Math.min(minLen, wLen);
			}
			return;
		}
		
		Core cur=cores.get(idx);
		
//		for(int i=0; i<4; i++) {
//			if(checked(cur, i)) {
//				int len=set()
//						
//			}
//		}
		

	}

}