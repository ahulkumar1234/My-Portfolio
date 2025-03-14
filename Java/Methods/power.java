import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter first number :");
        double a =scn.nextInt();
        System.out.print("Enter second number :");
        double b =scn.nextInt();
        int power =1;
        for(int i=1;i<=b;i++){  //using for loop
            power *=a;
        }
        System.out.println(power);
    }
}
