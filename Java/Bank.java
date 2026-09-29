class Loan{
    protected double loanAmount;
    protected double interestRate;
    protected int duration; // in years
    protected final double APPLICATION_FEE_RATE= 0.05;
    // Constructor
    public Loan(double loanAmount, double interestRate, int duration) {
        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }
double calculateApplicationFee(){
    return loanAmount * APPLICATION_FEE_RATE;
}
double calculateInterest(){
    return (loanAmount * interestRate * duration) / 100;
}
double calculateTotalCost(){
    return loanAmount + calculateInterest() + calculateApplicationFee();


}
void displayLoanDetails(){
    System.out.println("Loan Amount: " + loanAmount);
    System.out.println("Interest Rate: " + interestRate + "% per year");
    System.out.println("Loan Duration: " + duration + " years");
    System.out.println("Application Fee: " + calculateApplicationFee());
    System.out.println("Total Interest: " + calculateInterest());
    System.out.println("Total Cost of Loan: " + calculateTotalCost());
    System.out.println();
}}
class SMELoan extends Loan{
    //constructor
    SMELoan(double loanAmount, int duration){
        super(loanAmount, 18.0, duration); // SME loans have a fixed interest rate of 18%
    }
    // calculate total loan cost
    double calculateTotalCost(){
        return loanAmount + calculateInterest() + calculateApplicationFee() + 10; // No application fee for SME loans
    }
    void displayLoanDetails(){
        System.out.println("Loan Type: SME Loan");
        displayLoanDetails();
    }
}
class CorporateLoan extends Loan{
    //constructor
    CorporateLoan(double loanAmount, int duration){
        super(loanAmount, 15.0, duration); // Corporate loans have a fixed interest rate of 15%
    }
    void displayCorporateLoanDetails(){
        System.out.println("Loan Type: Corporate Loan");
        displayLoanDetails();
    }
}
class DigiLoan extends Loan{
    //constructor
    DigiLoan(double loanAmount, int duration){
        super(loanAmount, 18.0, duration); // Digi loans have a fixed interest rate of 18%
    }
    double calculateTotalCost(){
        double risk=0.02;
        return loanAmount + calculateInterest() + calculateApplicationFee() + (loanAmount * risk);
    
    }
    void displayDigiLoanDetails(){
        System.out.println("Loan Type: Digital Loan");
        displayLoanDetails();
    }   


}
class Bank{
public static void main(String[] args){
    SMELoan sme=new SMELoan(1000000, 3);
    sme.displaySMELoanDetails();
    DigiLoan dgloan=new DigiLoan(100000,3);
    dgloan.displayDigiLoanDetails();
}
}
