public class OperatorKomparasi {
  public static void main(String[] args) {
    // Operator komparasi akan menghasilkan nilai dalam bentuk boolean
    int x, y;
    boolean hasilKomparasi;

    // 1. Operator Equal atau Persamaan
    System.out.println("-----PERSAMAAN");
    x = 10;
    y = 10;
    hasilKomparasi = (x == y);
    System.out.printf("%d == %d --> %s \n", x, y, hasilKomparasi);

    x = 10;
    y = 15;
    hasilKomparasi = (x == y);
    System.out.printf("%d == %d --> %s \n", x, y, hasilKomparasi);

    // 2. Operator Not Equal atau Pertidaksamaan
    System.out.println("-----PERTIDAKSAMAAN");
    x = 10;
    y = 10;
    hasilKomparasi = (x != y);
    System.out.printf("%d != %d --> %s \n", x, y, hasilKomparasi);

    x = 10;
    y = 15;
    hasilKomparasi = (x != y);
    System.out.printf("%d != %d --> %s \n", x, y, hasilKomparasi);

    // 3. Operator Less than atau kurang dari
    System.out.println("-----KURANG dari");
    x = 8;
    y = 10;
    hasilKomparasi = (x < y);
    System.out.printf("%d < %d --> %s \n", x, y, hasilKomparasi);

    x = 15;
    y = 10;
    hasilKomparasi = (x < y);
    System.out.printf("%d < %d --> %s \n", x, y, hasilKomparasi);

    // 4. Operator Greater than atau lebih dari
    System.out.println("-----LEBIH dari");
    x = 8;
    y = 10;
    hasilKomparasi = (x > y);
    System.out.printf("%d > %d --> %s \n", x, y, hasilKomparasi);

    x = 15;
    y = 10;
    hasilKomparasi = (x > y);
    System.out.printf("%d > %d --> %s \n", x, y, hasilKomparasi);

    // 5. Operator Less than equal atau kurang dari sama dengan
    System.out.println("-----KURANG DARI SAMA DENGAN ");
    x = 8;
    y = 10;
    hasilKomparasi = (x <= y);
    System.out.printf("%d <= %d --> %s \n", x, y, hasilKomparasi);

    x = 10;
    y = 10;
    hasilKomparasi = (x <= y);
    System.out.printf("%d <= %d --> %s \n", x, y, hasilKomparasi);

    // 6. Operator Greater than equal atau lebih dari sama dengan
    System.out.println("-----LEBIH DARI SAMA DENGAN ");
    x = 8;
    y = 10;
    hasilKomparasi = (x >= y);
    System.out.printf("%d >= %d --> %s \n", x, y, hasilKomparasi);

    x = 15;
    y = 10;
    hasilKomparasi = (x >= y);
    System.out.printf("%d >= %d --> %s \n", x, y, hasilKomparasi);
  }
}