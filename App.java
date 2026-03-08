public class App {
    public static void main(String[] args) {
    //instansiasi objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(50);
        m1.setMerk("Toyota");
        m1.setNopol("AB 1231 UA");
        m1.setWarna("Merah");
        m1.hitungJarakTempuh(2); // Hitung jarak dengan waktu 2 jam
        m1.display();

        System.out.println("---------------");
        
        //instansiasi objek bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(100);
        m2.setMerk("Mitsubishi");
        m2.setNopol("N 1134 AG");
        m2.setWarna("Biru");
        m2.hitungJarakTempuh(3); // Hitung jarak dengan waktu 3 jam
        m2.display();

        System.out.println("---------------");
        System.out.println("Atribut pada objek m1 diubah.");

        //mengubah warna dari objek m1
        m1.setWarna("Hijau");
        
        //menampilkan hasil perubahan
        m1.display();
    }
}