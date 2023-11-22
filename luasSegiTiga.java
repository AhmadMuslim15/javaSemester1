import java.util.Scanner;

public class luasSegiTiga {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("15");
		double a = input.nextDouble();
		System.out.println("17");
		double t = input.nextDouble();
		
		double luas = 0.5 * a * t;
		
		System.out.println("Luas segitiga: " + luas);
	}
}