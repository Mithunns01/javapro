package javapractice;
import java.util.*;
public class creattingUsername {
    public static void main(String[] args) {
        System.out.println("enter your email id");
       Scanner scan= new Scanner(System.in);
       String email=scan.nextLine();
       String username="";
       for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            break;
        }else{
            username+=email.charAt(i);
        }

       }
       System.out.println(username);
       scan.close();
    }
}
