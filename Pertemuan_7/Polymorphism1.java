class Animal {
  public void suaraHewan(){
    System.out.println("Hewan Bersuara");
  }
}

class Sapi extends Animal {
  public void suaraHewan(){
    System.out.println("Sapi Bersuara MOOOOOOOO");
  }
}

class Harimau extends Animal {
  public void suaraHewan(){
    System.out.println("Harimau Bersuara ROARRRRR");
  }
}

class Polymorphism1 {
  public static void main(String[] args) throws Exception {
    try {
      Animal animalku = new Animal();
      Animal sapiKu = new Sapi();
      Animal harimauKu = new Harimau();
  
      animalku.suaraHewan();
      sapiKu.suaraHewan();
      harimauKu.suaraHewan();
    } catch (Exception e) {
      System.out.println(e);
    }
    
  }
}
