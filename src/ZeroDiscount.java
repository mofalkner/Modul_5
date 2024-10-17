public class ZeroDiscount extends Rabattstrategie
{
    public ZeroDiscount()
    {
        super ("ZeroDiscount");
    }

    public double getReduzierterPreis(double regupreis)
    {
        return regupreis;
    }
}
