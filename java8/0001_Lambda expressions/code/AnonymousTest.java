public class AnonymousTest {
    public static void main(String[] args){
    Calculator calculator = new Calculator (){
                                  public int add (int a, int b){
                                     return a+b;
                                  }
                               };
    System.out.println(calculator.add(3,4));                                    
    }
    
}
