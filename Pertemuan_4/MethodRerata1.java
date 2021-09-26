import java.util.Scanner;

public class MethodRerata1 {

  // Deklarasi method
  static void rerata() {
    double jml = 0, bil;
    double rata = 0;
    char ans;

    Scanner ourInput = new Scanner(System.in);

    // Menggunakan do-while
    do{
    System.out.print("Masukkan bilangan : ");
    bil = ourInput.nextDouble();
    jml += bil;

    System.out.print("Ingin memasukan bilangan lagi? [y/t] : ");
    ans = ourInput.next().charAt(0);
    } while(ans == 'y');

    rata = jml / 2;
    System.out.println("Total = " + jml);
    System.out.println("Rata - rata = " + rata);
  }

  static void rerataWhile() {
    double bil, jml = 0, rata2=0;
    char jwb = 'y';
    int i = 0;
    Scanner ourInput = new Scanner(System.in);

    while(jwb == 'y') {
      i++;
      System.out.print("Masukkan bilangan : ");
      bil = ourInput.nextDouble();
      jml += bil;
      System.out.print("Ingin memasukan bilangan lagi? [y/t] : ");
      jwb = ourInput.next().charAt(0);
    }
    rata2 = jml / i;
    System.out.println("Total = " + jml);
    System.out.println("Jumlah data yang diinputkan = " + i);
    System.out.println("Rata - rata = " + rata2);
  }


  public static void main(String[] args) {
    rerataWhile();
    //rerata(); 
  }
}
