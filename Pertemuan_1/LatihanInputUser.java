import java.util.Scanner;

public class LatihanInputUser {
  public static void main(String[] args) {
    //Input dari user
    int x, y;
    Scanner myInput = new Scanner(System.in);
    
    System.out.print("Masukkan Nilai x = ");
    x = myInput.nextInt();
    System.out.print("Masukkan Nilai y = ");
    y = myInput.nextInt();
    int total = x + y;
    System.out.println("Nilai x = " + x + ", Nilai y = " + y);
    System.out.println("total = " + x + " + " + y + " = " + total);

  }
}
