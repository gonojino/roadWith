package com.sbaitproject.roadwith.signservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbaitproject.roadwith.join.dao.UserContactDAO;
import com.sbaitproject.roadwith.vo.Person;

@Service
public class ContactServicesImpl implements ContactServices {

	@Autowired
	UserContactDAO userContactDAO;
	
	@Override
	public Person getByUserInfo(String userInfo) {
		return userContactDAO.getUser(userInfo);
	}

}