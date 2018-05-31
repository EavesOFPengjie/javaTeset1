package com.pj.mybatis.Btest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pj.mybatis.pojo.Emp;

public class Btest1 {
 public static void main(String[] args) throws IOException {
//	 String resource = "sqlMapConfig.xml";
//	 InputStream is  = Resources.getResourceAsStream(resource);
//	 SqlSessionFactory ssf= new SqlSessionFactoryBuilder().build(is);
//     SqlSession  ss =  ssf.openSession();
//     List<Emp> emplist = ss.selectList("findEmp");
//     for(Emp emp : emplist) {
//    	 System.out.println(emp.toString());
//     }
	 
	 String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Emp> empList = sqlSession.selectList("findEmp");
		 
		for(Emp emp :empList) {
			System.out.println(emp.toString());
		}
 }
}
