import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main
{
    public static void main(String[] args)
    {
        Angebot angebot = new Angebot(100.0,new GregorianCalendar(2024, Calendar.MARCH, 15),"1");
        angebot.anzeigen();
    }
}