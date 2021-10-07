// Kelas Terbuka
// 08[OOP] - Reference pada Object

class Book{
  String title;
  String writer;

  Book(String title, String writer){
      this.title = title;
      this.writer = writer;
  }

  void display(){
      System.out.println("\nTitle\t: " + this.title);
      System.out.println("Penulis\t: " + this.writer);
  }
}


public class ReferenceYT{
  public static void main(String[] args) {
      Book book1 = new Book("Harry Potter", "J.K Rowling");
      book1.display();

      // Menampilkan address
      String addressBook1 = Integer.toHexString(System.identityHashCode(book1));
      System.out.println(addressBook1);
      
      // assignment object
      // book2 tidak mengcopy si object melainkan mengcopy referencenya karena menunjuk ke object yg sama yaitu book1
      // Beda cerita jika book2 kita buat sebagai object baru, dengan assign new Book, maka akan menghasilkan address yang berbeda
      Book book2 = book1;
      book2.display();
      String addressBook2 = Integer.toHexString(System.identityHashCode(book2));
      System.out.println(addressBook2);

      // karena book1 dan book2 berada pada address atau referensi yang sama
      // maka book2 jika diubah nilai atributnya akan berpengaruh ke book1
      book2.title = "Robin Hood";
      book1.display();
      book2.display();

      // kita akan memasukan object kedalam method fungsi
      fungsi(book2);
      book1.display();
      book2.display();
  }

  // Yang di pass dalam parameter fungsi tersebut bukan objectnya melainkan referencenya (Pass by reference)
  public static void fungsi(Book dataBook){
      String addressDatabook = Integer.toHexString(System.identityHashCode(dataBook));
      System.out.println("address dalam fungsi " + addressDatabook);
      dataBook.writer = "Paul Creswick";
  }
}