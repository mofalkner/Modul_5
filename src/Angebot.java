import java.time.LocalDate;

public class Angebot
{
    private double regupreis;
    private LocalDate flugdatum;
    private String flugnummer;
    Rabattstrategie rabattstrategie;

    public Angebot(double regupreis, LocalDate flugdatum, String flugnummer)
    {
        this.regupreis = regupreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
    }

    public void getStrategiemitDatum()
    {
        int monat = flugdatum.getMonthValue();
        if (monat == 1 || monat == 4 || monat == 10)
        {
            this.rabattstrategie = new MaxiDiscount();
        }
        else if (monat == 2 || monat == 3)
        {
            this.rabattstrategie = new MidiDiscount();
        }
        else
        {
            this.rabattstrategie = new ZeroDiscount();
        }
    }

}
