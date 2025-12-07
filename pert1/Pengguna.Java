class Pengguna {
    // Tuliskan state (variabel) yang diperlukan di sini
    // Jangan lupa tambahkan konstanta faktorAktivitas
    int umur;
    double beratBadan;
    double tinggiBadan;
    final double faktorAktivitas=1.2;

    double hitungBMI() {
        // Lengkapi method ini
        double tinggiMeter=tinggiBadan/100;
        double BMI=beratBadan/(tinggiMeter*tinggiMeter);
        return BMI;
    }

    void tampilKategori(double BMI) {
        // Lengkapi method ini
        if (BMI < 18.5){
            System.out.println("Kategori: Kurus");
        }else if(BMI<25){
            System.out.println("Kategori: Normal");
        } else if(BMI>=25) {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        // Lengkapi method ini
        double kalori = beratBadan*faktorAktivitas*10;
        return kalori;
    }

    void tampilInfo() {
        // Lengkapi method ini
        System.out.println("Umur: "+umur);
        System.out.println("Berat: "+beratBadan);
        System.out.println("Tinggi: "+tinggiBadan);
        System.out.println("BMI: "+hitungBMI());
        tampilKategori(hitungBMI());
        System.out.println("Kebutuhan kalori: "+hitungKalori());
    }
}