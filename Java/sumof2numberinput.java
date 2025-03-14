import java.util.Scanner;
public class sumof2numberinput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a first Number :");
        int a =scn.nextInt();
        System.out.print("Enter a second number :");
        int b =scn.nextInt();
        System.out.print("The sum is :");
        int sum = a+b;
        System.out.print(sum);
    }
}