package co.soft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.soft.beans.UserJoin;
import co.soft.dao.UserDAO;

@Service
public class UserInfoService {
	
	@Autowired
	private UserDAO uDAO;
	
	public void userJoin(UserJoin bean) {
		uDAO.userJoin(bean);
	}
}
