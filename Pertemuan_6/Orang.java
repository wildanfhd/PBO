
class Orang {
  protected String nama;
  protected int umur;
  protected String jenisKelamin;

  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setUmur(int umur) {
    this.umur = umur;
  }
  public void setJenisKelamin(String jenis) {
    this.jenisKelamin = jenis;
  }

  public String getNama() {
    return this.nama;
  }

  public int getUmur() {
    return this.umur;
  }

  public String getJenisKelamin() {
    return this.jenisKelamin;
  }

}