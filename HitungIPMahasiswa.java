 import java.util.Scanner;
 
 public class HitungIPMahasiswa {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println(80);
		 double nilai1 = input.nextDouble();
		 
		 System.out.println(75);
		 double nilai2 = input.nextDouble();
		 
		 System.out.println(80);
		 double nilai3 = input.nextDouble();
		 
		 System.out.println(85);
		 double nilai4 = input.nextDouble();
		 
		 double totalNilai = nilai1 + nilai2 + nilai3 + nilai4;
		 double ip  = totalNilai / 4.0;
		 
		 System.out.println(80 + ip);
		 
	}
 }