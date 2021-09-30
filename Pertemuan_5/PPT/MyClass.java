// Pertemuan 5.2 - Java Classes and Objects

public class MyClass {
  int x = 5;
  String frontName = "Jamal";
  String lastName = "Susanto";
  int umur = 25;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println("Name : " + myObj.frontName + " " + myObj.lastName);
    System.out.println("Age : " + myObj.umur);
  }
}
