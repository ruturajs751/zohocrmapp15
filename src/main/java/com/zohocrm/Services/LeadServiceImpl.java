package com.zohocrm.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Entities.Lead;
import com.zohocrm.Repository.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository LeadRepo;

	@Override
	public void saveOneLead(Lead lead) {
			LeadRepo.save(lead);
			
		}

	@Override
	public Lead findLeadById(long id) {
		Optional<Lead> findById = LeadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteLeadById(long id) {
		LeadRepo.deleteById(id);
		
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = LeadRepo.findAll();
		return leads;
	}

	}


