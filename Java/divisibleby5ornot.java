import java.util.Scanner;
public class divisibleby5ornot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n =scn.nextInt();
        if(n%5==0){
            System.out.print("It is divisible by 5");
            System.out.print("Good morning ");
        }
        else{
            System.out.print("Not divisible by 5 ");
            System.out.print("Good evening ");
        }
    }
}
