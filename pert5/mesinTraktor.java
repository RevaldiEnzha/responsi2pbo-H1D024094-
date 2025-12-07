class mesinTraktor extends defaultMesin {
    // Variabel khusus mesin traktor (kapasitasTarik)
    double kapasitasTarik;

    // Constructor
    mesinTraktor(String nama, int tenagaHp, double kapasitasTarik) {
        super(nama, tenagaHp);
        this.kapasitasTarik=kapasitasTarik;
    }

    void tampilInfo() {
        // Override info mesin traktor
        System.out.println("Mesin: "+nama+" | tenaga : "+tenagaHp+" HP | kapasitas tarik: "+kapasitasTarik);
    }

    double nilaiPerforma() {
        // Override performa traktor
        return (tenagaHp*0.9) + (kapasitasTarik*10);
    }

    String kategoriMesin() {
        // Override kategori traktor
        return "Mesin Traktor";
    }

    void suaraMesin() {
        // Suara traktor
        System.out.println("GGGRRRR! Hidup mesinnn!");
    }
}
