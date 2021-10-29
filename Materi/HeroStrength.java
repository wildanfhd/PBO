

public class HeroStrength extends Hero{
  double defencePower;

  // Overriding Methods - Object yang memanggil method akan mencari ke Class asalnya dahulu, baru jika tidak ditemukan akan mencari ke Parent Classnya.
  void display(){
    System.out.println("Hero Strength");
    System.out.println("Hero Name : " + this.name);
    System.out.println("Def Power : " + this.defencePower);
  }
}