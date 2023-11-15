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
        carLoan.checkLoan();
        carLoan.calculateMonthlyPayment();

    }

    public boolean checkLoan(){

        if ((this.loanLength <= 0) || (this.interest <= 0) || (this.loan <= this.downPayment)) {
            System.out.println("Error: Loan not possible");
            return false;
        } else {
            System.out.println("Loan acceptable.");
            return true;
        }
    }

    public int calculateMonthlyPayment() {
        int remainingBalance = this.loan - this.downPayment;
        int monthlyPayment = remainingBalance / this.loanLength;
        System.out.println("Your remaining balance is " + remainingBalance +
                ". This means your monthly payment will be " + monthlyPayment +
                " for the next " + this.loanLength + " months.");
        return monthlyPayment;
    }
}
