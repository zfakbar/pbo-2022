//public class TestCount{
//    public static void main(String[] args) {
//        Count c1 = new Count();
//        System.out.println("Objek c1");
//        System.out.println("serial number : "+ c1.getSerialNumber());
//        System.out.println("counter : "+c1.counter);
//
//        Count c2 = new Count();
//        System.out.println();
//        System.out.println("Objek c1 setelah create object c2");
//        System.out.println("serial number : "+c1.getSerialNumber());
//        System.out.println("counter : "+c1.counter);
//        System.out.println();
//        System.out.println("Objek c2");
//        System.out.println("serial number : "+c2.getSerialNumber());
//        System.out.println("counter : "+c2.counter);
//
//    }
//}


public class TestCount {
    public static void main(String[] args) {
        System.out.println("Number of counter is " +Count.getTotalCount());

        Count count1 = new Count();
        System.out.println("Number of counter is "+Count.getTotalCount());
    }
}