package A;

public class TestA {
    private int varPrivateA ;
    int varDefaultA ;
    protected int varProtectedA ;
    public int varPublicA ;

    private void methodPrivateA(){

        this.varDefaultA = 0 ;
        this.varPrivateA = 0 ;
        this.varProtectedA = 0 ;
        this.varPublicA = 0 ;

        this.methodDefaultA();
        this.methodPrivateA();
        this.methodProtectedA();
        this.methodPublicA();

    }
    void methodDefaultA(){    }
    protected void methodProtectedA(){}
    public void methodPublicA(){}
}
