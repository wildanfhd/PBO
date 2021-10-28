
class Hewan {
  protected String nama;
  protected String jenisHewan;
  protected String gigi;

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setJenis(String jenisHewan) {
    this.jenisHewan = jenisHewan;
  }

  public void setGigi(String gigi) {
    this.gigi = gigi;
  }

  public String getNama() {
    return this.nama;
  }

  public String getJenis() {
    return this.jenisHewan;
  }
  
  public String getGigi() {
    return this.gigi;
  }
  
  public static void main(String[] args) {
    System.out.println("Test");
  }
}