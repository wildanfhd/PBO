import java.util.Scanner;

public class TernaryOp {
  public static void main(String[] args) {
    // Ternary operator 
    int input, hasil;

    Scanner ourInput = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    input = ourInput.nextInt();

    // Syntax ternary operator : variable x = ekspresi ? statement_true : statement_false
    hasil = input == 10 ? (input * input) : (input/2);

    System.out.println("Hasilnya = " + hasil);
  }
}