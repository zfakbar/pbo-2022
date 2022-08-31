public class Carnivore extends Animal{


    @Override
    public void eat() {
        super.eat();
        System.out.println(getClass().getSimpleName() + " eat meat!");
    }

    //    public void eat() {
//        System.out.println(getClass().getSimpleName() + " eat meat!");
//    }
}
