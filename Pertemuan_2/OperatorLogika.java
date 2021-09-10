public class OperatorLogika {
  public static void main(String[] args) {
    
    // Operator logika -> Operasi yang bisa kita lakukan pada tipe data boolean
    // Macam" Operator Logika : AND, OR, XOR, Negasi.

    boolean x, y, z;

    // AND / dan (&&)
    System.out.println("==== AND (&&) ====");
    x = false;
    y = false;
    z = (x && y);
    System.out.println(x + " && " + y + " = " + z);

    x = false;
    y = true;
    z = (x && y);
    System.out.println(x + " && " + y + " = " + z);

    x = true;
    y = false;
    z = (x && y);
    System.out.println(x + " && " + y + " = " + z);

    x = true;
    y = true;
    z = (x && y);
    System.out.println(x + " && " + y + " = " + z);

    // OR / atau (||)
    System.out.println("==== OR (||) ====");
    x = false;
    y = false;
    z = (x || y);
    System.out.println(x + " || " + y + " = " + z);

    x = false;
    y = true;
    z = (x || y);
    System.out.println(x + " || " + y + " = " + z);

    x = true;
    y = false;
    z = (x || y);
    System.out.println(x + " || " + y + " = " + z);

    x = true;
    y = true;
    z = (x || y);
    System.out.println(x + " || " + y + " = " + z);

    // XOR / exclusive or (^)
    System.out.println("==== XOR (^) ====");
    x = false;
    y = false;
    z = (x ^ y);
    System.out.println(x + " ^ " + y + " = " + z);

    x = false;
    y = true;
    z = (x ^ y);
    System.out.println(x + " ^ " + y + " = " + z);

    x = true;
    y = false;
    z = (x ^ y);
    System.out.println(x + " ^ " + y + " = " + z);

    x = true;
    y = true;
    z = (x ^ y);
    System.out.println(x + " ^ " + y + " = " + z);

    // NOT / Negasi
    System.out.println("==== NEGASI (!) ====");
    x = true;
    z = !x;
    System.out.println(x + " --> (!) " + z);

    x = false;
    z = !x;
    System.out.println(x + " --> (!) " + z);

  }
}