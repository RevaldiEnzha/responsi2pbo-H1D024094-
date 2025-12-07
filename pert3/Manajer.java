// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    double tunjangan;
    
    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    Manajer(String nama, double gajiPokok, double tunjangan){
        super(nama,gajiPokok);
        this.tunjangan=tunjangan;
    }
    
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("nama: "+nama+" | gaji pokok: Rp "+gajiPokok+" | tunjangan: Rp "+tunjangan);
        System.out.println("total pendapatan: "+(gajiPokok+tunjangan));
    }
}