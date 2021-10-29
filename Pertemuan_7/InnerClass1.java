// Inner Class - Class yang berada di dalam class
// Untuk mengaksesnya kita harus membuat object Class Luarnya terlebih dahulu baru membuat object Class dalamnya.
// Class dalam dapat mengakses attribute atau method Class luarnya, sementara Class luar tidak bisa mengakses atribut atau method Class Innernya.
class OuterClass {
  int x = 10;

  static class InnerClass {
    int y = 5;
  }
}

public class InnerClass1 {
  public static void main(String[] args) {
    // OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = new OuterClass.InnerClass();

    System.out.println("Hasil = " + myInner.y); // 15
  }
}
