import java.util.Scanner;


public class LoanProgram{




  public static void main(String [] args){



    System.out.println("Welcome to Anthony fast Loans. Follow instructions below ! ");


    System.out.println("Enter your desire loan  amount ? ");
    Scanner loanCash = new Scanner(System.in);
    int loanAmount = loanCash.nextInt();

    System.out.println("Enter your desire annual interest rate for your loan ? ");
    Scanner intRate = new Scanner(System.in);
    int annualRate = intRate.nextInt();

    int monthlyIntrestRate = annualRate / 12 ;

    System.out.println("Your mothly interest rate will be : " +monthlyIntrestRate);

    System.out.println("Enter your desire number of years to pay the loan ? ");
    Scanner numbOfYears = new Scanner(System.in);
    int yearsToPay = numbOfYears.nextInt();

    System.out.println(" Your  monthly payment will be : ");
   // Scanner monthPay = new Scanner(System.in);
    //int numbOfmonth = monthPay.nextInt();
    int monthlyPay = (loanAmount * annualRate / 1 - 1 / (1 + monthlyIntrestRate) ^yearsToPay * 12 );
     System.out.println(monthlyPay);

     int totalPayment = monthlyPay * 12 * yearsToPay;

     System.out.println("Your total payment will be  : "  +totalPayment);

  }

}
