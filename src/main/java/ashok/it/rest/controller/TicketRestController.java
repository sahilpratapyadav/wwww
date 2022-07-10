package ashok.it.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import ashok.it.rest.model.Passenger;  //ashok.it
import ashok.it.rest.model.Ticket;
import ashok.it.rest.service.TicketServiceImpl;

import ashok.it.rest.service.TicketService;

@Controller
public class TicketRestController {
	@Autowired
	private TicketService serv;

	@GetMapping(value = "/ticket", consumes = { "application/json", "application/xml" }, produces = {
			"application/xml" }

	)
	public ResponseEntity<Ticket> getticket(@RequestBody Passenger passenger) {
		Ticket bookedTicket = serv.bookedTicket(passenger);

		return new ResponseEntity<>(bookedTicket, HttpStatus.OK);

	}

}
