import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n=scn.nextInt();
        if(n>99 && n<1000){
            System.out.println("This is a three digit number");
        }
    else {
        System.out.println("This is not a three digit number");
    }
    }
}
