class BarangMusik {
    // Deklarasikan variabel/state yang diperlukan di sini
    String kode;
    String nama;
    double harga;
    int stok;
    
    // Constructor
    BarangMusik(String kode, String nama){
        this.kode=kode;
        this.nama=nama;
    }
    BarangMusik(String kode, String nama, double harga){
        this.kode=kode;
        this.nama=nama;
        this.harga=harga;
    }
    BarangMusik(String kode, String nama, double harga,int stok){
        this.kode=kode;
        this.nama=nama;
        this.harga=harga;
        this.stok=stok;
    }
    
    void ubahHarga(double hargaBaru) {
        this.harga=hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        stok=stok+jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat musik "+nama+" | Kode: "+kode+" | Harga: Rp "+harga+" | Stok: "+stok+" unit");
    }
}