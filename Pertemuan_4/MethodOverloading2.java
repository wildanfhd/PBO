public class MethodOverloading2 {
    public static void main(String[] args) {
        
        // Method Overload - method yang penamaannya sama namun hasil dari methodnya memiliki tipe data yang berbeda-beda
      
        int hasilInt = jumlah(9, 6);
        printNilai(hasilInt);
        
        float hasilFloat = jumlah(10.5f, 6);
        printNilai(hasilFloat);
        
        hasilFloat = jumlah(9, 5.5f);
        printNilai(hasilFloat);
        
        hasilInt = jumlah(15, 16, 19);
        printNilai(hasilInt);
        
        printNilai(20);
        printNilai(37.5d);
        printNilai(29.3f);
        printNilai(5);
    }
    
    private static int jumlah(int angkaInt1, int angkaInt2, int angkaInt3) {
        return angkaInt1 + angkaInt2 + angkaInt3;
    }
    
    private static float jumlah(int angkaInt2, float angkaFloat1) {
        return angkaFloat1 + angkaInt2;
    }
    
    private static float jumlah(float angkaFloat1, int angkaInt2) {
        return angkaFloat1 + angkaInt2;
    }
    
    private static int jumlah(int angkaInt1, int angkaInt2) {
        return angkaInt1 + angkaInt2;
    }
    
    private static void printNilai(float angkaFloat) {
        System.out.println("Angka ini adalah float dengan nilai = " + angkaFloat);
    }
    
    private static void printNilai(double angkaDouble) {
        System.out.println("Angka ini adalah double dengan nilai = " + angkaDouble);
    }
    
    private static void printNilai(int angkaInt) {
        System.out.println("Angka ini adalah integer dengan nilai = " + angkaInt);
    }
}
