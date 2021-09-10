public class nestedIf {
  public static void main(String[] args) {
    
    // Nested if atau if bersarang

    int x = 2;
    int y = 10;

    System.out.println("Ini adalah awal dari program");

    if(x == 5) {
      if(y == 10) {
        System.out.println("Ini adalah dimana x = 5 dan y = 10");
      } else {
        System.out.println("ini adalah dimana x = 5 dan y bukan 10");
      }
    } else {
      System.out.println("Ini adalah dimana x salah");
    }
    System.out.println("Ini adalah akhir dari program");
  }
}