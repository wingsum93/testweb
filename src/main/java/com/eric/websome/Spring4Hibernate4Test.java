package com.eric.websome;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.eric.websome.dao.IPersonDao;
import com.eric.websome.normal.AppConfig;

public class Spring4Hibernate4Test {
	public static void main(String[] args) {
		  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	  	  ctx.register(AppConfig.class);
		  ctx.refresh();
		  IPersonDao pdao = ctx.getBean(IPersonDao.class);
		  pdao.savePerson();
		  System.out.println("Done");
	  }
}
