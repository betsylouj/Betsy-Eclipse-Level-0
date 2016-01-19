import java.util.Random;

public class LotteryNumbers {

	public static void main(String[] args) {
		int n1 = getRandom();
		int n2 = getRandom();
		int n3 = getRandom();
		int n4 = 0;
		int n5 = 0;
		int n6 = 0;
		System.out.println("Number 1 is "+n1);

		for (int i = 0; i < 1; i++) {
			if (n1 == n2) {
				n2 = getRandom();
				i = -1;
			}
		}
		System.out.println("Number 2 is "+n2);
		for (int i = 0; i < 1; i++) {
			if (n1 == n3 || n2 == n3) {
				n3 = getRandom();
				i = -1;
			}
		}
		System.out.println("Number 3 is "+n3);
		while (n4==0) {
			n4 = getRandom();
			if (n1 == n4 || n2 == n4 || n3==n4) {
				n4=0;
			}
		}
		System.out.println("Number 4 is "+n4);
		while (n5==0) {
			n5 = getRandom();
			if (n1 == n5 || n2 == n5 || n3==n5 || n4==n5) {
				n5=0;
			}
		}
		System.out.println("Number 5 is "+n5);
		while (n6==0) {
			n6 = getRandom();
			if (n1 == n6 || n2 == n6 || n3==n6 || n4==n6 || n5==n6) {
				n6=0;
			}
		}
		System.out.println("Number 6 is "+n6);

	}

	private static int getRandom() {
		return (1 + (new Random().nextInt(6)));
	}

}
