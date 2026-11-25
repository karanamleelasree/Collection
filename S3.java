class TextConverter{
    String message = "Welcome to Java Programming";
    String upper = message.toUpperCase();
    String lower = message.toLowerCase();

}

public class S3 {
    public static void main(String[] args){
        TextConverter obj = new TextConverter();
        System.out.println(obj.message);
        System.out.println(obj.lower);
        System.out.println(obj.upper);
    }
}
