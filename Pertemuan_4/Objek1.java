public class Objek1 {
  public void pesan(String nama) {
    System.out.println(nama + " Selamat datang di OOP java");
  }

  static void test() {
    System.out.println("Test aja");
  }

  public static void main(String[] args) {
    Objek1 obj1 = new Objek1();
    Objek1 obj2 = new Objek1();
    obj1.pesan("Jamal");  
    obj2.pesan("Ucup");
    // Method test() dapat dipanggil oleh obj2 karena menggunakan keyword static, sehingga method test() ditetapkan/dimiliki oleh class Objek1 yang merupakan parent dari obj1 dan obj 2
    obj2.test();
    Objek1.test();
  }
}