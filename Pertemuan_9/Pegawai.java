class Pegawai extends Manusia {
    private String gelarBelakang;

    public String getGelarBelakang() {
        return gelarBelakang;
    }

    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }

    @Override
    public void dataSingkat() {
        this.namaLengkap();
        System.out.println("Umur: " + this.getUmur() + " tahun");
    }

    @Override
    public void namaLengkap() {
        System.out.println("Nama pegawai : " + this.getNamaDepan() + " " + this.getNamaBelakang() +
                ", " + this.getGelarBelakang());
    }

    public static void main(String[] args) {
        Pegawai jamal = new Pegawai();
        jamal.setNamaDepan("Jamal");
        jamal.setNamaBelakang("Faturrahman");
        jamal.setUmur(25);
        jamal.setGelarBelakang("S.Kom");
        jamal.dataSingkat();
    }
}
