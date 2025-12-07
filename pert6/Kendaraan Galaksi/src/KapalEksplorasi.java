public class KapalEksplorasi extends KendaraanGalaksi {
    private int modulScan;   // kemampuan scan planet (level 1–5)

    KapalEksplorasi(String nama, int kapasitasPenumpang, int modulScan){
        super(nama,kapasitasPenumpang);
        this.modulScan=modulScan;
    }

    void aktifkanMesin(){
        if(getEnergi()<15){
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        }else{
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }
    void jelajah(int jarak){
        int konsum=(2/100*getEnergi())*jarak;
        if(konsum<=getEnergi() && getEnergi()>=15){
            setEnergi(getEnergi()-konsum);
            System.out.println("kapal menjelajah sejauh "+jarak+" km");
        }else{
            System.out.println(("Kapal sedang tidak dapat menjelajah"));
        }
    }
    // Konsumsi energi: 2% per 1 km (lebih efisien).
    // Jika cukup → kurangi energi & tampilkan jarak perjalanan.


    void isiEnergi(int jumlah){
        System.out.println("mengisi. energi saat ini: "+getEnergi());
        while(getEnergi()<100){
            setEnergi(getEnergi()+jumlah);
            if(getEnergi()>100){
                setEnergi(100);
            }
        }
        System.out.println("pengisian selesai!");
    }

    void scanPlanet(String namaPlanet){
        System.out.println("Melakukan scan pada planet "+namaPlanet+" dengan modul level "+modulScan);
    }
}
