public class Mobil {
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private double jarakTempuh;
    private double waktu;

    public void setNopol(String n) {
        nopol = n;
    }
    
    public void setWarna(String s) {
        warna = s;
    }
    
    public void setMerk(String m) {
        merk = m;
    }
    
    public void setKecepatan(int k) {
        kecepatan = k;
    }

    public void setJarakTempuh(double j) {
        jarakTempuh = j;
    }
    
    public void setWaktu(double w) {
        waktu = w;
    }
    
    public void hitungJarakTempuh(int waktu) {
        this.waktu = waktu;
        jarakTempuh = kecepatan * waktu;
    }
    
    public void tampilkanKecepatanMs() {
        double kecepatanMs = kecepatan / 3.6;
        System.out.println("Kecepatan dalam meter per detik: " + String.format("%.3f", kecepatanMs) + " m/s");
    }
    
    public void display() {
        System.out.println("Mobil bermerk " + merk);
        System.out.println("bernomor polisi " + nopol);
        System.out.println("serta memililki warna " + warna);
        System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
        tampilkanKecepatanMs();
        System.out.println("menempuh jarak sejauh " + jarakTempuh + " km");
        System.out.println("waktu yang dibutuhkan: " + waktu + " jam");
    }
}