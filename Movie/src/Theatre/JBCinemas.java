package Theatre;

public class JBCinemas
{
	public static void main(String[] args)
	{
		TicketCounter bookmyshow=new TicketCounter();
		Maharaja screen1=new Maharaja();
		Kill screen2=new Kill();
		bookmyshow.bookTickets(screen1);
	}
}
