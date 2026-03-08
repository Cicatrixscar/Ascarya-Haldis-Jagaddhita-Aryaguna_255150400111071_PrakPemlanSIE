public class PenerbitApp {
    
    public static void main(String[] args) {
        PenerbitDone penerbit = new PenerbitDone();
        penerbit.display();
        PenerbitDone or = new PenerbitDone("O'Reilly");
        or.display();
        PenerbitDone gm = new PenerbitDone("Gramedia", "Jakarta");
        gm.display();
    }
    
}