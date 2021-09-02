//Mengkonversi Jam, Menit, dan Detik ke Detik
import java.util.Scanner;

public class KonversiJam {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);
    int hour, min, sec;
    float toHour, toMin, toSeconds;

    System.out.print("Masukkan jam = ");
    hour = myInput.nextInt();
    System.out.print("Masukkan menit = ");
    min = myInput.nextInt();
    System.out.print("Masukkan detik = ");
    sec = myInput.nextInt();
    //System.out.println(hour + " Jam " + min + " Menit " + sec + "Detik");

    //Pengkonversian
    toHour = hour*3600;
    toMin = min*60;
    toSeconds = toHour + toMin + sec;
    
    System.out.println( " " + hour + " : " + min + " : " + sec + " : " + " dikonversi ke detik = " + toSeconds);
  }
}
