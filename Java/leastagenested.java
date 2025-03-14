import java.util.Scanner;
public class leastagenested {
   public static void main(String[] args) {
    Scanner scn =new Scanner(System.in);
    System.out.print("Enter age of Ram :");
    int ram =scn.nextInt();
    System.out.print("Enter age of Shyam :");
    int shyam =scn.nextInt();
    System.out.print("Enter age of Ajay :");
    int ajay =scn.nextInt();
    if(ram<shyam){
        if(ram<ajay){
            System.out.print("Ram is youngest");
        }
        else{
           if(shyam<ram){
            if(shyam<ajay){
                System.out.print("Shyam is youngest");
            }
           }
           else{
            if(ajay<shyam){
                if(ajay<ram){
                    System.out.print("Ajay is youngest");
                }
            }
           }
        }
    }
   } 
}
