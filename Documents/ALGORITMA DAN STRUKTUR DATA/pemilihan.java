import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Program Menghitung nilai mahasiswa==== ");
        System.out.println("masukan nilai tugas: ");
        int tugas = input.nextInt();
        System.out.println("masukan nilai kuis : ");
        int kuis = input.nextInt();
        System.out.println("masukan nilai uts : ");
        int uts = input.nextInt();  
        System.out.println("masukan nilai uas : ");
        int uas = input.nextInt();

        int nilaiakhir = tugas * 20 /100 + kuis * 20 /100 + uts * 30 /100 + uas * 30 /100;
        
        if (nilaiakhir >= 80 && nilaiakhir <= 100) {
            String nilaihuruf = "A";
            System.out.println("nilai akhir :" + nilaiakhir);
            System.out.println("nilai huruf :" + nilaihuruf);
        }else if(nilaiakhir >= 73 && nilaiakhir < 80){
            String nilaihuruf = "B";
            System.out.println("nilai akhir :" + nilaiakhir);
            System.out.println("nilai huruf :" + nilaihuruf);
        }else if(nilaiakhir >= 65 && nilaiakhir < 73){
            String nilaihuruf = "C";
            System.out.println("nilai akhir :" + nilaiakhir);
            System.out.println("nilai huruf :" + nilaihuruf);
        }else if(nilaiakhir >= 50 && nilaiakhir < 65){
            String nilaihuruf = "D";
            System.out.println("nilai akhir :" + nilaiakhir);
            System.out.println("nilai huruf :" + nilaihuruf);
        }else{
            String nilaihuruf = "E";
            System.out.println("nilai akhir :" + nilaiakhir);
            System.out.println("nilai huruf :" + nilaihuruf);
        }
        input.close();
    }
}