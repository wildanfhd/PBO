// Pertemuan 5.6 - Java Constructor
// Constructor Parameter
public class JavaCons2 {
  int x;

  public JavaCons2(int y) {
    x = y;
  }

  public static void main(String[] args) {
    JavaCons2 myObj = new JavaCons2(6);
    System.out.println(myObj.x);
  }
}
