import java.util.Scanner;

public class KonversiKodeNegara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan kode negara (2 huruf): ");
        String kodeNegara = input.next();
        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "Tunisia";
                break;
            case "ID":
                namaNegara = "Indonesia";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "India";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                return;
        }

        System.out.println("Kode negara: " + kodeNegara);
        System.out.println("Nama negara: " + namaNegara);
    }
}