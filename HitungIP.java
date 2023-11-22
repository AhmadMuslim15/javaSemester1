import java.util.Scanner;

public class HitungIP {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("75: ");
		double nilaiMatkul1 = input.nextDouble();
		
		System.out.println("80: ");
		double nilaiMatkul2 = input.nextDouble();
		
		System.out.println("80: ");
		double nilaiMatkul3 = input.nextDouble();
		
		System.out.println("85: ");
		double nilaiMatkul4 = input.nextDouble();

		double total = nilaiMatkul1 + nilaiMatkul2 + nilaiMatkul3 + nilaiMatkul4;
		double IP = total / 4.0;
		
		System.out.println("4.0: " + IP);
	}
} 