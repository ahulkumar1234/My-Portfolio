import java.util.Scanner;
public class countdigitofnumber {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a Number :");
        int n =scn.nextInt();
        int count =0;
        if(n==0)count++;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
