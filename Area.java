import java.util.Scanner; 

class Area {

	public static void main(String args[]) {
		
		double n = 3.14159;
		double raio;
		double area;

		Scanner in = new Scanner(System.in);

		raio = in.nextInt();

		area = n * Math.pow(raio, 2);

		String r = String.format("%.4f", area);

		System.out.println("A = " + area);

	}
}