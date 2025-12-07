public interface KaryawanKontrak {
    double hitungGaji(int jamKerja);
    void perpanjangKontrak(int durasiBulan);

    String getStatusCuti();
    // DEKLARASI DEFAULT METHOD: getStatusCuti
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Tersedia 12 hari"

}