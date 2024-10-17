import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Angebot angebot = new Angebot(100.0,LocalDate.of(2024,2,14),"1");
        angebot.anzeigen();
    }
}