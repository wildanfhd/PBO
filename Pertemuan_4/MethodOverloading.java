public class MethodOverloading {
  static int plusMethod(int c, int d) {
    return c + d;
  }
  
  static double plusMethod(double c, double d) {
    return c + d;
  }
  
  public static void main(String[] args) {
    int myNum1 = plusMethod(10, 5);
    double myNum2 = plusMethod(5.5, 7.23);
    System.out.println("int : " + myNum1);
    System.out.println("double : " + myNum2);
  }
}
