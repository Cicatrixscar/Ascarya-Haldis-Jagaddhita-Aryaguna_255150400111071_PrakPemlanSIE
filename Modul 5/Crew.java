public class Crew implements ICrew {

    private String name;

    public Crew(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println("Crew " + this.name + " is doing work.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void kick() {
        System.out.println(this.name + " was ejected. (Crew)");
    }

    public boolean isDead = false;

    public void callMeeting() {
        if (this.isDead) {
            System.out.println(this.name + " is dead and cannot call a meeting.");
            return; 
        }
        System.out.print(this.name + " found a corpse ");
        System.out.print("and calls a meeting. ");
        System.out.println("Let's find the impostor!");
    }
}