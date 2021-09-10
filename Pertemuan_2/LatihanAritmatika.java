import java.util.Scanner;

public class LatihanAritmatika {
  public static void main(String[] args) {

    Scanner ourInput = new Scanner(System.in);
    double panjang, lebar, luas, tinggi, volume;

    // Menghitung luas Persegi Panjang
    // Luas = panjang * lebar

    System.out.println("----MENGHITUNG LUAS----");
    System.out.print("Panjang = ");
    panjang = ourInput.nextDouble();
    System.out.print("Lebar = ");
    lebar = ourInput.nextDouble();

    // Kalkulasi luas
    luas = panjang * lebar;
    System.out.println("Luas = " + luas);

    // Menghitung Volume Persegi Panjang
    // Volume = Luas * Tinggi
    System.out.println("----MENGHITUNG VOLUME----");
    System.out.print("tinggi = ");
    tinggi = ourInput.nextDouble();
    volume = luas * tinggi;
    System.out.println("volume = " + volume);
    
  }
}