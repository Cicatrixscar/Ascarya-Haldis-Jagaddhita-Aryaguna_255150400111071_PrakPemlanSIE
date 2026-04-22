import java.util.*;

public class Antrian {
 
  public static void main(String[] args) { 
    LinkedList<String> queue = new LinkedList<>(); //Ubah bagian ini
    Scanner sc = new Scanner(System.in); 
    while (true) { 
      System.out.println("Menu Antrian Pelanggan:"); 
      System.out.println("1. Tambah Pelanggan"); 
      System.out.println("2. Layani Pelanggan"); 
      System.out.println("3. Tampilkan Antrian"); 
      System.out.println("4. Lihat Antrian Terdepan");
      System.out.println("5. Keluar"); 
      System.out.print("Pilih (1-5): "); 
      try { 
        int choice = sc.nextInt(); 
        sc.nextLine(); // consume newline 
        switch (choice) { 
          case 1: 
            System.out.print("Masukan Nama Pelanggan: "); 
            String nama = sc.nextLine();
            if (nama.equalsIgnoreCase("Budi")) { //Tambahkan logika if
              queue.addFirst(nama);
              System.out.println(nama + " ditambahkan ke antrian paling depan.");
            } else {
              queue.offer(nama);
              System.out.println(nama + " ditambahkan ke antrian."); 
            }
            break; 
          case 2: 
            if (queue.isEmpty()) 
              System.out.println("Antrian kosong."); 
            else { 
              String namaLayani = queue.poll(); //Tambahkan ini
              System.out.println("Melayani pelanggan : " + namaLayani);
            } 
            break; 
          case 3: 
            System.out.println("Antrian Saat Ini: " + queue); 
            break;
          case 4:
            if(queue.isEmpty())
              System.out.println("Tidak ada antrian");
            else
              System.out.println("Antrian terdepan : " + queue.peek());
            break;
          case 5: 
            System.out.println("Keluar."); 
            sc.close(); 
            return; 
          default: 
            throw new Exception("Invalid input."); 
        } 
      } catch(Exception e) { 
        System.out.println("Invalid input."); 
        sc.next(); // consume newline 
      } 
    } 
  } 
} 