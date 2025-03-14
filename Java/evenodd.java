import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int a =scn.nextInt();
        if(a%2==0){
            System.out.print("Even Number");
        }
        else{
            System.out.print("Odd Number");
        }
    }
}
