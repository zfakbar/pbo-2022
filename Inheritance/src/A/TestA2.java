package A;

public class TestA2 extends TestA{
    private int varPrivateA2 ;
    int varDefaultA2 ;
    protected int varProtectedA2 ;
    public int varPublicA2 ;

    private void methodPrivateA2(){
        //tulis this. --> dapat diakses variabel dan method dari class Test A dengan hak akses selain private
    }
    void methodDefaultA2(){}
    protected void methodProtectedA2(){}
    public void methodPublicA2(){}
}