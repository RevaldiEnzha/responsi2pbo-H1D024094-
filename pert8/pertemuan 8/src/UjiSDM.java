public class UjiSDM {
    public static void main(String[] args) {
        ProgrammerMagang a=new ProgrammerMagang("Andi", 50000.0, "1234");

        System.out.println("gaji Andi (160 jam) adalah: "+a.hitungGaji(160));
        System.out.println("status cuti tersedia:" +a.getStatusCuti());
        a.login("9999");
        a.login("1234");
        a.getRoleAkses();
        a.perpanjangKontrak(6);
        a.logout();
    }
}