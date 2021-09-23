public class Method1 {
  //Deklarasi Method
  static void methodKu() {
    int i=0;
    System.out.println("Methodku dipanggil");
    while(i < 5) {
      System.out.println("Nilai ke-" + i);
      i++;
    }
  }


  public static void main(String[] args) {
    // Pemanggilan method static
    methodKu();
  }
}