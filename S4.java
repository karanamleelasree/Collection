
class PasswordChecker{
  String password;
  String confirmPassword;

}
public class S4 {
  public static void main(String[] args) {
    PasswordChecker obj = new PasswordChecker();
    obj.password="Kishore@123";
    obj.confirmPassword="Kishu";
    if((obj.password).equals(obj.confirmPassword)){
      System.out.println("password matched");
    }else {
      System.out.println("Password Mismatch");
    }
  }
  
}