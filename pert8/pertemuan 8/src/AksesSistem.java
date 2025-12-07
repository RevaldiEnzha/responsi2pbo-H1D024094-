public interface AksesSistem {
    void login(String pin);
    void logout();

    void getRoleAkses();
    // DEKLARASI DEFAULT METHOD: getRoleAkses
    // Tidak menerima parameter
    // Mengembalikan nilai: String "Staff Biasa"

}