import java.util.Scanner;
public class markspercentage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter percentage :");
        int n = scn.nextInt(); // N -> denotes percentage
        if(n>90){
            System.out.print("Excellent");
        }
        else if(n>80){
            System.out.println("Very Good");
        }
        else if(n>70){
            System.out.println("Good");
        }
        else if(n>60){
            System.out.println("Can do better");
        }
        else if(n>40){
            System.out.println("Below average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
