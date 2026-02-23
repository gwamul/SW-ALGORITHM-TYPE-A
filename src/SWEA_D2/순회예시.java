package SWEA_D2;

public class 순회예시 {
	/*
	 * 2차원 배열 배열의 요소가 또 다른 1차원 배열을 가리킴 
	 * 1. 행 우선 순회 2. 열 우선 순회 3. 지그재그 순회 4. 델타값 응용 ->파리퇴치3
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int [][]arr= {
				{1,2,3,4},
				{5,6,7,8}
		};
//		// 1. 행우선 순회 -> 정방향 
//		for(int i = 0;i<arr.length;i++){
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println(); //한 행마다 내려쓰기
//		}
//		//행우선 순회 역방향으로 탐색 - for문 건드리거나, 인덱스 건드리거나
//		for(int i=arr.length-1;i>=0;i--) {
//			for(int j=arr[0].length-1; j>=0;j--) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
//		
//		//인덱스 건드리기
//		for(int i=0;i<arr.length;i++) {
//			for(int j =0; j<arr[0].length; j++) {
//				System.out.print(arr[arr.length-1-i][arr[0].length-1-j]);
//			}
//			System.out.println();
//		}
//		
		//2. 열 우선 순회 
		for(int i=0; i<arr[0].length;i++) { //열 길이까지
			for(int j=0; j<arr.length;j++) { //행길이까지
				System.out.print(arr[j][i]); 
			}//열고정, 행을
			System.out.println();
		}//행 고정, 열을
		
//		열 우선순회 - 역방향
		for(int i=arr[0].length-1;i>=0;i--) {
			for(int j=arr.length-1;j>=0;j--) {
				System.out.print(arr[j][i]);
			}
			System.out.println();
		}
		
		for(int i=0; i<arr[0].length;i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[arr.length-1-j][arr[0].length-1-i]);
			}
			System.out.println();
		}
		
		//3. 지그재그 순회

		
		
	}

}
