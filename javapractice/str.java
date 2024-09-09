package javapractice;
import java.util.*;
public class str{
public static void main(String[] args) {
    System.out.println("enter the size of array");
    Scanner scan = new Scanner(System.in);
    int size= scan.nextInt();
    String []arr=new String[size];
    int totallength=0;
    for(int i=0; i<size; i++) {
        arr[i] = scan.next();       
        totallength += arr[i].length();
      }
      System.out.println(totallength);
      scan.close();
}
}