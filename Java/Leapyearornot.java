import java.util.Scanner;

public class Leapyearornot {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Year :");
        int n =scn.nextInt();
        if(n%4==0){
            System.out.print("Leap Year");
        }
        else{
            System.out.print("Not a Leap Year");
        }
    }
}


