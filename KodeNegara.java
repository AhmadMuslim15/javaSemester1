import java.util.Scanner;

public class KodeNegara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = scanner.next();

        if (kodeNegara.equals("ES")) {
            System.out.println("ES = Spain");
        } else if (kodeNegara.equals("TN")) {
            System.out.println("TN = Tunisia");
        } else if (kodeNegara.equals("ID")) {
            System.out.println("ID = Indonesia");
        } else if (kodeNegara.equals("MM")) {
            System.out.println("MM = Myanmar");
        } else if (kodeNegara.equals("IN")) {
            System.out.println("IN = India");
        } else {
            System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
        }

        scanner.close();
    }
}