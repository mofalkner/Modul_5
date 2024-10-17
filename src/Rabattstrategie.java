public abstract class Rabattstrategie
{
    private String strategie;

    public Rabattstrategie(String strategie)
    {
        setStrategie(strategie);
    }

    public abstract double getReduzierterPreis(double reguPreis);

    public String getStrategie()
    {
        return strategie;
    }

    public void setStrategie(String strategie)
    {
        this.strategie = strategie;
    }
}