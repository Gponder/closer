package com.ponder.closer.orm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.ponder.closer.orm.bean.User;
import com.ponder.closer.orm.mapper.UserMapper;
import com.ponder.closer.orm.util.MybatisUtil;

public class UserTest {
	@Test
	public void saveUser() {
		User user = new User();
		user.setUsername("gao");
		user.setPassword("123456");
		user.setGender(0);
		user.setAlias("MOMO");
		user.setPhone("18113063809");
		user.setQq("272409339");
		user.setWeibo("womeiyouweibo");
		SqlSession session = MybatisUtil.getSession();
		try {
//			assertEquals(1, userMapper.insertUser(user));
			System.out.println(user.toString());
			session.getMapper(UserMapper.class).insertUser(user);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		User user = new User();
		user.setUsername("gao6");
		user.setPassword("123456");
		user.setGender(0);
		user.setAlias("MOMO");
		user.setPhone("18113063809");
		user.setQq("272409339");
		user.setWeibo("womeiyouweibo");
		SqlSession session = MybatisUtil.getSession();
		try {
//			assertEquals(1, userMapper.insertUser(user));
			System.out.println(user.toString());
			session.getMapper(UserMapper.class).insertUser(user);
			session.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
