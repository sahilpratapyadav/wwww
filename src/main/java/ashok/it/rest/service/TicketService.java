package ashok.it.rest.service;

import ashok.it.rest.model.Passenger;
import ashok.it.rest.model.Ticket;

public interface TicketService {
	
	public Ticket bookedTicket(Passenger passenger);

}