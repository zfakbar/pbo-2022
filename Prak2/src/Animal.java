public class Animal {

    public void purring(){
        System.out.println(getClass().getSimpleName() + " purr!");
    }

    public void eat() {
        System.out.println(getClass().getSimpleName() + " eat!");
    }

    public void walk() {
        System.out.println(getClass().getSimpleName() + " walk!");
    }

}
