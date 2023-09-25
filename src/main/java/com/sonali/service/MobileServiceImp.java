package com.sonali.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sonali.model.Mobile;
import com.sonali.repo.MobileRepo;
@Service
public class MobileServiceImp implements MobileService {

	@Autowired
	private MobileRepo mobileRepo;
	@Override
	public Mobile saveMobile(Mobile mobile) {
		Mobile m=mobileRepo.save(mobile);
		return m;
	}

	@Override
	public void deleteMobile(Long modelNo) 
	{
		mobileRepo.deleteById(modelNo);
	}

	@Override
	public Mobile updateMobile(Mobile mobile) {
		Mobile m=mobileRepo.save(mobile);
		return m;
	}

	@Override
	public Mobile getOne(Long modelNo) {
		Mobile m=mobileRepo.findById(modelNo).get();
		return m;
	}

	@Override
	public List<Mobile> getAll() {
		List<Mobile> listMobiles=(List<Mobile>) mobileRepo.findAll();
		return listMobiles;
	}

}
