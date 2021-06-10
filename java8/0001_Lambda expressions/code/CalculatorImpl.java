public class CalculatorImpl implements Calculator{
    
     public int add (int a, int b){
         return a+b;
     }
    public static void main(String[] args){
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.add(3,4));      
    }
}