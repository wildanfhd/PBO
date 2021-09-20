public class iniWhile {
  public static void main(String[] args) {
    
    /* 
    While loop - Jenis perulangan dimana perintah akan tereksekusi jika suatu kondisi terpenuhi (jika tidak diketahui jumlahnya) 
    */

    /* while(kondisi) {
      aksi
    } 
    */

    //Deklarasi variabel
    int x = 0;
    boolean kondisi = true;

    // Program
    System.out.println("Ini adalah awal program");

    while (kondisi) {
      System.out.println("while loop ke-" + x);

      if(x == 10){
        kondisi = false;
      }

      x++;
    }

    System.out.println("Ini adalah akhir program");
  }
}