import java.util.Scanner;

public class MethodRerata2 {
  static int i = 0;

  //Method untuk menghitung total
  static double total() {
    Scanner input = new Scanner(System.in);
    double bil, total=0, rata2=0;
    char jwb = 'y';

    while(jwb == 'y') {
      i++;
      System.out.print("Masukkan bilangan : ");
      bil = input.nextDouble();
      total += bil;
      System.out.print("Ingin memasukkan bilangan lagi? [y/t] : ");
      jwb = input.next().charAt(0);
    }
    return total;
  }

  // Method untuk menghitung rata-rata
  static double rerata(double nilaiTotal, int jmlData) {
    return nilaiTotal / jmlData;
  }

  public static void main(String[] args) {
    double t = total();
    System.out.println("Nilai total data = " + t);
    System.out.println("Nilai total data = " + rerata(t,i));
  }
}