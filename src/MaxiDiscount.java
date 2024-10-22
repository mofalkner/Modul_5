public class MaxiDiscount extends Rabattstrategie
{
    public MaxiDiscount()
    {
        super ("MaxiDiscount");
    }

    @Override
    public double getReduzierterPreis(double regupreis)
    {
        return regupreis = regupreis * 0.7;
    }
}
