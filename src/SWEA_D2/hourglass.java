package SWEA_D2;

public class hourglass {
	public static void main(String[] args) {
		int n = 5;
		int num = 1;

		int space = 0;
		int numbers = n;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("   ");
			}
			for (int j = 0; j < numbers; j++) {
				System.out.printf("%3d", num++);
			}
			System.out.print("\n");
			if (i < n / 2) {
				space++;
				numbers -= 2;
			}else {
				space--;
				numbers+=2;
			}
		}
	}

}
