public class OperasiBitwise {
  public static void main(String[] args) {
    
    // Operator Bitwise --> Operator untuk melakukan operasi pada nilai bit

    // Nilai max byte = 127
    // Nilai min byte = -128
    byte h = 3;
    byte i, j;
    String h_bits, i_bits, j_bits;

    // Operator SHIFT LEFT
    System.out.println("==== SHIFT LEFT (<<)");
    h_bits = String.format("%8s", Integer.toBinaryString(h)).replace(' ', '0');
    System.out.printf("%s = %d \n", h_bits, h);
    i = (byte)(h << 3);
    i_bits = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
    System.out.printf("%s = %d \n", i_bits, i);

    //Operator SHIFT RIGHT
    System.out.println("==== SHIFT RIGHT (>>)");
    h_bits = String.format("%8s", Integer.toBinaryString(h)).replace(' ', '0');
    System.out.printf("%s = %d \n", h_bits, h);
    i = (byte)(h >> 3);
    i_bits = String.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
    System.out.printf("%s = %d \n", i_bits, i);

    //Operator bitwise AND
    System.out.println("===== BITWISE AND (&)");
    h = 24;
    h_bits = String.format("%8s",Integer.toBinaryString(h)).replace(' ','0');
    System.out.printf("%s = %d \n",h_bits, h);
    i = 12;
    i_bits = String.format("%8s",Integer.toBinaryString(i)).replace(' ','0');
    System.out.printf("%s = %d \n",i_bits, i);
    System.out.println("--------------------AND");
    j = (byte)(h & i);
    j_bits = String.format("%8s",Integer.toBinaryString(j)).replace(' ','0');
    System.out.printf("%s = %d \n",j_bits, j);

    //Operator bitwise OR
    System.out.println("===== BITWISE OR (|)");
    h = 24;
    h_bits = String.format("%8s",Integer.toBinaryString(h)).replace(' ','0');
    System.out.printf("%s = %d \n",h_bits, h);
    i = 12;
    i_bits = String.format("%8s",Integer.toBinaryString(i)).replace(' ','0');
    System.out.printf("%s = %d \n",i_bits, i);
    System.out.println("--------------------OR");
    j = (byte)(h | i);
    j_bits = String.format("%8s",Integer.toBinaryString(j)).replace(' ','0');
    System.out.printf("%s = %d \n",j_bits, j);

    //Operator bitwise XOR
    System.out.println("===== BITWISE XOR (^)");
    h = 24;
    h_bits = String.format("%8s",Integer.toBinaryString(h)).replace(' ','0');
    System.out.printf("%s = %d \n",h_bits, h);
    i = 12;
    i_bits = String.format("%8s",Integer.toBinaryString(i)).replace(' ','0');
    System.out.printf("%s = %d \n",i_bits, i);
    System.out.println("--------------------XOR");
    j = (byte)(h ^ i);
    j_bits = String.format("%8s",Integer.toBinaryString(j)).replace(' ','0');
    System.out.printf("%s = %d \n",j_bits, j);

    //Operasi Negasi / NOT
    System.out.println("===== BITWISE NOT (~)");
    h = 24;
    i = (byte) (~h);
    h_bits = String.format("%8s",Integer.toBinaryString(h)).replace(' ','0');
    System.out.printf("%s = %d \n",h_bits, h);
    System.out.println("--------------------NOT");
    i_bits = String.format("%8s",Integer.toBinaryString(i).substring(24));
    System.out.printf("%s = %d \n",i_bits, i);

    
  }
}