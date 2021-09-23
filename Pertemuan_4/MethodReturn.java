public class MethodReturn {

  // tipe data method juga harus sama dengan apa yang direturn di dalamnya
  static double nilaiTugas(int x) {
    double nilai = 0.2 * x;
    return nilai;
  }

  public static void main(String[] args) {
    // Cara 1
    System.out.println("Nilai = " + nilaiTugas(80));

    // Cara 2
    double nilai;
    nilai = nilaiTugas(80);
    System.out.println("Nilai = " + nilai);

    // Cara 3
    if(nilaiTugas(80) > 15) {
      System.out.println("Anda Lulus");
    }
  }
}

