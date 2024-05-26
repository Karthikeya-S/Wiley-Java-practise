package core_java_check;
import wiley_core_java.AccessModifiers;

public class TestAccessModify extends AccessModifiers{
    public void accessTest3(){
        test3();
    }
    public static void main(String[] args) {
        TestAccessModify test = new TestAccessModify();
        AccessModifiers a = new AccessModifiers();
        a.test1();
        test.accessTest3();
    }
}
