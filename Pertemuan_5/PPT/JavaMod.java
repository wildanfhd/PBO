// Pertemuan 5.6 - Java Modifiers

public class JavaMod {

  // Access Modifiers

  // Modifier untuk Class :
  // 1. public - class yang memakai keyword public akan bisa diakses oleh class lainnya
  // 2. default - class yang memakkai keyword default hanya bisa diakses oleh class yang memiliki package yang sama

  // Modifier untuk attribute, method, dan constructor :
  // 1. public - codenya akan dapat diakses oleh seluruh class
  // 2. private - codenya akan dapat diakses oleh class yang mendeklarasikannya
  // 3. default - hanya dapat diakses pada package yang sama
  // 4. protected - hanya diakses pada package dan subclass yang sama

  // Non-Access Modifiers
  // Untuk Class :
  // 1. final - class tidak dapat diwariskan oleh class lain
  // 2. abstract - class ini tidak dapat digunakan untuk membuat object. Untuk mengaksesnya, class yang menggunakan abstract harus diwariskan dari class lain

  // Untuk attribute, method, dan constructor :
  // 1. final - Attribute atau method tidak dapat di override atau diubah
  // 2. static - Attribute dan method dimiliki oleh class yang mendeklarasikannya, daripada si object
  // 3. abstract - hanya bisa dipakai pada Abstract Class, dan hanya bisa menggunakan method
  // 4. transient - 
  // 5. synchronized - 
  // 6. volatile

  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    JavaMod myObj = new JavaMod();
    myObj.x = 20; // Akan menghasilkan error karena x adalah variabel final
    myObj.PI = 5.2; // Akan menghasilkan error karena PI adalah variabel final
    System.out.println(myObj.x); 
  }
}
