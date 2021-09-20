public class BreakContinueReturn {
  public static void main(String[] args) {
    
    //Break - Continue - Return
    // Keyword untuk Control Flow

    int x = 0;

    while(true){
      x++;

      if(x == 10){
        break;// Keyword untuk mengeluarkan paksa dari loop
      } else if(x == 5){
        continue; // Keyword untuk memulai aksi dari awal sehingga nilai yang dijadikan sebagai kondisi akan terskip
      } else if (x == 8){
        return;
      }

      System.out.println("Looping ke-" + x);
    }

    System.out.println("Akhir dari looping");
  
  }
}