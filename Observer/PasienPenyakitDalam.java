public class PasienPenyakitDalam implements Observer {
    private String namaPasien;
    private int noAntrianPasien;

    public PasienPenyakitDalam(String namaPasien, int noAntrian) {
        this.namaPasien = namaPasien;
        this.noAntrianPasien = noAntrian;
    }

    @Override
    public void update(int noAntrianSekarang) {
        System.out.println(namaPasien);
        System.out.println("Nomor Antrian Anda : " + getNoAntrianPasien());
        int estimasi = (noAntrianPasien - noAntrianSekarang) * 15;
        System.out.println("Estimasi waktu Anda : " + estimasi + " menit");
        
        if(estimasi == 0) {
            System.out.println("Anda sudah bisa masuk ke ruangan\n");
        } else if(estimasi <= 20) {
            System.out.println("Anda sebaiknya sudah berada di poliklinik\n");
        } else {
            System.out.println("Harap datang 20 menit lebih cepat!!\n");
        }
    }

    public int getNoAntrianPasien() {
        return noAntrianPasien;
    }
}
