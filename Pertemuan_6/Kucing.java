
public class Kucing extends Hewan {
  private String ras;
  private String karakteristik;

  public Kucing(String nama, String jenisHewan, String gigi) {
    this.nama = nama;
    this.jenisHewan = jenisHewan;
    this.gigi = gigi;
  }

  public void setRas(String ras) {
    this.ras = ras;
  }

  public void setKarakteristik(String karakter) {
    this.karakteristik = karakter;
  }

  public String getRas() {
    return this.ras;
  }

  public String getKarakteristik() {
    return this.karakteristik;
  }

  public void nyakar() {
    System.out.println("Si " + this.nama + " nyakar bos");
  }

  public void viewKucing() {
    System.out.println("Nama : " + this.nama);
    System.out.println("Jenis Hewan : " + this.jenisHewan);
    System.out.println("Gigi : " + this.gigi);
    System.out.println("Ras : " + this.ras);
    System.out.println("Karakteristik : " + this.karakteristik);
  }

  public static void main(String[] args) {
    Kucing bengal = new Kucing("Toto", "Carnivora", "Bertaring");
    // bengal.nama = "Kiko";
    // bengal.jenisHewan = "Carnivora";
    // bengal.gigi = "Taring";
    bengal.ras = "Bengal";
    bengal.karakteristik = "Agak barbar";

    // View Kucing
    bengal.viewKucing();
    bengal.nyakar();
  }
}