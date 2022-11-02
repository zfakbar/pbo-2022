package polymorphism;

public class Test {
    public static void main(String args[]) {
        Parent tes=new Child();
        System.out.println("Nilai x = " + tes.x);
        tes.Info();

        System.out.println("Nilai x = "+ ((Child)tes).x);
    }
}
