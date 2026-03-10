package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ3273_두수의합 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
		
		int [] arr=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int x=Integer.parseInt(br.readLine());
		boolean [] are =new boolean[2000001];
		
		int cnt=0;
		for(int i=0; i<n; i++) {
			int cur=arr[i];
			int target=x-cur;
			
			are[cur]=true;
			
			if(are[target]) {
				cnt++;
			}
	
		}
		System.out.println(cnt);
	}
	
	
}
