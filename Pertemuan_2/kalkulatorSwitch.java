import java.util.*;

public class kalkulatorSwitch {
  public static void main(String[] args) {
    // Deklarasi variable
    Scanner ourInput;
    float x, y, result;
    String operator;

    ourInput = new Scanner(System.in);

    System.out.print("Nilai x = ");
    x = ourInput.nextFloat();
    System.out.print("Operator = ");
    operator = ourInput.next();
    System.out.print("Nilai y = ");
    y = ourInput.nextFloat();

    switch(operator){
      case "+":
        // Penjumlahan
        result = x + y;
        System.out.println("Hasil = " + result);
        break;
      case "-":
        // Pengurangan
        result = x - y;
        System.out.println("Hasil = " + result);
        break;
      case "x":
        // Perkalian
        result = x * y;
        System.out.println("Hasil = " + result);
        break;
      case "/":
        // Pembagian
        result = x / y;
        System.out.println("Hasil = " + result);
        break;
      case "%":
        // Modulus
        result = x % y;
        System.out.println("Hasil = " + result);
        break;
      default:
        System.out.println("Operator " + operator + " tidak ditemukan");
    }
  }
}