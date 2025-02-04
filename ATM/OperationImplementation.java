package Java.IDE.ATM;

import java.util.*;

public class OperationImplementation implements OperationInterface{

    ATM atm = new ATM();
    Map <Double, String> transactions = new HashMap <> ();

    @Override
    public void withdrawCash(double withdrawCash) {
        if (withdrawCash % 500 == 0) {
            if (withdrawCash <= atm.getBalance()) {
                transactions.put(withdrawCash, " Cash Withdrawn");
                System.out.println("Take your amount : " + withdrawCash);
                atm.setBalance(atm.getBalance()-withdrawCash);
                checkBalance();
            } else {
                System.out.println("Amount out of Balance ...");
            }
        } else {
            System.out.println("Enter the cash in multiples of 500.00");
        }
    }

    @Override
    public void depositCash(double depositCash) {
        transactions.put(depositCash,"Cash Deposited");
        System.out.println(depositCash + " Amount Deposited Successfully");
        atm.setBalance(atm.getBalance()+depositCash);
        checkBalance();
    }

    @Override
    public void viewTransactions(){
        for (Map.Entry<Double,String> map : transactions.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

	@Override
	public void checkBalance() {
        System.out.println("Your Balance is : " + atm.getBalance());
	}

    // public void withdrawCash(double withdrawCash);
    // public void depositCash(double depositCash);
    // public void viewTransactions();
}
