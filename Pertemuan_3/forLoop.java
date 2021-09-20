public class forLoop {
  public static void main(String[] args) {
  
    // For Loop - Adalah jenis perulangan yang akan dieksekusi jika sebuah kondisi terpenuhi
    /* for(inisialisasi; kondisi; step nilai) {
      aksi
    }
     */

    System.out.println("ini adalah awal program");

    System.out.println("loop pertama");

    for(int nilai = 0; nilai <= 10 ; nilai++){

        System.out.println("for loop ke-" + nilai);
        
    }


    System.out.println("loop kedua");

    for(int nilai = 0; nilai < 10 ; nilai++){

        System.out.println("for loop ke-" + nilai);

    }

    System.out.println("loop ketiga");

    for(int nilai = 10; nilai >= 5 ; nilai--){

        System.out.println("for loop ke-" + nilai);

    }

    System.out.println("loop keempat");

    // Inisialisasi variabel
    int nilai = 0;

    for(; nilai < 10 ;){

        System.out.println("for loop ke-" + nilai);
        nilai++;// Step nilai
    }

    System.out.println("ini adalah akhir program");

  }
}