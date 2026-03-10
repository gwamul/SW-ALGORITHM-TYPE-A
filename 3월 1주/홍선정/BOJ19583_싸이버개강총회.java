package SWEA_D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ19583_싸이버개강총회 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String line=br.readLine();
		
		StringTokenizer st=new StringTokenizer(line);
		String S=st.nextToken();
		String E=st.nextToken();
		String Q=st.nextToken();
		
		HashSet<String> beforeStart=new HashSet<>();
		HashSet<String> attended=new HashSet<>();
		
		String input;
		while(input!=null) {
			input=br.readLine();
			st=new StringTokenizer(input);
			String time=st.nextToken();
			String name=st.nextToken();
			
			if(time.compareTo(S)<=0) {
				beforeStart.add(name);
			}
			
			else if(time.compareTo(E)>=0&&time.compareTo(Q)<=0) {
				if(beforeStart.contains(name)) {
					attended.add(name);
				}
			}
		}
		System.out.println(attended.size());
	}

}
