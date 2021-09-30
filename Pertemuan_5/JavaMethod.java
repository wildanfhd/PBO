// Pertemuan 5.4 - Java Class Method

public class JavaMethod {

  // Deklarasi Attribute
  static String frontName, lastName;
  static int age; 

  // Membuat Class method
  static void greeting(String pesan) {
    // Inisialisasi nilai ke variabel
    frontName = "Jamal";
    lastName = "Susanto";
    age = 23;

    System.out.println("Halo nama saya " + JavaMethod.frontName + " " + JavaMethod.lastName + " , Umur saya " + JavaMethod.age );
    System.out.println(pesan);
  }

  public static void main(String[] args) {
    JavaMethod myObj = new JavaMethod();
    myObj.greeting("Halo Dunia!");
  }
}