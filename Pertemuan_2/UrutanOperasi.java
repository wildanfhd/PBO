import java.util.Scanner;

public class UrutanOperasi {
  public static void main(String[] args) {
    
    /*
      Ini adalah pengelompokkan operasi aritmatika
      *Perkalian dan Pembagian akan dilakukan terlebih dahulu
    */

    /*
      Jika ada pembagian dan perkalian dalam satu operasi, maka operasi akan dilakukan-
      dari kiri ke kanan
    */

    int result = 10 * 5 / 5;
    System.out.println(result);
    result = 10 + 5 - 2;
    System.out.println(result);

    // Menggunakan pengelompokkan operasi dengan () / tanda kurung
    result = 90 / (10 + 8);
    System.out.println(result);

    Scanner ourInput = new Scanner(System.in);// Membuat input untuk user

    //Perhitungan persamaan kuadrat
    System.out.println("MENGHITUNG PERSAMAAN KUADRAT");
    // Deklarasi Variable
    int x, y, z;

    // Proses Input
    System.out.print("Nilai x = ");
    x = ourInput.nextInt();
    System.out.print("Nilai y = ");
    y = ourInput.nextInt();
    System.out.print("Nilai z = ");
    z = ourInput.nextInt();

    // Kalkulasi persamaan kuadrat
    int sqrt = (x * y * y) + z;

    System.out.println("Nilai persamaan kuadrat = " + sqrt);

  }
}