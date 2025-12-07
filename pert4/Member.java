class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    int poin;
    String level;

    // TODO: Buat constructor dengan super
    Member(String namaLengkap, String nomorIdentitas, int totalBelanja, int poin, String level){
        super(namaLengkap,nomorIdentitas,totalBelanja);
        this.poin=poin;
        this.level=level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("poin reward: "+poin+" | level: "+level);
    }
}
