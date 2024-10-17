import java.time.LocalDate;

public class Angebot
{
    private double regupreis;
    private LocalDate flugdatum;
    private String flugnummer;
    private double redupreis;
    Rabattstrategie rabattstrategie;

    public Angebot(double regupreis, LocalDate flugdatum, String flugnummer)
    {
        setFlugdatum(flugdatum);
        setRegupreis(regupreis);
        setFlugnummer(flugnummer);
        getStrategiemitDatum();
        redupreis = getRedupreis();
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

    public double getRedupreis()
    {
        return rabattstrategie.getReduzierterPreis(regupreis);
    }

    public void anzeigen()
    {
        System.out.println("Regulärer Preis: " + this.regupreis + " | Flugdatum: " + this.flugdatum + " | Flugnummer: " + this.flugnummer);
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

    public LocalDate getFlugdatum() {
        return flugdatum;
    }

    public void setFlugdatum(LocalDate flugdatum) {
        this.flugdatum = flugdatum;
    }
}
