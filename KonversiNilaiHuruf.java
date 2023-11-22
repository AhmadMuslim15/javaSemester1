import java.util.Scanner;

public class KonversiNilaiHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Konversi nilai huruf ke nilai indeks
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);
        double nilaiIndeks;

        if (nilaiHuruf == 'a') {
            nilaiIndeks = 4.0;
        } else if (nilaiHuruf == 'b') {
            nilaiIndeks = 3.0;
        } else if (nilaiHuruf == 'c') {
            nilaiIndeks = 2.0;
        } else if (nilaiHuruf == 'd') {
            nilaiIndeks = 1.0;
        } else if (nilaiHuruf == 'e') {
            nilaiIndeks = 0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
            return;
        }

        System.out.println("Nilai indeks: " + nilaiIndeks);
	}
}