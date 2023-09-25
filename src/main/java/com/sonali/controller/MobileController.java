package com.sonali.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonali.model.Mobile;
import com.sonali.service.MobileServiceImp;

@RestController
public class MobileController {
	@Autowired
	private MobileServiceImp service;

	@PostMapping("/save")
	public String saveMobile(@RequestBody Mobile mobile)
	{
		Mobile m=service.saveMobile(mobile);
		String message=null;
		if(m!=null) {
			message="Data Saved Successfully in DataBase";
		}
		else{
			message="failed";
		}
		return message;
	}
	
	@DeleteMapping("/delete/{modelNo}")
	public void deleteMobile(@PathVariable Long modelNo)
	{
		service.deleteMobile(modelNo);
		
	}
	
	@GetMapping("/get/{modelNo}")
	public Mobile getMobile(@PathVariable Long modelNo)
	{
		Mobile mobile=service.getOne(modelNo);
		return mobile;
	}
	@GetMapping("/getAll")
	public List<Mobile> getAllMobiles()
	{
		List<Mobile> listMobiles=service.getAll();
		return listMobiles;
	}
	@PutMapping("/update/{modelNo}")
	public String updateMobile(@RequestBody Mobile mobile,@PathVariable Long modelNo)
	{
		Mobile mob=service.getOne(modelNo);
		mob.setModelName(mobile.getModelName());
		mob.setPrice(mobile.getPrice());
		service.updateMobile(mobile);
		return "saved";
	}
	
}
