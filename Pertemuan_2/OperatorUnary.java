public class OperatorUnary {
  public static void main(String[] args) {
    
    //Unary = Operasi yang dilakukan pada satu variable

    // 1. Unary + dan -
    int nilai1 = 1;
    System.out.printf("unary '+', %d menjadi %d\n",nilai1, +nilai1);// 1
    System.out.printf("unary '-', %d menjadi %d\n",nilai1, -nilai1);// -1

    // 2. Unary decrement dan increment
    //Increment
    int nilai2 = 10;
    nilai2++;
    System.out.println("nilai dengan '++' menjadi = " + nilai2);

    //Decrement
    int nilai3 = 10;
    nilai3--;
    System.out.println("nilai dengan '--' menjadi = " + nilai3);

    //Prefix Increment
    //Nilai akan ditambahkan terlebih dahulu, baru ditampilkan 
    int a = 5;
    System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a);

    //Postfix Increment
    //Nilai akan diprint terlebih dahulu, baru ditambah
    int b = 5;
    System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++);
    System.out.printf("nilai hasil dari postfix menjadi = %d \n", b);

    // 3. Unary boolean dengan (!) not untuk negasi

    boolean jamal = true;
    System.out.println("nilai boolean = " + jamal);
    System.out.println("nilai boolean = " + !jamal);
  }
}