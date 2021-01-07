public class Main {
    public static void main(String[] args) {
        Aggregate list = new DaftarDokter();

        Iterator iterator = list.createIterator();

        while(iterator.hasNext()) {
            Dokter currentDokter = iterator.next();
            System.out.println("Nama Dokter : " + currentDokter.getName());
            System.out.println("Spesialis : " + currentDokter.getSpesialis() + "\n");
        }
    }
}
