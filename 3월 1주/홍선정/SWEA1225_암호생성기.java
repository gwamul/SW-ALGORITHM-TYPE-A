package SWEA_D2;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class SWEA1225_암호생성기 {
	
	/*
	 * 다음 주어진 조건에 따라 n개의 수를 처리하면 8자리 암호를 생성할 수 있음
	 * 8개의 숫자를 입력 받음
	 * 첫번째 숫자를 1감소한 뒤 맨뒤
	 * 다음 첫번째뒤 2감소 후 뒤로
	 * 그 다음 첫번째 3감소 후 맨뒤
	 * 그 다음 수 4
	 * 그 다음 수 5
	 * 
	 * 숫자 중 한개라도 0이 나올 때 종료
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Queue<Integer> q=new ArrayDeque<>();
		for(int tc=1; tc<=10; tc++) {
			int T=sc.nextInt();
			
			
			for(int i=0; i<8; i++) {
				q.add(sc.nextInt());
			}
			
			int minus=1;
			
			while(true) {
				int cur=q.remove()-minus;
				
				if(cur<=0) {
					q.add(0);
					break;
				}
				q.add(cur);
				
				minus++;
				if(minus>5) minus=1;
			}
			
			System.out.print("#"+tc+" ");
			while(!q.isEmpty()) {
				System.out.print(q.remove()+" ");
			}
			System.out.println();
			
			
		}
	}
	
	

}
