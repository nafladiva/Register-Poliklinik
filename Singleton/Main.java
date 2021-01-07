public class Main {
    public static void main(String[] args) {
        PoliklinikSingleton poliklinik = PoliklinikSingleton.getInstance();

        poliklinik.showDetail();
    }
}
