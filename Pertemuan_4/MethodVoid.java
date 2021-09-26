public class MethodVoid {
    public static void main(String[] args) {
        
        // void artinya hampa 
        
        System.out.println(contoh());
        
        voidFunction("Ini outputnya");
        selamatMalam("Bapak");
    }
    
    private static void selamatMalam(String input) {
        System.out.println("Selamat malam " + input);
    }
    
    // Ini adalah method void atau method yang tidak mengembalikan nilai
    // tidak ada operasi atau kalkulasi di dalamnya
    private static void voidFunction(String input) {
        System.out.println(input);
    }
    
    // Ini adalah method return atau method yang mengembalikan nilai
    // Sehingga menggunakan return untuk mengembalikan nilainya (20.90)
    private static float contoh() {
        return 20.0f;
    }
}
