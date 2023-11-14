public class CarLoan {
    public static void main(String[] args) {
        int carLoan = 10000;
        int loanLength = 3;
        int interestRate = 5;
        int downPayment = 2000;
        checkLoan(loanLength, interestRate);
    }

    public static boolean checkLoan(int loanLength, int interest){
        if((loanLength <= 0) || (interest <= 0)) {
            System.out.println("Error: Loan not possible");
            return false;
        } else {
            System.out.println("Loan acceptable");
            return true;
        }
    }
}
