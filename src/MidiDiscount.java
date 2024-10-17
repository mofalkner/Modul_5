public class MidiDiscount extends Rabattstrategie
{
    public MidiDiscount()
    {
        super ("MidiDiscount");
    }

    public double getReduzierterPreis(double regupreis)
    {
        return regupreis = regupreis * 0.85;
    }
}
