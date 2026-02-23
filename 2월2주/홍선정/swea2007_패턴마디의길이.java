package SWEA_D2;

import java.util.Scanner;

public class swea2007_패턴마디의길이 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String input = sc.next();

			/*
			 * char[] cArr=new char[30]; for(int i=0;i<30; i++){ cArr[i]=input.charAt(i) }
			 */
			char[] cArr = input.toCharArray();

			int ans = 0;
			for (int i = 1; i <= 10; i++) {
				// 첫번째 문자랑 같은 문자가 나올때까지 탐색, 찾았다면 나머지 해당 패턴이 맞는지 인덱스 검증
				if (cArr[i] == cArr[0]) {
					boolean isMatch = true;
					for (int j = 0; j < i; j++) {
						if (cArr[j] != cArr[i + j]) {
							isMatch = false;
							break;
						}
					}
					/*
					for (int i = 1; i <= 10; i++) {
					    String pattern = input.substring(0, i);
					    String nextPart = input.substring(i, i + i);
					    
					    if (pattern.equals(nextPart)) {
					        ans = i;
					        break;
					    }
					}
					
					 */
					if (isMatch) {
						ans = i;
						break;
					}
				}

			}
			System.out.println("#" + tc + " " + ans);
		}

	}

}
/*
 * **"최소 마디"**를 찾는 문제이므로, 
 * i가 1부터 커지다가 처음으로 패턴이 일치하는 순간 전체 루프를 바로 종료
 * 가장 깔끔한 방법: getPatternLength 처럼 메서드로 뽑아서 return i; 로 반환값 때리기.
 * main에서 다 해결할 방법: isMatch 플래그를 세우고, 정답을 찾으면 ans = i; break; 하기.
 * or substring 방법
 */
