import java.util.Scanner;

abstract class Manusia{
  public abstract String isiNama();
  public abstract int isiUmur();
}

class Pegawai extends Manusia{
  private String nama;
  private int umur, NIP;
  private Scanner ourInput = new Scanner(System.in);

  @Override
  public String isiNama(){
    System.out.print("Masukkan Nama Lengkap: ");
    this.nama = ourInput.nextLine();
    return this.nama;
  }

  @Override
  public int isiUmur(){
    System.out.print("Masukkan Umur: ");
    this.umur = ourInput.nextInt();
    return this.umur;
  }

  public int isiNIP(){
    System.out.print("Masukkan NIP: ");
    this.NIP = ourInput.nextInt();
    return this.NIP;
  }

  public void showData(){
    System.out.println("\nNama : " + this.nama);
    System.out.println("Umur : " + this.umur);
    System.out.println("NIP : " + this.NIP);
  }
}


public class LatAbs{
  public static void main(String[] args) {
    Pegawai jamal = new Pegawai();
    jamal.isiNama();
    jamal.isiUmur();
    jamal.isiNIP();
    jamal.showData();
  }
}