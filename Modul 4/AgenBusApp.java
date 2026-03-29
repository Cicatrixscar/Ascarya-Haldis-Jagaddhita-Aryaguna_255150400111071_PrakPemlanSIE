public class AgenBusApp {
    public static void main(String[] args) {
        TiketOverload t1 = new TiketOverload();
        t1.pesan();
        t1.tampil();
        
        TiketBus t2 = new TiketBus();
        t2.pesan();
        t2.tampil();
        
        TiketBus t3 = new TiketBus();
        t3.pesan("Kasino", "Bandung", 650, 450000);
        t3.tampil();
        
        t1.pesan("Indro", "Makassar");
        t1.tampil();
        t2.pesan("Dono", "Makassar");
        t2.tampil();

        TiketBus t4 = new TiketBus();
        t4.pesan("Leon S. Kennedy");
        t4.tampil();

        TiketBus tiketEksklusif = new TiketBus() {
            @Override
            public void tampil() {
                System.out.println("=== TIKET EKSKLUSIF ===");
                System.out.println("Nama Penumpang : " + this.namaPenumpang);
                System.out.println("Tujuan Kota    : " + this.tujuan);
                System.out.println("Total Harga    : " + this.hargaTiket);
                System.out.println("=======================");
                System.out.println("--------------------");
            }
        };
        tiketEksklusif.pesan("Marin", "Iwatsuki", 150, 1500000);
        tiketEksklusif.tampil();
    }
}