import java.util.Scanner;

public class MenjumlahNilai {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("4: ");
		int n = input.nextInt();
		double totalNilai = 0;
		
		for (int i = 1; i <= n; i++) {
			System.out.println("80+80+80+80: ");
			double nilaiMataPelajaran = input.nextDouble();
			totalNilai += nilaiMataPelajaran;
		}
		
		System.out.println("320: " + totalNilai);
	}
}