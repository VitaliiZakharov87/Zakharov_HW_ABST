import accounts.CreditAccount;
import accounts.SimpleAccount;

public class Main {
    public static void printAccounts(SimpleAccount simpleAccount, CreditAccount creditAccount) {
        System.out.println("На обычном счету: " + simpleAccount.getBalance());
        System.out.println("На кредитном счету: " + creditAccount.getBalance());
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(300_000);
        CreditAccount creditAccount = new CreditAccount(-300_000, -500_000);
        simpleAccount.add(200_000);
        creditAccount.add(200_000);
        printAccounts(simpleAccount, creditAccount);


        //simpleAccount.pay(200_000);
        //creditAccount.pay(200_000);
        //printAccounts(simpleAccount, creditAccount);

        //simpleAccount.transfer(creditAccount,200_000);
        //printAccounts(simpleAccount, creditAccount);

        //creditAccount.transfer(simpleAccount,200_000);
        //printAccounts(simpleAccount, creditAccount);


    }

}