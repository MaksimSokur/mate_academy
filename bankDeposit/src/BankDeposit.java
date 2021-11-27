public class BankDeposit {

    public int calculateProfit(double amount, double percent, int period) {
        //Write code below this line
        int profit = 0;
        double check = amount;
        for (int i = 0; period > i; i++){
            amount = amount + amount * percent;
        }
        profit = (int) (amount - check);
        return profit;
        //Write code above this line
    }

    public static void main(String[] args) {
        BankDeposit deposit = new BankDeposit();
        System.out.println(deposit.calculateProfit(1000, 0.055, 7));

    }

}
