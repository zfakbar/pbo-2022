package B;

import A.TestA;

public class TestB extends TestA {
    private int varPrivateB ;
    int varDefaultB ;
    protected int varProtectedB ;
    public int varPublicB ;

    private void methodPrivateB(){
        //tulis this. maka akan muncul variabel dan method dengan hak akses protected dan public
    }
    void methodDefaultB(){}
    protected void methodProtectedB(){}
    public void methodPublicB(){}
}