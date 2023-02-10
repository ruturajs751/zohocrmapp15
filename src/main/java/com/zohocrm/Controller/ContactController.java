package com.zohocrm.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.Entities.Contact;
import com.zohocrm.Services.ContactService;
	

@Controller
public class ContactController {
	
	private ContactService contactservice;
	

	public ContactController(ContactService contactservice) {
		this.contactservice = contactservice;
	}


	@RequestMapping("/listallcontacts")
	public String listAllLeads(Model model) {
		List<Contact> contacts = contactservice.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}

}
