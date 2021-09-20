public class loopingBersarang {
  public static void main(String[] args) {
    for(int m = 0; m < 5; m++){
      for(int n = 0; n < 5; n++){
          System.out.print("* ");
      }
      System.out.print("\n");
  }

  System.out.print("\n");

  for(int m = 0; m < 5; m++){
      for(int n = 0; n < 5; n++){
          System.out.print("* ");
          if(m == n){
              break;
          }
      }
      System.out.print("\n");
  }

  System.out.print("\n");

  for(int m = 0; m < 5; m++){
      for(int n = 0; n < 5; n++){
          System.out.print("* ");
          if ( (m+n) == 4){
              break;
          }
      }
      System.out.print("\n");
  }

  System.out.print("\n");

  for(int m = 0; m < 9; m++){
      for(int n = 0; n < 9; n++){
          System.out.print("* ");
          if (m == n){
              break;
          } else if ( (m+n) == 8){
              break;
          }
      }
      System.out.print("\n");
  }
  }
}