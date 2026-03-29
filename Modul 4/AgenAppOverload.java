public class AgenAppOverload {
    public static void main(String[] args) {
        TiketOverload t1 = new TiketOverload();
        t1.pesan();
        t1.tampil();
        
        TiketOverload t2 = new TiketOverload();
        t2.pesan("Ani", "Bandung");
        t2.tampil();
        
        TiketOverload t3 = new TiketOverload();
        t3.pesan("Cici", "Surabaya", 200, 100000);
        t3.tampil();

        TiketOverload t4 = new TiketOverload();
        t4.pesan("Dono", 60);
        t4.tampil();
    }
}