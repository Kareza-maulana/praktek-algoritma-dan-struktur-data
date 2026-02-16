public class array {
    public static void main(String[] args) {
        System.out.println("menghitung ip semester mahasiswa");
        java.util.Scanner input = new java.util.Scanner(System.in);

    String[] mata_kuliah = {
        "MK pancasila", 
        "MK teknologi informasi",
        "MK bahasa inggris",
        "MK matematika dasar",
        "MK dasar pemrograman",
        "MK praktikum daspro",
        "MK k3"
    };
    double[] nilai = new double[mata_kuliah.length];
    for ( int i = 0; i < mata_kuliah.length; i++){
        System.out.print("masukan nilai angka untuk " + mata_kuliah[i] + " :");
        nilai[i] = input.nextDouble();

    }
    String[] grade = new String[mata_kuliah.length];
    double[] ip_semester = new double[mata_kuliah.length];

    for(int i =0 ; i< mata_kuliah.length; i++){
        
        if (nilai[i] >= 85){
            grade[i] = "A";
            ip_semester[i] = 4.0;
        } else if (nilai[i] >= 70 && nilai[i] < 85){
            grade[i] = "B+";
            ip_semester[i] = 3.5;
        } else if (nilai[i] >= 65 && nilai[i] < 70){
            grade[i] = "B";
            ip_semester[i] = 3.0;
        } else if (nilai[i] >= 60 && nilai[i] < 65){
            grade[i] = "C+";
            ip_semester[i] = 2.5;
        } else if (nilai[i] >= 50 && nilai[i] < 60){
            grade[i] = "C";
            ip_semester[i] = 2.0;
        } else if( nilai[i] >= 39 && nilai[i] < 50){
            grade[i] = "D";
            ip_semester[i] = 1.0;
        } else {
            grade[i] = "E";
            ip_semester[i] = 0.0;
        }
    }
    double total_ip = 0.0;
    for ( int i = 0; i < ip_semester.length; i++){
        total_ip += ip_semester[i];
    }
    double ipk = total_ip / mata_kuliah.length;

    System.out.println("==========================================");
    System.out.println("Hasil Nilai akhir dan IP Semester:");
    System.out.println("==========================================");
    System.out.println();

    System.out.println("Matakuliah\t\tNilai\tGrade\tIP Semester");
    for ( int i = 0; i < mata_kuliah.length; i++){
        System.out.printf("%-20s\t%.2f\t%s\t%.1f\n", mata_kuliah[i], nilai[i], grade[i], ip_semester[i]);
    }
    System.out.println("==========================================");
    System.out.printf("IPK: %.2f\n", ipk);
}
}

