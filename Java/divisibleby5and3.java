import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n = scn.nextInt();
        if(n%3==0 && n%5==0){
            System.out.print("Divisible by 3 and 5");
        }
        else{
            System.out.print("Not divisible by 3 and 5");
        }
    }
}
