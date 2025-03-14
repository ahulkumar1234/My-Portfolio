import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scn.nextInt();
        int r = 0;
        while (n!=0) { 
            int lastdigit =n%10;
            r*=10;
            r+=lastdigit;
            n/=10;
        }
        System.out.println(r);
    }
}
