package com.marketingapp1.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marketingapp1.entities.Lead;
import com.marketingapp1.services.LeadService;

@Controller
public class LeadController {
	
	
	@Autowired
	private LeadService leadservice;
	
	//http://localhost:8080/viewCreateLead
	
	@RequestMapping("/viewCreateLead")
	public String viewCreateForm() {
		return "create_registration";
		
	}
	@RequestMapping("/saveLead")
	public String saveOneLead(Lead lead) {
		leadservice.saveLead(lead);
		return "create_registration";
		
	}

}
