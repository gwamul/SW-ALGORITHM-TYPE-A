package SWEA_D2;

import java.util.Scanner;

public class SWEA3499_퍼펙트셔플 {
	
	public static void main(String[] args) {
		/*
		 * 카드 덱을 정확히 절반 나누어 교대로 카드를 뽑아 덱을 만듬
		 * 새로운 덱의 순서대로 출력하기 
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int tc=1; tc<=T; tc++) {
			int N=sc.nextInt();
			
			String []arr= new String[N];
			for(int i=0; i<N; i++) {
				arr[i]=sc.next();  // 공백 이전까지 
			}
			
			int firsth=0;
			int secondh=(N+1)/2;
			
			StringBuilder sb=new StringBuilder();
			
			sb.append("#").append(tc).append(" ");
			for(int i=0; i<(N+1)/2;i++) {
				sb.append(arr[firsth++]).append(" ");
				if(secondh<N) {
				sb.append(arr[secondh++]).append(" ");
				}
			}
			
			System.out.println(sb.toString().trim());
		}
	}
}
