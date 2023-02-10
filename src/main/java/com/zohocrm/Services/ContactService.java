package com.zohocrm.Services;

import java.util.List;

import com.zohocrm.Entities.Contact;

public interface ContactService {
	public void savecontact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);

}
