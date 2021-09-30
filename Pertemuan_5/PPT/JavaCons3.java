// Pertemuan 5.6 - Java Constructor
// Constructor Parameter
public class JavaCons3 {
  int modelYear;
  String modelName;

  public JavaCons3(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    JavaCons3 myCar = new JavaCons3(1967, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
