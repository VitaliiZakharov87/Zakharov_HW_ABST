package accounts;

public class SimpleAccount extends Account{

    public SimpleAccount(long balance) {
        super(balance);
    }

    @Override
    public boolean add(long amount) {
        balance +=amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance<amount){
            return false;

        } else {
            balance -=amount;
            return true;
        }
    }


}
