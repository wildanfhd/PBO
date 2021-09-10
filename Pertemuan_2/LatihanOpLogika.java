// Membuat sebuah program sederhana untuk menebak sebuah angka
import java.util.*;

public class LatihanOpLogika {
  public static void main(String[] args) {
    // Membuat sebuah objek untuk mengambil input dari user
    Scanner ourInput = new Scanner(System.in);

    // Deklarasi variable
    int correctValue = 5, guessedValue;
    boolean guessStatus;

    System.out.print("Masukan nilai tebakan anda : ");
    guessedValue = ourInput.nextInt();
    System.out.println("Nilai yang anda tebak adalah " + guessedValue);

    // Operasi logika
    guessStatus = (guessedValue == correctValue);
    System.out.println("Hasil tebakan anda : " + guessStatus);

    // Operasi aljabar boolean (and / or)
    System.out.print("Masukkan nilai antara 6 dan 12 : ");
    guessedValue = ourInput.nextInt();

    guessStatus = ((guessedValue >= 6) && (guessedValue <= 12));
    
    /*  Tabel kebenaran AND
        a | b | c
        0   0   0
        1   0   0
        0   1   0
        1   1   1
    */

    System.out.println("Hasil tebakan anda : " + guessStatus);

  }
}