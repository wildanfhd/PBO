abstract class Hewan{
  // Abstract method : Method yang tidak memiliki isi/body
  public abstract void suara();

  // Regular Method
  public void tidur(){
    System.out.println("zZzzZzZ");
  }
}

class Sapi extends Hewan{
  // Mengoverride method suara
  public void suara(){
    System.out.println("Suara sapi : MoOoOoO");
  }
}

public class Abstrak1{
  public static void main(String[] args) {
    Sapi sapi = new Sapi();
    sapi.suara();
    sapi.tidur();
  }
}