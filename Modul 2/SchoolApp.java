public class SchoolApp {
    public static void main(String[] args) {
        Student miki = new Student("Miki");
        Student mini = new Student("Mini");
        
        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());
        
        mini.gantiNama("Mono");
        
        System.out.println("Grade " + miki.getNama() + " " + miki.getSkor());
        System.out.println("Grade " + mini.getNama() + " " + mini.getSkor());
    }
}