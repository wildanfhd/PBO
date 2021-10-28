public class RunAnak {
  public static void main(String[] args) {
    Anak jamal = new Anak();
    jamal.ngomong();
    System.out.println(jamal.warnaKulit);
    jamal.aksesRambut();
    jamal.setKaki("Kaki gajah");
    System.out.println(jamal.getKaki());
    System.out.println("Kaki jamal = " + jamal.getKaki());

    
  }
}