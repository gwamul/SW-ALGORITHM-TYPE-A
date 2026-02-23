package SWEA_D2;

public class pr_1_문자열내p와y개수 {

		public int solution(int num) {
			int cnt=0;
			while (num != 1) {
				if(cnt>500) {
					return -1;
				}
				if (num % 2 == 0) {
					num /= 2;
				}else if(num % 2 == 1) {
					num=(num*3)+1; //한라인이 연산 빠름
				}
				cnt++; //반복문 1회당 if~else 문 중에서 조건에 맞는 경우만 read하기 때문에 조건문 밖에 쓰는 것이 효율적
			}

			return cnt;	
		}
	}

