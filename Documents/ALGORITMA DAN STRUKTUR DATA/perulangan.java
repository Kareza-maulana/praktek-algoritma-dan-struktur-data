
public class perulangan {
    public static void main(String[] args) {
        System.out.println("===program perulangan ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int n = 0;
      
        boolean valid = false;  
        while(!valid){
         System.out.println("masukan nim anda : ");
        String nim = input.nextLine();
        if (nim.matches("\\d+")) {
            valid = true;
             n = Integer.parseInt(nim.substring(nim.length() - 2));
            System.out.println("nim terakhir anda adalah : " + n);
        } else {
            System.out.println("Input tidak valid. Silakan masukkan NIM yang benar (hanya angka).");
        }
        
    }
    if(n <=10){
        n+=10;
    }
    System.out.println("menghitung dari 1 sampai " + n);
        for(int i = 1; i <= n; i++){
            
        if(i % 3 == 0){
            System.out.print("#");
        }else if (i % 2 != 0 ){
            System.out.print("*");
        }else if(i == 10 || i == 15){
            continue;
        }else{
            System.out.print(i);
        }
        input.close();
    

}
}
}
