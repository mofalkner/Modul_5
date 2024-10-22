public class ZeroDiscount extends Rabattstrategie
{
    public ZeroDiscount()
    {
        super ("ZeroDiscount");
    }

    @Override
    public double getReduzierterPreis(double regupreis)
    {
        return regupreis;
    }
}
