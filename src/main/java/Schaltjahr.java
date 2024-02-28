import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       System.out.println("Nenn mir ein Jahr");
       int n = sc.nextInt();
       if ((n % 4 == 0) && (n % 100 != 0)) {
           System.out.println(n +" ist ein schaltjahr");

     }
     else if(n % 100 == 0){
         System.out.println(n +" Das ist kein Schaltjahr sondern ein Jahrhundert");
     }
     
      else{
           System.out.println(n +" ist kein schaltjahr");
       }
       sc.close();

       }
       


        
    }   


