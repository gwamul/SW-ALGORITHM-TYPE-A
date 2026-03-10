package SWEA_D2;

import java.util.Scanner;

public class SWEA4123_숫자만들기 {
	static int N, max, min;  //연산 과정에서 갱신되는 최종 출력 관련값 전역변수로 선언
	static int[] num;
	static int []op=new int[4];
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int tc=1; tc<T; tc++) {
			int N=sc.nextInt();
			
			for(int i=0; i<4; i++) {
				op[i]=sc.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				num[i]=sc.nextInt();
			}
			max=Integer.MIN_VALUE;
			min=Integer.MAX_VALUE;
			
			dfs(1, num[0]);
			
			
			System.out.println("#"+ tc + " "+ (max-min));
		}
		
	}
	static void dfs(int idx, int inter) {
		for(int i=0; i<4; i++) {
			if(op[i]>0) {
				op[i]--;
				
				int a=inter;
				if(i==0) a+=num[idx];
				else if(i==1) a-=num[idx];
				else if(i==2) a*=num[idx];
				else a/=num[idx];
				
				dfs(idx+1, a);
				
				op[i]++;
			}
		}
	}
	
    
}
