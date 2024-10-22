import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Angebot
{
    private double regupreis;
    private GregorianCalendar flugdatum;
    private String flugnummer;
    private double redupreis;
    Rabattstrategie rabattstrategie;

    public Angebot(double regupreis, GregorianCalendar flugdatum, String flugnummer) {
        this.regupreis = regupreis;
        this.flugdatum = flugdatum;
        this.flugnummer = flugnummer;
        getStrategiemitDatum();
        redupreis = getRedupreis();
    }

    public void getStrategiemitDatum()
    {
        int monat = flugdatum.get(Calendar.MONTH) + 1;

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

    public double getRedupreis()
    {
        return rabattstrategie.getReduzierterPreis(regupreis);
    }

    public void anzeigen()
    {
        System.out.println("Regulärer Preis: " + this.regupreis + " | Flugdatum: " + this.flugdatum.getTime() + " | Flugnummer: " + this.flugnummer);
        System.out.println("Rabattierter Preis: " + this.redupreis + " | Strategie: " + this.rabattstrategie.getBezeichnung());
    }

    public double getRegupreis() {
        return regupreis;
    }

    public void setRegupreis(double regupreis) {
        this.regupreis = regupreis;
    }

    public String getFlugnummer() {
        return flugnummer;
    }

    public void setFlugnummer(String flugnummer) {
        this.flugnummer = flugnummer;
    }

    public GregorianCalendar getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(GregorianCalendar flugdatum) {
        this.flugdatum = flugdatum;
    }
}
