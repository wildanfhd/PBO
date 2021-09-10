import java.util.Scanner;

public class Switches {
  public static void main(String[] args) {
    // Switch case 

    /*
    Struktur Switch case :

    switch(ekspresi){
      case pilihan:
        statement
    }
    */
    String pilihan;

    Scanner ourInput = new Scanner(System.in);

    System.out.print("Panggil nama : ");
    pilihan = ourInput.next();

    // Ekspresinya berupa satuan (int, long, byte, short) , String atau char
    switch(pilihan){
      case "jamal":
          System.out.println("Saya jamal, hadir!!");
          break;
      case "ucup":
          System.out.println("Saya ucup, hadir!!");
          break;
      default:
          System.out.println("Saya otong, hadir!!");
    }
    System.out.println("Program Selesai");
  }
}