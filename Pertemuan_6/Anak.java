
// Karena Class Manusia adalah package dan masih berada dalam satu folder, jadi tidak perlu menulis package
public class Anak extends Manusia {
  // Atribut rambut hanya bisa diakses di dalam class Anak karena memakai modifier private
  private String rambut = "Hitam";
  private String kaki;
  public void aksesRambut() {
    System.out.println("Rambut = " + this.rambut);
  }

  public void setKaki(String kaki) {
    this.kaki = kaki;
  }

  public String getKaki() {
    return this.kaki;
  }
}