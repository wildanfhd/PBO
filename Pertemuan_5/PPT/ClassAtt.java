// Pertemuan 5.3 - Java Class Attributes
public class ClassAtt {
  int x = 5; // Ini adalah attribute
  int y = 8; // Ini adalah attribute
  int z;
  final int value = 100; // keyword final akan menetapkan nilai dari variabel dan tidak dapat diubah (konstanta)

  public static void main(String[] args) {
    ClassAtt myObj = new ClassAtt();
    // 1. Mengakses atribut
    System.out.println(myObj.x);

    // 2. Modify Attribut
    myObj.z = 46;
    System.out.println(myObj.x);

    // 3. Override Attribut - mengubah nilai x dari 5 menjadi 59
    myObj.x = 59;
    System.out.println(myObj.x);

    // 4. Modify attribut dengan keyword final
    // myObj.value = 90; // Jika dieksekusi maka akan error, karena nilai dari value sudah final
    // System.out.println(myObj.value);
    
    // 5. Multiple Objects
    ClassAtt obj1 = new ClassAtt();
    ClassAtt obj2 = new ClassAtt();
    obj1.x = 30;
    System.out.println(obj1.x); // Output : 30
    System.out.println(obj2.x); // Output : 5
  }
}
