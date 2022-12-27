package ticketingSystem;

public class TicketingModel {
	String Name;
	String TicketId;
	String source;
	String Destination;
	Double Km;
	double charge;
	public double getCharge() {
		return charge;
	}
	public void setCharge(double charge) {
		this.charge = charge;
	}
	public TicketingModel(String name, String ticketId, String source, String destination, Double km) {
		super();
		this.Name = name;
		this.TicketId = ticketId;
		this.source = source;
		this.Destination = destination;
		this.Km = km;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTicketId() {
		return TicketId;
	}
	public void setTicketId(String ticketId) {
		TicketId = ticketId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public Double getKm() {
		return Km;
	}
	public void setKm(Double km) {
		Km = km;
	}
}
