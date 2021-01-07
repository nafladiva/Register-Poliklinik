public class PoliklinikSingleton {
    private static PoliklinikSingleton poliklinik = null;
    private String nama;
    private String buka;
    private String tutup;

    private PoliklinikSingleton() {
        this.nama = "JooAndTae";
        this.buka = "09.00";
        this.tutup = "22.00";
    }

    public static PoliklinikSingleton getInstance() {
        if(poliklinik == null) {
            poliklinik = new PoliklinikSingleton();
        }
        return poliklinik;
    }

    public void showDetail() {
        System.out.println("Nama Poliklinik : " + nama);
        System.out.println("Jadwal buka : " + buka);
        System.out.println("Jadwal tutup : " + tutup);
    }
}
