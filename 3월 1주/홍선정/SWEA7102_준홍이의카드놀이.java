package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA7102_준홍이의카드놀이 {
	
	public static void main(String[] args) throws IOException{
		

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		
		int T= Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T; tc++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			
			int a = Math.min(N, M);
			int b = Math.max(N, M);
			
			sb.append("#").append(tc).append(' ');
			for(int i=a+1; i<=b+1; i++) {
				sb.append(i).append(' ');
			}
			sb.append('\n');
			
		}
		System.out.println(sb.toString());
		
	}

	
	
	
	
	
	
	
	
	

}
