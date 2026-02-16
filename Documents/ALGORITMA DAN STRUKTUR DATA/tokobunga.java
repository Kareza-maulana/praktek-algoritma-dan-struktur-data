public class tokobunga {
    
    static String[] nama_cabang = {

        "Royal graden 1", "Royal graden 2", "Royal graden 3", "Royal graden 4"
};
static String[] nama_bunga = {
    "Aglonema", "keladi", "alocasia","mawar"
};

static int[][] stok_bunga = {
    {10,5,15,7},
    {6,11,9,12},
    {2,10,10,5},
    {5,7,12,9}
};

static void profit_cabang() {
    for (int i = 0 ; i<nama_cabang.length; i++){
        int total_pendapatan[] = new int[nama_bunga.length];
        int pendapatan = 0;
        
        for (int j = 0 ; j < nama_bunga.length; j++){
            
            if(j == 0){
                stok_bunga[i][j] *= 75000;
            }else if (j==1){
                stok_bunga[i][j] *= 50000;
            }else if(j==2){
                stok_bunga[i][j] *= 60000;
            }else if(j == 3){
                stok_bunga[i][j] *= 10000;
            }
            pendapatan += stok_bunga[i][j];
            



        }
        total_pendapatan[i] = pendapatan;
        System.out.println("Total pendapatan cabang " + nama_cabang[i] + " = " + total_pendapatan[i]);
        if(total_pendapatan[i]>1500000){
            System.out.println("Cabang " + nama_cabang[i] + " Sangat Baik");
        }else if(total_pendapatan[i]<1500000){
            System.out.println("Cabang " + nama_cabang[i] + " Perlu Evaluasi");
        }
        System.out.println();

     
    }

    
    
}
public static void main(String[] args) {
    profit_cabang();
}
}
