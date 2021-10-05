// Kelas Terbuka
// 04[OOP] - Constructor

//  Class Tanpa Constructor
class Polos {
  String iniString;
  int iniInteger;
}

//  Class dengan Constructor
class Mahasiswa {
  String nama;
  String NIM;
  String jurusan;

  // Constructor dipanggil saat object pertama kali dibuat (new Mahasiswa() atau Mahasiswa mahasiswa1 = new Mahasiswa())
  // Mahasiswa(){
  //     System.out.println("ini adalah constructor");
  // }

  //  -- Constuctor dengan Parameter --
  Mahasiswa(String iniNama, String iniNIM, String iniJurusan) {
    nama = iniNama;
    NIM = iniNIM;
    jurusan = iniJurusan;

    System.out.println(nama);
    System.out.println(NIM);
    System.out.println(jurusan);
  }
}

public class JavaConsYT {
  public static void main(String[] args) {

    Mahasiswa mahasiswa1 = new Mahasiswa("Jamal", "201908988", "Teknik Perpadian");
    Mahasiswa mahasiswa2 = new Mahasiswa("Ucup", "201902722", "Teknik Pertanahan");



    // Polos objPolos = new Polos();
    // objPolos.iniString = "Halo";
    // objPolos.iniInteger = 5;

    // System.out.println(objPolos.iniString);
    // System.out.println(objPolos.iniInteger);
  }
}
