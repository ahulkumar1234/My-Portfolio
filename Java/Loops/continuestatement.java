public class continuestatement {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++){
            if(i==3 || i==9)continue;
            if(i%2==0 || i%3==0)
            System.out.println(i);
        }
        // for(int i =1;i<=100;i++){
        //   //  if(i%2!=0)continue;   //second method to print odd number using continue statement
        //   //  if(i%2==0)continue;   //second method to print even number using continue statement
        //     System.out.println(i);
        // }
        
    }
}
