public class Fans {
    private String name;

    public Fans() {

    }

    public Fans(String name) {
        this.name = name;
    }

    public void showName() {
        if(name ==null )
            System.out.print("\nnoname: ");
        else
            System.out.print("\n" + this.name+": ");
    }

    public void watchingPerformances() {
        showName();
        System.out.print("melihat idola dari youtube \n");
    }

    public void watchingPerformances(Musician musician) {
        showName();
        System.out.print("melihat idolanya ");
        musician.perform();
    }

}
