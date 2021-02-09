import java.util.Scanner;

class sum {

	public static void main(String args[]) {

		int a, b, sum;

		Scanner in = new Scanner(System.in);
		System.out.println("Input the numbers:");		

		a = in.nextInt();
		b = in.nextInt();

		sum = a + b;

		System.out.println("sum = " + sum);
	}
}