import java.util.ArrayList;
import java.util.List;

public class DokterPenyakitDalam implements Subject {
    private List<Observer> listPasien = new ArrayList<Observer>();
    private int noAntrian = 0;

    @Override
    public void addObserver(Observer pasien) {
        listPasien.add(pasien);
    }

    @Override
    public void removeObserver(Observer pasien) {
        listPasien.remove(pasien);
    }

    @Override
    public void notifyObservers() {
        nextAntrian();
        System.out.println("\n=== NOMOR ANTRIAN DOKTER PENYAKIT DALAM SEKARANG : " + getAntrian() + " ===\n");
        for(Observer pasien: listPasien) {
            pasien.update(getAntrian());
        }
    }

    public void nextAntrian() {
        this.noAntrian++;
    }

    public int getAntrian() {
        return noAntrian;
    }
}
