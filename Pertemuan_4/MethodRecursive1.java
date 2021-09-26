public class MethodRecursive1 {

	public static void main(String[] args) {
    // Saat function sum dipanggil, itu membuat parameter k ke dalam jumlah seluruh angka yang lebih kecil dari x dan mengembalikan nilainya.
		int result = sum(6);
		System.out.println(result);
	}

	public static int sum(int x) {
		if(x > 0) {
			return x + sum(x - 1);
		} else {
			return 0;
		}
	}
}
