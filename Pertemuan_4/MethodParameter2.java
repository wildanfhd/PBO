public class MethodParameter2 {
    public static void main(String[] args) {
        // y = (x + 2) * x
        
        int x, y;
        x = 10;
        y = count(x);
        
        System.out.println("x = " + x + ", " + "y = " + y);
        
        x = 30;
        y = count(x);
        
        System.out.println("x = " + x + ", " + "y = " + y);
        
        x = 50;
        y = count(x);
        
        System.out.println("x = " + x + ", " + "y = " + y);
    }
    
    static int count(int input) {
        int hasil;
        
        hasil = (input + 2) * input;
//        hasil = input * input;
        return hasil;
    }
}
