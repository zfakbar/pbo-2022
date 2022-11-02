import java.math.*;

public class Static2{
    static{
        x = 5;
    }
    static int x,y;
    public static void main(String args[]){
        x--;
        myMethod();
        System.out.println("Hasil : "+(x + y + x));
    }
    public static void myMethod (){
        y = x + x;
    }
}


class Walrus{
    int weight;
    Walrus(int w){
        weight = w;
    }
}

class Tester{
    final Walrus w1 = new Walrus (1500);
    void test(){
//        w1 = new Walrus(1400); // illegal
//        w1.weight = 1800; // Legal
        System.out.println("A garage : "+Math.PI);
    }
}

