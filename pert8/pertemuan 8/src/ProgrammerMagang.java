// CLASS ProgrammerMagang harus MENGIMPLEMENTASIKAN (implements) KaryawanKontrak dan AksesSistem
public class ProgrammerMagang implements KaryawanKontrak, AksesSistem{
    String nama;
    double gajiPerjam;
    String pinRahasia;
    boolean sedangLogin;

    ProgrammerMagang(String nama, double gajiPerjam, String pinRahasia){
        this.nama=nama;
        this.gajiPerjam=gajiPerjam;
        this.pinRahasia=pinRahasia;
        this.sedangLogin=false;
    }

    // @Override: IMPLEMENTASIKAN hitungGaji(int jamKerja)
    // LOGIKA: Hitung gaji (jamKerja * gajiPerJam) dan tampilkan hasilnya.
    public double hitungGaji(int jamKerja){
        double gaji=jamKerja*gajiPerjam;
        return gaji;
    }
    public void perpanjangKontrak(int durasiBulan){
        System.out.println("kontrak diperpanjang "+durasiBulan+" bulan");
    }
    public String getStatusCuti(){
        return ("Tersedia 5 hari");
    }

    public void login(String pin){
        if(pin==pinRahasia){
            sedangLogin=true;
            System.out.println("berhasil login, selamat datang "+nama+"!");
        }else{
            System.out.println("gagal login");
        }
    }
    public void logout(){
        sedangLogin=false;
        System.out.println("berhasil logout");
    }
    public void getRoleAkses(){
        System.out.println("Role akses: Magang IT");
    }
}