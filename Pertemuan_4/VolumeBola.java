import java.util.Scanner;

public class VolumeBola {

  static double pi = 3.14;
  static double volume(double jari) {
    double volbola = (pi * jari*jari*jari)*4/3;
    return volbola;
  }

  public static void main(String[] args) {
    double jari, hasil;
    Scanner ourInput = new Scanner(System.in);
    System.out.print("Masukkan jari-jari : ");
    jari = ourInput.nextDouble();
    hasil = volume(jari);
    System.out.println("Jari-jari bola adalah " + jari);
    System.out.println("Volume bola adalah " + hasil);
  }
}