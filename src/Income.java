public class Income extends Account {

    public Income() {super();}

    public Income(Date date, String briefs, int amount, int balance, String remarks) {
        super(date, briefs, amount, balance, remarks);
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public Account clone() {
        Date date = new Date(this.date.getYear(), this.date.getMonth().getValue(), this.date.getDay());
        return new Income(date, this.briefs, this.amount, this.balance, this.remarks);
    }
}
