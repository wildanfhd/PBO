import java.util.Scanner;

class findData{
    protected char pilihan;
    protected int cari, track=0;
    protected int[] listData = new int[10];
    protected Scanner ourInput = new Scanner(System.in);

    private void setInput(){
        for(int i = 0; i < listData.length; i++) {
            System.out.print("Masukkan data ke-" + i + " : ");
            this.listData[i] = ourInput.nextInt();
        }

        System.out.print("Apakah ingin mencari data? [Y/T]: ");
        this.pilihan = ourInput.next().charAt(0);
    }

    public void searchData(){
        setInput();

        // Kondisi
        if((this.pilihan == 'Y') || (this.pilihan == 'y')){
            System.out.print("Masukkan data yang dicari : ");
            this.cari = ourInput.nextInt();
            for(int j = 0; j < listData.length; j++){
                if(this.cari == listData[j]) {
                    this.cari = listData[j];
                    System.out.println("Data yang dicari : " + this.cari);
                    this.track = 1;
                }
            }

            if(this.track == 0) {
                System.out.println("Maaf, data yang anda cari tidak ditemukan");
            }
        } else {
            System.out.println("Anda tidak ingin mencari data, program akan keluar");
        }
    }
}

public class FindArray {
    public static void main(String[] args) {
        findData kelas = new findData();
        kelas.searchData();
    }
}
