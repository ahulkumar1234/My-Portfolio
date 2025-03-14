import java.util.Scanner;
public class areaparimetergreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter Length :");
        int Length =scn.nextInt();
        System.out.println("Enter Breath :");
        int Breath =scn.nextInt();
        //System.out.println("Enter area :");
        int area = Length*Breath;
        int parimeter = 2*(Length+Breath);
        if(area>parimeter){
            System.out.println("Area is greater than parimeter");
        }
        else{
            System.out.println("Parimeter is greater than area");
        }
    }
}
