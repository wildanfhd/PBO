
public class Pegawai extends Orang{

  private String NIP;
  private String jabatan;

  public void setNIP(String NIP) {
    this.NIP = NIP;
  }

  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
  }

  public String getNIP() {
    return this.NIP;
  }

  public String getJabatan() {
    return this.jabatan;
  }

  public void display() {
    System.out.println("\nNama : " + this.nama);
    System.out.println("Umur : " + this.umur);
    System.out.println("Jenis Kelamin : " + this.jenisKelamin);
    System.out.println("NIP : " + this.NIP);
    System.out.println("Jabatan : " + this.jabatan);
  }

  public static void main(String[] args) {
    Pegawai pns = new Pegawai();
    pns.setNama("Jamal");
    pns.setUmur(25);
    pns.setJenisKelamin("Laki-laki");
    pns.setNIP("202");
    pns.setJabatan("Direktur");

    // Custom View
    System.out.println("Nama : " + pns.getNama());
    System.out.println("NIP : " + pns.getNIP());


    // Display
    pns.display();
  
  }
  
}