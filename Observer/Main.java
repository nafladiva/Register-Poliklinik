public class Main {
    public static void main(String[] args) {
        Subject antrianDokterMata = new DokterMata();
        Subject antrianDokterTHT = new DokterTHT();
        Subject antrianDokterPD = new DokterPenyakitDalam();

        Observer pasienA = new PasienMata("Farah", 1);
        Observer pasienB = new PasienTHT("Nazira", 1);
        Observer pasienC = new PasienMata("Acut", 2);
        Observer pasienD = new PasienTHT("Diana", 2);
        Observer pasienE = new PasienMata("Maimunah", 3);
        Observer pasienF = new PasienPenyakitDalam("Saipul", 1);

        antrianDokterMata.addObserver(pasienA);
        antrianDokterTHT.addObserver(pasienB);
        antrianDokterMata.addObserver(pasienC);
        antrianDokterMata.addObserver(pasienE);

        antrianDokterMata.notifyObservers();
        antrianDokterTHT.notifyObservers();
        antrianDokterMata.removeObserver(pasienA);
        antrianDokterTHT.removeObserver(pasienB);
        
        System.out.println("=================================================");

        antrianDokterTHT.addObserver(pasienD);

        antrianDokterMata.notifyObservers();
        antrianDokterTHT.notifyObservers();
        antrianDokterMata.removeObserver(pasienC);
        antrianDokterTHT.removeObserver(pasienB);

        System.out.println("=================================================");

        antrianDokterTHT.removeObserver(pasienD);
        antrianDokterPD.addObserver(pasienF);

        antrianDokterMata.notifyObservers();
        antrianDokterPD.notifyObservers();
    }
}
