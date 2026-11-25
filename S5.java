
class UsernameValidator {
  String username="kishore";
  String enteredUsername="Kishore";
 

}
public class S5{
  public static void main(String[] args) {
    UsernameValidator obj = new UsernameValidator();
    if((obj.username).equalsIgnoreCase(obj.enteredUsername)){
      System.out.println("valid");
     }else {
      System.out.println("invalid");
     }
  }
  
}