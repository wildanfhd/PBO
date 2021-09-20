import java.util.*;

public class latihanDoWhile {
  public static void main(String[] args) {
    
    // Program untuk menjumlahkan angka dengan rentang

    // Deklarasi variabel
    int firstValue, lastValue, total, awal;

    // Program
    Scanner ourInput = new Scanner(System.in);
    System.out.print("Masukkan nilai awal = ");
    firstValue  = ourInput.nextInt();
    System.out.print("Masukkan nilai akhir = ");
    lastValue = ourInput.nextInt();

    total = 0;

    do {
      total += firstValue;
      System.out.println("ditambah " + firstValue + " menjadi " + total );
      firstValue++;
    } while(firstValue <= lastValue);
    
    }
  }