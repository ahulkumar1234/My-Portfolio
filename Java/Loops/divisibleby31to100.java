import java.util.Scanner;
public class divisibleby31to100 {
   public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
 //   System.out.print("Enter a number :");
  //  int a =scn.nextInt();
    for(int i=1;i<=100;i++){
        if(i%3==0)
        System.err.println(i+" ");
    }
  } 
}
