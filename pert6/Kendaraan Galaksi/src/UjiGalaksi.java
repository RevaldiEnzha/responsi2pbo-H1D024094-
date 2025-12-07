public class UjiGalaksi {
    public static void main(String[] args) {
        PesawatTempur a=new PesawatTempur("Astra-Fury", 2, 8);
        KapalEksplorasi b=new KapalEksplorasi("Voyager X", 10, 4);

        a.aktifkanMesin();
        a.jelajah(10);
        a.jelajah(30);
        a.tembakRudal(3);
        a.tampilStatus();

        System.out.println("\n");
        b.aktifkanMesin();
        b.jelajah(15);
        b.scanPlanet("Kepler-442b");
        b.tampilStatus();
    }
}
