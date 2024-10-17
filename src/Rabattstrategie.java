public abstract class Rabattstrategie
{
    private String bezeichnung;

    public Rabattstrategie(String bezeichnung)
    {
        setBezeichnung(bezeichnung);
    }

    public abstract double getReduzierterPreis(double reguPreis);

    public String getBezeichnung()
    {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung)
    {
        this.bezeichnung = bezeichnung;
    }
}