public class EWalletPayment implements PaymentMethod {
    String nama;
    double jumlahSaldo;
    double nominalTransaksi;

    EWalletPayment(String nama, int jumlahSaldo,int nominalTransaksi){
        this.nama=nama;
        this.jumlahSaldo=jumlahSaldo;
        this.nominalTransaksi=nominalTransaksi;
    }

    public void processPayment(){
        System.out.println("Saldo awal: "+getBalance());
        System.out.println("Memproses pembayaran sebesar: "+nominalTransaksi);
        if(jumlahSaldo>=nominalTransaksi){
            jumlahSaldo=jumlahSaldo-(nominalTransaksi+getTransactionFee());
            System.out.println("Pembayaran berhasil! " +
                    "\nsisa saldo: "+jumlahSaldo);
        }else{
            System.out.println("saldo tidak cukup, transaksi gagal!");
        }
    }
    public String getPaymentDetails(){
        return ("Detail Transaksi: Pembayaran dilakukan melalui "+nama);
    }
    public double getTransactionFee(){
        return 2000;
    }
    public double getBalance(){
        return jumlahSaldo;
    }
}
