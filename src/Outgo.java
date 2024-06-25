public class Outgo extends Account {

    public Outgo() {super();}
    public Outgo(Date date, String briefs, int amount, int balance, String remarks) {
        super(date, briefs, amount, balance, remarks);
    }
    @Override
    public void setAmount(int amount) {
        this.amount = amount * (-1);
    }

    @Override
    public Account clone() {
        Date date = new Date(this.date.getYear(), this.date.getMonth().getValue(), this.date.getDay());
        return new Outgo(date, this.briefs,this.amount, this.balance, this.remarks);
    }
}
