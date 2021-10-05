// Kelas Terbuka
// 03[OOP] - Pengenalan Class dan Object

class Mahasiswa {
  String nama;
  String NIM;
  String jurusan;
  double IPK;
  int umur;
}


public class ClassObjYT {
  public static void main(String[] args) {
    
    // Pada Java class merupakan tipe data
    // Penulisan : tipeData identifier/namaVariabel = new tipeData();
    Mahasiswa mahasiswa1 = new Mahasiswa();
    mahasiswa1.nama = "Jamal";
    mahasiswa1.NIM = "2019085819";
    mahasiswa1.jurusan = "Teknik perikanan";
    mahasiswa1.IPK = 4.0;
    mahasiswa1.umur = 19;

    System.out.println(mahasiswa1.nama);
    System.out.println(mahasiswa1.NIM);
    System.out.println(mahasiswa1.jurusan);
    System.out.println(mahasiswa1.IPK);
    System.out.println(mahasiswa1.umur);
    
    // ALT + Shift + Down arrow untuk mengcopy
    // CTRL + D untuk replace bersamaan
    Mahasiswa mahasiswa2 = new Mahasiswa();
    mahasiswa2.nama = "Saipul";
    mahasiswa2.NIM = "2019089928";
    mahasiswa2.jurusan = "Teknik persawian";
    mahasiswa2.IPK = 3.9;
    mahasiswa2.umur = 21;

    System.out.println(mahasiswa2.nama);
    System.out.println(mahasiswa2.NIM);
    System.out.println(mahasiswa2.jurusan);
    System.out.println(mahasiswa2.IPK);
    System.out.println(mahasiswa2.umur);
  }
}