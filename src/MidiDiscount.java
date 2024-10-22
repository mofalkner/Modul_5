public class MidiDiscount extends Rabattstrategie
{
    public MidiDiscount()
    {
        super ("MidiDiscount");
    }

    @Override
    public double getReduzierterPreis(double regupreis)
    {
        return regupreis = regupreis * 0.85;
    }
}
