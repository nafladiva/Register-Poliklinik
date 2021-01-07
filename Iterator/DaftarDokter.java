public class DaftarDokter implements Aggregate {

    private Dokter[] dokter;

    public DaftarDokter() {
        this.dokter = new Dokter[3];
        dokter[0] = new Dokter("dr. Zulfidiana, Sp.M", "Mata");
        dokter[1] = new Dokter("dr. Nafla Diva, Sp.PD", "Penyakit Dalam");
        dokter[2] = new Dokter("dr. Dinda Oktavia, Sp.THT", "THT");
    }

    @Override
    public Iterator createIterator() {
        return new IteratorDaftarDokter(dokter);
    }
    
}