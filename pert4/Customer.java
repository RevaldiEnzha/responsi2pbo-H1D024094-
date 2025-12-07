class Customer {
    // TODO: Buatkan atribut
    String namaLengkap;
    String nomorIdentitas;
    int totalBelanja;

    // TODO: Sediakan constructor
    Customer(String namaLengkap, String nomorIdentitas, int totalBelanja){
        this.namaLengkap=namaLengkap;
        this.nomorIdentitas=nomorIdentitas;
        this.totalBelanja=totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("nama: "+namaLengkap+" | ID: "+nomorIdentitas+" | total belanja: "+totalBelanja);
    }
}
