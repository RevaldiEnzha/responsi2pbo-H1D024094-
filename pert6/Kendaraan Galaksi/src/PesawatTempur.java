public class PesawatTempur extends KendaraanGalaksi {
    private int jumlahRudal;

    PesawatTempur(String nama, int kapasitasPenumpang, int jumlahRudal){
        super(nama,kapasitasPenumpang);
        this.jumlahRudal=jumlahRudal;
    }
    void aktifkanMesin(){
        if(getEnergi()<20){
            System.out.println("Energi terlalu rendah! Mesin tidak bisa diaktifkan");
        }else{
            System.out.println("Mesin pesawat tempur diaktifkan");
        }
    }

    void jelajah(int jarak){
        int konsum=(3/100*getEnergi())*jarak;
        if(getEnergi()>konsum){
            setEnergi(getEnergi()-konsum);
            System.out.println("Pesawat tempur menjelajah sejauh "+jarak +" km");
        }else{
            System.out.println("gagal");
        }
    }

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

    void tembakRudal(int jumlah){
        if(jumlahRudal>jumlah){
            jumlahRudal=jumlahRudal-jumlah;
            System.out.println("Menembakkan "+jumlah+" rudal!");
        }else{
            System.out.println("gagal!");
        }
    }
}
