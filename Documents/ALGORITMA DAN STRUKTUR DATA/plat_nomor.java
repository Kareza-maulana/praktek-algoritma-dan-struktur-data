import java.util.Scanner;
public class plat_nomor {
    


    public static void main(String[] args) {
        // Inisialisasi array kode plat (1 Dimensi)
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        // Inisialisasi array nama kota (Array String)
        String[] KOTA = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR", 
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };

        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Masukkan Kode Plat Nomor: ");
        
        // Mengambil input huruf pertama dan mengubahnya ke huruf kapital
        char inputUser = inputScanner.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        // Proses pencarian dalam array
        for (int i = 0; i < KODE.length; i++) {
            if (inputUser == KODE[i]) {
                System.out.println("Kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Maaf, kode plat tidak ditemukan.");
        }
        
        inputScanner.close();
    }
}

