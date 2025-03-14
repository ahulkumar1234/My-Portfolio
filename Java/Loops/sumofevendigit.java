import java.util.Scanner;
public class sumofevendigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scn.nextInt();
        int sum = 0;
        while(n!=0){
            if(n%2==0){
            int lastdigit = n%10;
             sum += lastdigit;
             n/=10;
             //System.out.println(sum);
            }
        }
        System.out.println(sum);

    }
}
