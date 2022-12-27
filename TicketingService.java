package ticketingSystem;

import java.util.List;
import java.util.function.Function;

public class TicketingService {
	public static void main(String[] args) {
		
		List<TicketingModel> lists= new TicketingDao().getModel();
		
		int charge=5;
		lists.forEach(i -> System.out.println("ticket id "+i.getTicketId()+"passenger name "+i.getName() +" charge "+i.getKm()*charge));
	}
	
}
