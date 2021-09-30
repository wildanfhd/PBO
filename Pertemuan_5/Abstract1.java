// Pertemuan 5.5 - Java Modifiers

// Code from filename : Person.java
// Abstract Class

abstract class Person {
  public String frontName = "Jamal";
  public String lastName = "Susanto";
  public int umur = 25;
  public abstract void study(); // Abstract method
  


  class Student extends Person {
    public int graduationYear = 2019;
    public void study() {
      System.out.println("Studying All Day");
    }
  }
}
// End Code from filename : Person.java

// Code from filename : MyClass.java
class MyClass {
  public static void main(String[] args) {
    // Create an object of the Student Class (which inherits attributes and methods From Person)
    Student myObj = new Student();

    System.out.println("Name : " + myObj.frontName + " " + myObj.lastName);
    System.out.println("Age : " + myObj.umur);
    System.out.println("Graduation Year : " + myObj.graduationYear);
    myObj.study();
  }
}
// End Code from filename : MyClass.java