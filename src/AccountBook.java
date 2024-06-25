import java.util.ArrayList;

public class AccountBook {
    private ArrayList<Account> accounts;
    private int length;

    public AccountBook() {
        this.accounts = new ArrayList<Account>();
        this.length = 0;
    }

    public int recode(Date date, String briefs, int amount, String remarks) {
        Account account = null;
        int balance = 0;

        if(this.length > 0) {
            account = this.accounts.get(this.length -1);
            balance = account.getBalance();
        }
        balance += amount;

        if(amount > 0) {
            account = new Income(date, briefs,amount, balance, remarks);
        } else {
            account = new Outgo(date, briefs, amount*(-1), balance, remarks);
        }

        //ArrayList에 새로 생성한 account 추가
        int index = -1;
        boolean doesRecodingSucceed = this.accounts.add(account);
        this.length++;

        if(doesRecodingSucceed == true) {
            index = this.accounts.indexOf(account);
        }
        return index;
    }
}
