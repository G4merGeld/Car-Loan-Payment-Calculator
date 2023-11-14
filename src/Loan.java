import java.util.Scanner;

public class Loan {
    int loan;
    int loanLength;
    int interest;
    int downPayment;
    public Loan(int loan, int loanLength, int interest, int downPayment) {
        this.loan = loan;
        this. loanLength = loanLength;
        this.interest = interest;
        this.downPayment = downPayment;
    }
    public static void main(String[] args) {
        Loan carLoan = new Loan(10000, 3, 5, 2000);
        Loan.checkLoan(carLoan);
        Loan.calculateMonthlyPayment(carLoan);

    }

    public static boolean checkLoan(Loan loan){

        if ((loan.loanLength <= 0) || (loan.interest <= 0) || (loan.loan <= loan.downPayment)) {
            System.out.println("Error: Loan not possible");
            return false;
        } else {
            System.out.println("Loan acceptable.");
            return true;
        }
    }

    public static int calculateMonthlyPayment(Loan loan) {
        int remainingBalance = loan.loan - loan.downPayment;
        int monthlyPayment = remainingBalance / loan.loanLength;
        System.out.println("Your remaining balance is " + remainingBalance +
                ". This means your monthly payment will be " + monthlyPayment +
                " for the next " + loan.loanLength + " months.");
        return monthlyPayment;
    }
}
