package InterfacesConcept;

public class DiscoverCard implements RulesForBillPay {
    private int statementBalance;
    private int currentBalance;

    @Override
    public int checkStatement(int statementBalance) {
        this.statementBalance = statementBalance;
        return statementBalance;
    }

    @Override
    public void currentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
        System.out.println("Current Balance: " + currentBalance);
        if (currentBalance < statementBalance) {
            System.out.println("Balance is not sufficient to pay the bill.");
        } else {
            System.out.println("Balance is sufficient to pay the bill.");
        }
    }

    @Override
    public void billPay() {
        if (currentBalance >= statementBalance) {
            System.out.println("Bill paid. No dues.");
        } else {
            System.out.println("Please check balance and try again.");
        }
    }
    public void remaningBalance() {
		int amountBalance=currentBalance-statementBalance;
		System.out.println("Amount in the account after payment "+amountBalance);
	}

}
