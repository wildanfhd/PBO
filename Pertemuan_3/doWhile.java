public class doWhile {
  public static void main(String[] args) {
    
    // Do While loop - Perulangan yang minimal dieksekusi satu kali terlepas dari apapun kondisinya
    // dan akan terus berlanjut jika kondisi terpenuhi

    /* do {
      aksi/perintah
    } while (kondisi)
    */

    System.out.println("Ini adalah awal program");

    // Deklarasi variabel
    int x = 0;
    boolean kondisi = true;

    // Logika Program
    do {
      x++;
      System.out.println("do while ke-" + x);

      if (x == 1) {
        kondisi = false;
      }
    } while(kondisi);

    System.out.println("Ini adalah akhir program");
  }
}