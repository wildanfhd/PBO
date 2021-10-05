// Kelas Terbuka
// 05[OOP] - Methods

class Mahasiswa {
  // Data Member
  String nama; // Ini adalah this.nama
  String NIM; // ini adalah this.NIM

  // Constructor 
  Mahasiswa(String nama, String NIM) {
    // this berfungsi untuk merepresentasikan/mewakilkan class. jadi this merujuk ke class utamanya
    // this.nama merupakan representasi variabel "nama" dari class Mahasiswa
    // nilainya diisi dengan parameter nama yang ada pada constructor
    this.nama = nama;
    this.NIM = NIM;
  }

  // 1. Method tanpa return dan tanpa parameter
  void show() {
    System.out.println("Nama : " + this.nama);
    System.out.println("NIM : " + this.NIM);
  }

  // 2. Method tanpa return dan dengan parameter
  void setNama(String nama) {
    this.nama = nama;
  }

  // 3. Method dengan return dan tanpa parameter
  String getNama() {
    return this.nama;
    // Karena this.nama sudah ada di constructor maka pada saat pembuatan object, nama akan otomatis terisi oleh argumen
  }

  String getNIM() {
    return this.NIM;
  }

  // 4. Method dengan return dan dengan parameter
  String sayHello(String pesan) {
    return pesan + " juga, nama saya adalah " + this.nama;  
  }
}

// class Dosen {
//   Dosen(String nama) {
//     this.nama = nama;
//   }
// }

public class MethodYT {
  public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("Jamal", "19900827");
    // method
    mahasiswa1.show();
    mahasiswa1.setNama("Saipul");
    mahasiswa1.show();

    String iniNama = mahasiswa1.getNama();
    String iniNIM = mahasiswa1.getNIM();

    System.out.println(iniNama);
    System.out.println(iniNIM);

    String isi = mahasiswa1.sayHello("Halo");
    System.out.println(isi); 

    // Dosen dosen1 = new Dosen();
    // dosen1.nama; // jika di run maka akan error karena nama sudah ditempel oleh class Mahasiswa   
  }
}
