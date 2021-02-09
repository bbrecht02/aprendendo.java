import java.util.Scanner;

public class Gangorra {
	public static void main(String[] args) {

		// return a * b == c * d

		int a, b, c, d;

		int left, right;


		Scanner aSc = new Scanner(System.in);
		a = aSc.nextInt();

		Scanner bSc = new Scanner(System.in);
		b = bSc.nextInt();

		Scanner cSc = new Scanner(System.in);
		c = cSc.nextInt();

		Scanner dSc = new Scanner(System.in);
		d = dSc.nextInt();


		left = a * b;
		right = c * d;

		if (left == right) {
			System.out.println("0");
		}
		else if (left > right) {
			System.out.println("-1");
		}
		else if (left < right) {
			System.out.println("1");
		}
	}
}