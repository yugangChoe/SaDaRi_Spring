package co.soft.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.soft.beans.UserJoin;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public void userJoin(UserJoin bean) {
		sqlSessionTemplate.insert("userJoin",bean);
	}
}
