import java.util.Scanner;
public class divisibleby5and3not15 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n =scn.nextInt();
        if(n%5==0 ||n%3==0 ){
            if(n%15!=0){
                System.out.println("Divisible by 5 or 3 but not 15");
            } 
            else{
                System.out.println("Not divisible");
            }
        }
        else{
            System.out.println("Not divisible");
        }
    }
}
