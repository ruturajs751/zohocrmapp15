package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.Entities.Contact;

public interface ContactRepositoy extends JpaRepository<Contact, Long> {

}
