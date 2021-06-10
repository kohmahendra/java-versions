
@FunctionalInterface   
public interface MyFunctionalInterface{
    
    public void m1();

    public static void m2(){
        System.out.println("Example0001FunctionalInterface.m2()");
    }

    public static void m3(){
        System.out.println("Example0001FunctionalInterface.m3()");
    }

    public default void m4(){
        System.out.println("Example0001FunctionalInterface.m4()");
    }

    public default void m5(){
        System.out.println("Example0001FunctionalInterface.m5()");
        
    }

}