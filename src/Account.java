import java.text.NumberFormat;
import java.util.Locale;

public abstract class Account {
    protected Date date;
    protected String briefs;
    protected int amount;
    protected int balance;
    protected String remarks;

    public Account() {
        this.date = Date.today();
        this.briefs = "";
        this.amount = 0;
        this.balance = 0;
        this.remarks = "";
    }

    public Account(
            Date date, String briefs, int amount, int balance, String remarks
    ) {
        this.date = date;
        this.briefs = briefs;
        this.amount = amount;
        this.balance = balance;
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        if(obj instanceof Account) {
            if(this.date.equals(((Account)obj).date) == true &&
                    this.briefs.compareTo(((Account)obj).briefs) == 0 &&
                    this.amount == ((Account)obj).amount &&
                    this.balance == ((Account)obj).balance &&
                    this.remarks.compareTo(((Account)obj).remarks) == 0)
                ret = true;
        }
        return ret;
    }

    @Override
    public String toString() {
        String amount = NumberFormat.getCurrencyInstance(Locale.KOREA).format(this.amount);
        String balance = NumberFormat.getCurrencyInstance(Locale.KOREA).format(this.balance);

        return new String("일자 : " + this.date.toString() + ", 적요 : " + this.briefs
         + ",금액 : " + amount + ", 잔액 : " + balance + ", 비고 : " + this.remarks);
    }

    // getter
    public Date getDate() {return this.date;}
    public String getBriefs() {return this.briefs;}
    public int getAmount() {return this.amount;}
    public int getBalance() {return this.balance;}
    public String getRemarks() {return this.remarks;}

    // setter
    public abstract void setAmount(int amount); // 지출, 수입에 따라 재처리
    public void setBalance(int balance) {this.balance = balance;}
    public void setRemarks(String remarks) {this.remarks = remarks;}

    public abstract Account clone();


}
