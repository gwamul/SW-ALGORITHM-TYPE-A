package SWEA_D2;

import java.util.Scanner;

public class swea21425_더하기빼기기호 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		
		for(int tc=1;tc<=T;tc++) {
			long A=sc.nextLong();
			long B=sc.nextLong();
			long N=sc.nextLong();
			
			int cnt=0;
			while(A<=N && B<=N){
				if(A<B) {
					A+=B;
					cnt++;
				}else {
					B+=A;
					cnt++;
				}
			}
			
			System.out.println(cnt);
			}
		}


}