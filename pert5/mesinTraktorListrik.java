class mesinTraktorListrik extends mesinTraktor {
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)
    double kapasitasBaterai;

    // Constructor
    mesinTraktorListrik(String nama, int tenagaHp, double kapasitasTarik, double kapasitasBaterai) {
        super(nama, tenagaHp, kapasitasTarik);
        this.kapasitasBaterai=kapasitasBaterai;
    }

    void tampilInfo() {
        // Override info traktor listrik
        System.out.println("Mesin: "+nama+" | tenaga : "+tenagaHp+" HP | kapasitas tarik: "+kapasitasTarik);
    }

    double nilaiPerforma() {
        // Override performa traktor listrik
        return (tenagaHp * 1.1) + (kapasitasBaterai * 5);
    }

    String kategoriMesin() {
        // Override kategori listrik
        return "Mesin Traktor Listrik";
    }

    void suaraMesin() {
        // Suara traktor listrik
        System.out.println("Bzzzzz! Mesin traktor listrik aktif!");
    }
}
