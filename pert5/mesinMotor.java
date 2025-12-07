class mesinMotor extends defaultMesin {
    // Variabel khusus mesin motor (tipeMotor)
    String tipe;

    // Constructor
    mesinMotor(String nama, int tenagaHp, String tipe) {
        super(nama, tenagaHp);
        this.tipe=tipe;
    }

    @Override
    void tampilInfo() {
        // Override info mesin motor
        System.out.println("Mesin: "+nama+" | tenaga : "+tenagaHp+" HP | tipe: "+tipe);
    }

    @Override
    double nilaiPerforma() {
        // Override performa mesin motor
        return tenagaHp*1.2;
    }

    @Override
    String kategoriMesin() {
        // Override kategori
        return "Mesin Motor";
    }

    void suaraMesin() {
        // Suara mesin motor
        System.out.println("Brummm! Mesin motor menyala!");
    }
}
