package com.sonali.service;

import com.sonali.model.Mobile;
import java.util.*;

public interface MobileService {
	public Mobile saveMobile(Mobile mobile);
	public void deleteMobile(Long modelNo);
	public Mobile updateMobile(Mobile mobile);
	public Mobile getOne(Long modelNo);
	public List<Mobile> getAll();
}
