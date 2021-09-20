import java.util.Scanner;

public class latihanFibonacci {
  public static void main(String[] args) {
    
    // Latihan Deret Fibonacci
    // Fibonacci - Deret perhitungan matematika
    // fib_n = fib(n-1) + fib(n-2)
    // Contoh : fib_5 = fib(4) + fib(3)
    
    // Menghitung nilai deret fibonacci ke-n

    // Deklarasi variabel
    int f_n, f_n_1, f_n_2;

    // Program
    Scanner ourInput = new Scanner(System.in);
    System.out.print("Mengambil nilai fibonacci ke - : ");
    int n = ourInput.nextInt();

    f_n_2 = 0;
    f_n_1 = 1;
    f_n = 1;

    for(int i = 1; i <= n; i++) {
      System.out.println("nilai  ke -" + i + " adalah " + f_n);
      f_n = f_n_1 + f_n_2;
      f_n_2 = f_n_1;
      f_n_1 = f_n;
    }
  }
}