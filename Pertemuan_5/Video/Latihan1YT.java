// Kelas Terbuka
// 06[OOP] - Latihan Part 1 dan 2

// Player
class Player {
  String name;
  double health;
  int level;
  // object member
  Weapon weapon;
  Armor armor;

  Player(String name, double health) {
    this.name = name;
    this.health = health;
  }
  
  void attack(Player opponent) {
    double attackPower = this.weapon.attackPower;
    System.out.println(this.name + " attacking " + opponent.name + " with " + attackPower + " damage");
    opponent.defence(attackPower);
  }

  void defence(double attackPower) {
    
    // Akan mengambil damage
    double damage;
    if(this.armor.defencePower < attackPower) {
      damage = attackPower - this.armor.defencePower;
    } else {
      damage = 0;
    }
    this.health -= damage; // Setiap damage yang masuk akan mengurangi health
    System.out.println(this.name + " gets damage by " + damage);
  }

  void equipWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  void equipArmor(Armor armor) {
    this.armor = armor;
  }

  void display() {
    System.out.println("\nName : " + this.name);
    System.out.println("Health : " + this.health + " HP");
    this.weapon.display();
    this.armor.display();
  }
}
// Weapon
class Weapon {
  double attackPower;
  String name;


  Weapon(String name, double attackPower) {
    this.name = name;
    this.attackPower = attackPower;
  }

  void display() {
    System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower );
  }
}
// Armor
class Armor {
  double defencePower;
  String name;

  Armor(String name, double defencePower) {
    this.name = name;
    this.defencePower = defencePower;
  }

  void display() {
    System.out.println("Armor : " + this.name + " , Defence : " + this.defencePower );
  }
}

public class Latihan1YT {
  public static void main(String[] args) {
    
    // membuat object Player
    Player player1 = new Player("Jamal", 100);
    Player player2 = new Player("Marlo", 100);

    // membuat object Weapon
    Weapon sword = new Weapon("Sword", 15);
    Weapon knife = new Weapon("Knife", 11);

    // membuat object Armor
    Armor vest = new Armor("Vest", 10);
    Armor mark2 = new Armor("Mark II", 10);

    // Equip weapon dan armor
    // Player 1 \\
    player1.equipWeapon(sword);
    player1.equipArmor(vest);
    player1.display();

    // Player 2 \\
    player2.equipWeapon(knife);
    player2.equipArmor(mark2);
    player2.display();

    System.out.println("\n----WAR ZONE----");
    System.out.println("\n---Round 1---\n");
    player1.attack(player2);
    player1.display();
    player2.display();
    System.out.println("\n---Round 2---\n");
    player2.attack(player1);
    player1.display();
    player2.display();
  }
}