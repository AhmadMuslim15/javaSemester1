public class jumlahBarangBelanja {

    public static void main(String[] args) {
        
        int[] harga = {2500, 3000, 4000, 5000, 6000};
        int[] jumlah = {2, 1, 3, 0, 3};

        int totalItemBelanja = 0;
        int totalBelanja = 0;

        
        for (int i = 0; i < harga.length; i++) {
            int totalHarga = harga[i] * jumlah[i];
            totalBelanja += totalHarga;
            totalItemBelanja += jumlah[i];

            System.out.println("Harga barang ke-" + i + ", " + harga[i] + ", " + jumlah[i] + " item: " + totalHarga);
        }

        
        System.out.println("\nTOTAL ITEM BELANJA: " + totalItemBelanja);
        System.out.println("TOTAL BELANJA: RP " + totalBelanja);
    }
}