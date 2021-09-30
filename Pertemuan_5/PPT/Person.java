// Pertemuan 5.3 - Java Class Attributes

// Multiple Attribute pada Java Class and Attributes
public class Person {
  String frontName = "Jamal";
  String lastName = "Susanto";
  int umur = 25;
  
  public static void main(String[] args) {
    Person myObj = new Person();
    System.out.println("Name : " + myObj.frontName + " " + myObj.lastName);
    System.out.println("Age : " + myObj.umur);
  }
}
