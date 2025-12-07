public abstract class KendaraanGalaksi {
    private String nama;
    private int energi;
    private int kapasitasPenumpang;

    KendaraanGalaksi(String nama, int kapasitasPenumpang){
        this.nama=nama;
        this.kapasitasPenumpang=kapasitasPenumpang;
        energi=100;
    }

    String getNama(){
        return nama;
    }
    int getEnergi(){
        return energi;
    }
    int getKapasitasPenumpang(){
        return kapasitasPenumpang;
    }

    void setEnergi(int energi){
        if(energi<100) {
            this.energi = energi;
        }
    }

    final void tampilStatus(){
        System.out.println("nama kendaraan: "+nama+" | Energi: "+energi+
                "% | kapasitas: "+kapasitasPenumpang+" orang");
    }

    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}
