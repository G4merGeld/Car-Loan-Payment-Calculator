public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3; //length in months
        int interestRate = 5; //rate in %
        int downPayment = 2000;
        checkLoan(carLoan, loanLength, interestRate, downPayment);
        calculateMonthlyPayment(carLoan, loanLength, interestRate, downPayment);
    }

    public static boolean checkLoan(int loan, int loanLength, int interest, int downPayment){
        if ((loanLength <= 0) || (interest <= 0) || (loan <= downPayment)) {
            System.out.println("Error: Loan not possible");
            return false;
        } else {
            System.out.println("Loan acceptable.");
            return true;
        }
    }

    public static int calculateMonthlyPayment(int loan, int loanLength, int interest, int downPayment) {
        int remainingBalance = loan - downPayment;
        int monthlyPayment = remainingBalance / loanLength;
        System.out.println("Your remaining balance is " + remainingBalance +
                ". This means your monthly payment will be " + monthlyPayment +
                " for the next " + loanLength + " months.");
        return monthlyPayment;
    }
}
