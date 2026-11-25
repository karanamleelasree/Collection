public class E1 {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        try{
            int ans = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by Zero");
        }
    }    
}
