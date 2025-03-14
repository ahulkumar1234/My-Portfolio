import java.util.Scanner;
public class productofdigit {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scn.nextInt();
        int product = 1;
        while(n!=0){
            int lastdigit = n%10;
            product *= lastdigit;
            n/=10;
        }
        System.out.println(product);
    }
}
