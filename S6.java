class EmailChecker{
  String email="kingsof mcg@gmail.com";

}
public class S6 {
  public static void main(String[] args) {
    EmailChecker obj = new EmailChecker();
    System.out.println(obj.email);
    if(obj.email.contains("@")){
      System.out.println("cointain @");
    }
    if(obj.email.contains("gmail")){
      System.out.println("cointain gmail");
    }

  }
  
}