package com.rajtech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajtech.entities.Ticket;
import com.rajtech.services.TicketService;

@RestController
public class TicketController {
	@Autowired
	private TicketService service;
	
	@PostMapping("/ticket")//http://localhost:8080/ticket
	public Ticket bookTicket(@RequestBody Ticket ticket) {
		return service.bookTicket(ticket);
	}
	
	@GetMapping("/ticket/{ticketId}")//http://localhost:8080/ticket/1
	public Ticket getTicketById(@PathVariable Integer ticketId) {
		return service.getTicketById(ticketId);
	}
	
	@GetMapping("/ticket/alltickets")//http://localhost:8080/ticket/alltickets
	public List<Ticket> getAllTickets() {
		return service.getAllTickets();
	}
	
	@PutMapping("/ticket/{ticketId}/{newEmail:.+}") //http://localhost:8080/ticket/2/ramu_new@gmail.com
	public Ticket updateTicket(@PathVariable Integer ticketId, @PathVariable String newEmail) {
		return service.updateTicket(ticketId, newEmail);
	}
	
	@DeleteMapping("/ticket/{ticketId}")//http://localhost:8080/ticket/1
	public void deleteTicket(@PathVariable Integer ticketId) {
		service.deleteTicket(ticketId);
	}
}

















