class Bill
{
    int billNo;
    double amount;

    Bill(int billNo,double amount)
    {
        this.billNo=billNo;
        this.amount=amount;
    }

    void getInfo()
    {
        System.out.println("Bill number:"+this.billNo);
        System.out.println("Bill amount:"+this.amount);
    }
}