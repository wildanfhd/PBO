public class elseifStatement {
  public static void main(String[] args) {
    // if else if statement

    int nilai = 8;

    // Syntax if else if
    if (nilai == 5) {
      // Aksi 1
      System.out.println("ini adalah aksi 1");
    } else if (nilai == 8) {
      // Aksi 2 - Akan tereksekusi jika aksi 1 tidak terpenuhi
      System.out.println("ini adalah aksi 2");
    } else {
      System.out.println("Ini adalah aksi default atau aksi jika tidak ada kondisi yang memenuhi");
    }
    System.out.println("Ini adalah akhir dari program");
  }
}