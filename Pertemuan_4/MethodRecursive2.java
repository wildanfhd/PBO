import java.util.Scanner;

public class MethodRecursive2 {
  public static void main(String[] args) {
    int nilai;

    Scanner ourInput = new Scanner(System.in);
    
    System.out.print("Masukkan nilai: ");
    nilai = ourInput.nextInt();
    System.out.println("Anda memasukkan nilai: " + nilai);

    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
    System.out.println("Jumlah = " + jumlah);

    int faktorial = faktorial(nilai);
    System.out.println("Faktorial dari " + nilai + " adalah " + faktorial);
  }

  private static int faktorial(int param) {
    System.out.println("Parameter = " + param);

    if(param == 1) {
      return param;
    }

    return param * faktorial(param - 1);
  }

  private static int jumlahNilai(int param) {
    System.out.println("Parameter = " + param);

    if(param == 0) {
      return param;
    }

    return param + jumlahNilai(param - 1);
  }

  private static void printNilai(int param) {
    
    System.out.println("nilai :  " + param);

    if(param == 0) {
      return;
    } 
    param--;
    printNilai(param);
  }

}