package wiley_core_java;

public class TesterAccessModifier extends AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Calling Tester class");
        AccessModifiers a = new AccessModifiers();
        try{
            a.test1();
            a.test3();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}