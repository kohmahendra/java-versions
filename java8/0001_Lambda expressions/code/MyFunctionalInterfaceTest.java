public class MyFunctionalInterfaceTest {

    public static void main(String[] args){
        MyFunctionalInterface  test = ()->{System.out.println(" method implementation");};
        test.m1();

        Calculator calculator = new Calculator (){
                                  public int add (int a, int b){
                                     return a+b;
                                  }
                               };
        System.out.println(calculator.add(3,4));                             
    }

}