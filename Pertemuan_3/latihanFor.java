import java.util.*;

public class latihanFor {
  public static void main(String[] args) {
    
    // Program untuk menjumlahkan angka dengan rentang

    // Deklarasi variabel
    int firstValue, lastValue, total, awal;

    // Program
    Scanner ourInput = new Scanner(System.in);
    System.out.print("Masukkan nilai awal = ");
    awal  = ourInput.nextInt();
    System.out.print("Masukkan nilai akhir = ");
    lastValue = ourInput.nextInt();

    total = 0;

    for(firstValue = awal; firstValue <= lastValue; firstValue++ ){
      total += firstValue;
      System.out.println("ditambah " + firstValue + " menjadi " + total );
    }
  }
}