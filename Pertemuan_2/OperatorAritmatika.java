public class OperatorAritmatika {
  public static void main(String[] args) {
    // Operasi Aritmatika

        int nilai1 = 10;
        int nilai2 = 5;

        int hasil;

        // 1. penjumlahan
        hasil = nilai1 + nilai2;
        System.out.println(nilai1 + " + " + nilai2 + " = " + hasil);

        // 2. pengurangan
        hasil = nilai1 - nilai2;
        System.out.printf("%d - %d = %d \n",nilai1,nilai2,hasil);

        // 3. perkalian
        hasil = nilai1 * nilai2;
        System.out.printf("%d x %d = %d \n",nilai1,nilai2,hasil);

        // 4. pembagian
        hasil = nilai1 / nilai2;
        System.out.printf("%d / %d = %d \n",nilai1,nilai2,hasil);

        float a = 8;
        float b = 6;
        float hasilFloat = a/b;
        System.out.println(a + " / " + b + " = " + hasilFloat);

        // 5. modulus (sisa pembagian)
        hasil = nilai1 % nilai2;
        System.out.printf("%d %% %d = %d \n",nilai1,nilai2,hasil);


    
  }
}