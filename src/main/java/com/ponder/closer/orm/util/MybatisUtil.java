package com.ponder.closer.orm.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
	private static SqlSessionFactory sessionFactory;
	static {
//		String resource = "org/mybatis/example/mybatis-config.xml";
		String resource = "mybatis.cfg.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	//������ִ��ӳ���ļ���sql��sqlSession
	public static SqlSession getSession(){
		return sessionFactory.openSession();
	}
}
