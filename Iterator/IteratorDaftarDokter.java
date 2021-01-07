public class IteratorDaftarDokter implements Iterator {

    private Dokter[] dokter;
    private int position;

    public IteratorDaftarDokter(Dokter[] dokter) {
        this.dokter = dokter;
    }

    @Override
    public boolean hasNext() {
        if(position >= dokter.length) {
            return false;
        }
        return true;
    }

    @Override
    public Dokter next() {
        return dokter[position++];
    }
    
}
