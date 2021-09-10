import java.util.*;

public class kalkulatorIfElse {
  public static void main(String[] args) {
    
    // Deklarasi variable
    Scanner ourInput;
    float x, y, result;
    char operator;

    ourInput = new Scanner(System.in);

    System.out.print("Nilai x = ");
    x = ourInput.nextFloat();
    System.out.print("Operator = ");
    operator = ourInput.next().charAt(0);
    System.out.print("Nilai y = ");
    y = ourInput.nextFloat();

    System.out.println("Input user : " + x + " " + operator + " " + y);

    // Operator yang bisa diinput : x / + - %
    if(operator == '+') {
      // Penjumlahan
      result = x + y;
      System.out.println("Hasil = " + result);
    } else if (operator == '-') {
      // Pengurangan
      result = x - y;
      System.out.println("Hasil = " + result);
    } else if (operator == 'x') {
      // Perkalian
      result = x * y;
      System.out.println("Hasil = " + result);
    } else if (operator == '/') {
      // Pembagian
      result = x / y;
      System.out.println("Hasil = " + result);
    } else if (operator == '%') {
      // Modulus
      result = x % y;
      System.out.println("Hasil = " + result);
    } else {
      System.out.println("Operator tidak ditemukan");
    }
  }
}