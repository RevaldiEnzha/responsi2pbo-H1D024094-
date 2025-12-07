class defaultMesin {
    // Variabel umum mesin (namaMesin, tenagaHP)
    String nama;
    int tenagaHp;

    // Constructor
    defaultMesin(String nama, int tenagaHp) {
        this.nama=nama;
        this.tenagaHp=tenagaHp;
    }

    void tampilInfo() {
        // Tampilkan info dasar mesin
        System.out.println("Mesin: "+nama+" | tenaga : "+tenagaHp+" HP");
    }

    double nilaiPerforma() {
        // Hitung performa dasar
        return tenagaHp*1.0;
    }

    String kategoriMesin() {
        // Kategori default
        return "Mesin umum";
    }
}
