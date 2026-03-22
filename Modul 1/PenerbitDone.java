public class PenerbitDone {
    String nama;
    String kota = "Malang";
    
    PenerbitDone() {
        this.nama = "Springer";
    }
    PenerbitDone(String nama) {
        this.nama = nama;
    }
    PenerbitDone(String nama, String kota) {
        this.nama = nama;
        this.kota = kota;
    }
    
    public void display() {
        System.out.println("Penerbit " + nama);
        System.out.println("di Kota " + kota);
    }
}