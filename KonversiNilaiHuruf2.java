import java.util.Scanner;

public class KonversiNilaiHuruf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = input.next().charAt(0);
        double nilaiNumerik;

        switch (nilaiHuruf) {
            case 'a':
                nilaiNumerik = 4.0;
                break;
            case 'b':
                nilaiNumerik = 3.0;
                break;
            case 'c':
                nilaiNumerik = 2.0;
                break;
            case 'd':
                nilaiNumerik = 1.0;
                break;
            case 'e':
                nilaiNumerik = 0.0;
                break;
            default:
                nilaiNumerik = -1.0;
                System.out.println("Maaf, konversi nilai tidak diketahui");
        }

        if (nilaiNumerik != -1.0) {
            System.out.println("Nilai numerik: " + nilaiNumerik);
        }
    }
}