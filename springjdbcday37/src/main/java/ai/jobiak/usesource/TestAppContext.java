package ai.jobiak.usesource;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ai.jobiak.ifaces.BDigital;

public class TestAppContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext();
		 context.registerShutdownHook();
		 BDigital bDigital = (BDigital) context.getBean("bDigital");
		 bDigital.publish();
		 System.out.println(bDigital.hashCode());
		 //singleton design pattern , every servlet is a singleton
		 BDigital bDigital2 = (BDigital) context.getBean("bDigital");
		 bDigital2.publish();
		 System.out.println(bDigital2.hashCode());
		
		
		
		
	}

}
