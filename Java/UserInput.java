import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String customerName,address,contactNumber,date;
        System.out.println("Enter Customer Name");
        customerName=input.nextLine();
        System.out.println("Enter address");
        address=input.nextLine();
        System.out.println("Enter contact Number");
        contactNumber=input.nextLine();
        System.out.println("Enter date");
        date=input.nextLine();
System.out.println("Your Name is " +customerName);
System.out.println("Your address is " +address);
System.out.println("Your contact Number is " +contactNumber);
System.out.println("The date is " +date);
        
    }
    
}
