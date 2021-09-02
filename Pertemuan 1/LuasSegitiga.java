//Menghitung Luas Segitiga
import java.util.Scanner;

public class LuasSegitiga {
  public static void main(String[] args) {
    double luas, alas, tinggi;
    Scanner myInput = new Scanner(System.in);

    //Input nilai alas dan tinggi
    System.out.print("Masukkan alas = ");
    alas = myInput.nextDouble();
    System.out.print("Masukkan tinggi = ");
    tinggi = myInput.nextDouble();

    //Menghitung luas segitiga
    luas = 0.5 * alas * tinggi;
    System.out.println("luas = 0.5" + " x " + alas + " x " + tinggi + " = " + luas + " cm2");
  }
}
