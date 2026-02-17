import java.util.Scanner;

public class jadwalkuliah {
    static Scanner input = new Scanner(System.in);
      static int jumlah_jadwal = 0;
    static String Jadwal[][] = new String[jumlah_jadwal][5];
    static int hari_kuliah[] = new int[jumlah_jadwal];
  

    static void input_jadwal(){
        boolean stop = false;
        System.out.println("masukan jumlah jadwal yang ingin di input : ");
        jumlah_jadwal = input.nextInt();
        input.nextLine(); // consume newline
        Jadwal = new String[jumlah_jadwal][5];
        for (int i=0 ; i<Jadwal.length; i++){
            System.out.println("Jadwal ke "+(i+1));
            hari_kuliah[i] = input.nextInt();
            input.nextLine(); // consume newline
            while(stop == false){
                int j=0;
                System.out.println("masukan nama mata kuliah : ");
                Jadwal[i][j] = input.nextLine();
                j++;
                System.out.println("masukan ruang kuliah : ");
                Jadwal[i][j] = input.nextLine();
                j++;
                System.out.println("masukan nama hari : ");
                Jadwal[i][j] = input.nextLine();
                j++;
                System.out.println("masukan jam kuliah : ");
                Jadwal[i][j] = input.nextLine();
                j++;
                if(i == Jadwal.length-1){
                    stop = true;
            }

            }
        }
  
    }
    static void cari_jadwal(){
        System.out.println("masukana nama hari yang ingin dicari :(masukan angka 1-7) ");
        int cari_hari = input.nextInt();
        input.nextLine(); // consume newline
        for (int i=0; i<Jadwal.length; i++){
            System.out.println("jadwal ke \t"+(i+1));
            System.out.print("mata kuliah\t"  + "ruang kuliah\t"  + "hari kuliah\t" + "jam kuliah");
        if (hari_kuliah[i] == hari_kuliah[cari_hari-1]){
            while (true) {
                int j=0;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.println(Jadwal[i][j] + "\t\t");
                break; 
                
            }}

            }

        }

        static void tampilkan_jadwal(){
            for (int i=0; i<Jadwal.length; i++){
                System.out.println("jadwal ke \t"+(i+1));
                System.out.print("mata kuliah\t"  + "ruang kuliah\t"  + "hari kuliah\t" + "jam kuliah");
                int j=0;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.print(Jadwal[i][j] + "\t\t");
                j++;
                System.out.println(Jadwal[i][j] + "\t\t");
            }
        }

    public static void main(String[] args) {
        input_jadwal();
        cari_jadwal();
        tampilkan_jadwal();
    }

}
