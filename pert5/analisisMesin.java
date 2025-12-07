class analisisMesin {
    public static void main(String[] args) {

        // Buat array untuk menyimpan berbagai jenis mesin
        defaultMesin[] a = new defaultMesin[5];
        // Isi array dengan objek mesinMotor
        // Isi array dengan objek mesinTraktor
        // Isi array dengan objek mesinTraktorListrik
        a[0]=new mesinMotor("Honda Supra X", 125, "Bebek");
        a[1]=new mesinTraktor("Kubota MX5200", 520, 5);
        a[2]=new mesinTraktorListrik("EcoTrac Z900",300,4.2,70);
        a[3]=new mesinMotor("Yamaha R25", 250,"Sport");
        a[4]=new mesinTraktorListrik("Volta FarmX",500,3.5,80);

        System.out.println("=== DATA MESIN MEGATECH ===");
        // Loop untuk menampilkan info masing-masing mesin
        for(int b=0;b<5;b++){
            a[b].tampilInfo();
            System.out.println("kategori: "+a[b].kategoriMesin());
            System.out.println("performa: "+a[b].nilaiPerforma()+"\n");
        }

        System.out.println("=== SUARA MESIN ===");
        // Loop untuk menghasilkan suara tiap mesin (instanceof)
        for (defaultMesin c:a){
            System.out.print(c.nama+" -> ");
            if(c instanceof mesinMotor){
                ((mesinMotor)c).suaraMesin();
            }else if(c instanceof mesinTraktorListrik){
                ((mesinTraktorListrik)c).suaraMesin();
            }else if(c instanceof mesinTraktor){
                ((mesinTraktor)c).suaraMesin();
            }
        }
        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");

        // Logika menemukan mesin dengan performa tertinggi
        defaultMesin terbaik=a[0];
        for(defaultMesin d:a){
            if(d.nilaiPerforma()> terbaik.nilaiPerforma()){
                terbaik=d;
            }
        }
        System.out.println(terbaik.nama+" -> "+terbaik.nilaiPerforma());

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");

        // Logika sorting 3 performa tertinggi
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j].nilaiPerforma()<a[j+1].nilaiPerforma()){
                    defaultMesin tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int z=0;z<3;z++){
            System.out.println(a[z].nama+" -> "+a[z].nilaiPerforma());
        }
    }
}
