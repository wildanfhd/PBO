// Pertemuan 5.6 - Java Constructor

public class JavaCons1 {

  // - Constructor adalah sebuah method special yang digunakan untuk menginisialisasi object
  // - Constructor akan otomatis terpanggil pada saat kita membuat object dari class tersebut
  // - Constructor dapat digunakan untuk memberikan atau meng-set initial value dari attribut object tersebut

  int x;

  // Ini adalah constructor untuk class JavaCons
  public JavaCons1() {
    x = 10; // Set the initial value for the class atribute x
  }

  public static void main(String[] args) {
    JavaCons1 myObj = new JavaCons1(); // Membuat object dari class JavaCons (akan otomatis memanggil constructornya)
    System.out.println(myObj.x); // Print nilai dari x
  }
}