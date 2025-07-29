package com.rajtech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rajtech.entities.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
