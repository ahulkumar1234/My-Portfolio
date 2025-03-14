import java.util.Scanner;
public class spcp {
  public static void main(String[] args) {
    Scanner scn=new Scanner (System.in);
    System.out.print("Enter selling price :");
    int sp =scn.nextInt();
    System.out.print("Enter cost price :");
    int cp =scn.nextInt();
    if(sp>cp){
        System.out.println("You made Profit of rupees : "+(sp-cp));
    }
    else if(cp>sp){
        System.out.println("You made Loss of rupees : "+(cp-sp));
    }
    else{
        System.out.println("No Profit No Loss");
    }
  }  
}
