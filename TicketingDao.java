package ticketingSystem;

import java.util.ArrayList;
import java.util.List;

public class TicketingDao {
	public List<TicketingModel> getModel(){
		List<TicketingModel> ticketList=new ArrayList<>();
		ticketList.add(new TicketingModel("ganesh","ticket1","tvm","kochi",20.0));
		ticketList.add(new TicketingModel("aneesh","ticket2","kochi","tvm",20.0));
		return ticketList;
		
		
	}
}
