package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entities.Contact;
import com.zohocrm.Repository.ContactRepositoy;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	private ContactRepositoy contactRepo;
	@Override
	public void savecontact(Contact contact) {
		contactRepo.save(contact);
		
		

	}
	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contacts = contactRepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContactById(long id) {
		Optional<Contact> findById = contactRepo.findById(id);
		Contact contact=findById.get();
		return contact;
	}

}
