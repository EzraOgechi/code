import java.util.Scanner;

public class Bill{
    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        final int RATE=15;
      
       
        System.out.println("Enter The Number of Units Consumed:");
        int units=input.nextInt();

         double  amount =0;

        if(units<=100){
            amount=units*RATE;
        }
        System.out.println("The Amount Consumed for this Month is :" +amount);

        

    }
}