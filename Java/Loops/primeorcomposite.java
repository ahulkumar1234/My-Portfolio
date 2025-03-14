import java.util.Scanner;
public class primeorcomposite {
  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("Enter a number :");
    int n =scn.nextInt();
    boolean rahul= false; //false means prime
    for(int i=2;i<n;i++){
        if(n%i==0){
       // System.out.println("Comosite Number");
        rahul = true; // true means composite
        break;
        }
    }
            if(n==1)
                 System.out.println("Neither prime nor composite");
           else if(rahul==false){
                 System.out.println("Prime Number");
            }
            else
                 System.out.println("Composite Number");
        
    }
  
}
