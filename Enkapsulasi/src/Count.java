//public class Count {
//    private int serialNumber;
//    public static int counter = 0 ;
//    public Count(){
//        counter++;
//        serialNumber = counter;
//    }
//    public int getSerialNumber(){
//        return serialNumber;
//    }
//}


public class Count {
    private int serialNumber;
    public static int counter = 0 ;

    public static int getTotalCount(){
        return counter;
    }
    public Count(){
        counter++;
        serialNumber = counter;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
}