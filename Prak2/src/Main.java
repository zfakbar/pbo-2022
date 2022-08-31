public class Main  {

    public static void main(String[] args) {


        Animal animal = new Animal();
        System.out.println("Apakah hewan IS-A Objek -> " + (animal instanceof Object));
        System.out.println("Apakah hewan IS-A Animal -> " + (animal instanceof Animal));
        System.out.println("Apakah hewan IS-A Kucing -> " + (animal instanceof Cat));
        animal.purring();

        System.out.println("------------------------"); // spasi

        Cat cat = new Cat(); // Memanggil class Kucing “Kucing bersuara meong”
        System.out.println("Apakah hewan IS-A Objek -> " + (cat instanceof Object));
        System.out.println("Apakah kucing IS-A Animal -> " + (cat instanceof Animal));
        System.out.println("Apakah kucing IS-A Kucing -> " + (cat instanceof Cat));

        cat.purring();


        Lion lion = new Lion();
        System.out.println("Apakah hewan IS-A Objek -> " + (lion instanceof Object));
        System.out.println("Apakah lion IS-A Animal -> " + (lion instanceof Animal));
        System.out.println("Apakah lion IS-A Lion -> " + (lion instanceof Lion));

        lion.eat();

        Carnivore carnivore = new Carnivore();
        carnivore.eat();

    }
}
